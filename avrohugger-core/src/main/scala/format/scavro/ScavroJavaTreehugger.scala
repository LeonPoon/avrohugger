package avrohugger
package format
package scavro

import format.abstractions.JavaTreehugger
import stores.ClassStore
import org.apache.avro.Schema


object ScavroJavaTreehugger extends JavaTreehugger {

  @deprecated("Scavro will no longer be supported", "avrohugger 1.5.0")
  def asJavaCodeString(
    classStore: ClassStore,
    namespace: Option[String],
    schema: Schema): String = {

    // Avro's SpecificCompiler only writes files, but we need a string
    // so write the Java file and read
    val tempDir = createTempDir("avrohugger_scavro")
    writeJavaTempFile(schema, tempDir)
    val tempPath = s"$tempDir/${schema.getFullName.replace('.','/')}.java"
    val fileContents = scala.io.Source.fromFile(tempPath)
    val schemaPackage = "package " + schema.getNamespace
    val updatedPackage = namespace match {
      case Some(ns) => "package " + ns
      case None => ""
    }
    val schemaNamespace = """\"namespace\":\"""" +schema.getNamespace+ """\","""
    val updatedNamespace = namespace match {
      case Some(ns) => """\"namespace\":\"""" + ns + """\","""
      case None => ""
    }
    val codeString = fileContents.mkString
      .replace(schemaPackage, updatedPackage)
      .replace(schemaNamespace, updatedNamespace)
    fileContents.close
    deleteTempDirOnExit(tempDir)
    codeString
  }

}
