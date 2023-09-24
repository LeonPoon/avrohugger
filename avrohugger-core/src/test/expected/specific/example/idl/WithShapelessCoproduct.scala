/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package example.idl

import scala.annotation.switch

import shapeless.{:+:, CNil, Coproduct}

case class Event1() extends org.apache.avro.specific.SpecificRecordBase {
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.Event1.SCHEMA$
}

object Event1 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event1\",\"namespace\":\"example.idl\",\"fields\":[]}")
}

case class Event2() extends org.apache.avro.specific.SpecificRecordBase {
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.Event2.SCHEMA$
}

object Event2 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event2\",\"namespace\":\"example.idl\",\"fields\":[]}")
}

case class Event3() extends org.apache.avro.specific.SpecificRecordBase {
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.Event3.SCHEMA$
}

object Event3 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event3\",\"namespace\":\"example.idl\",\"fields\":[]}")
}

case class Event4() extends org.apache.avro.specific.SpecificRecordBase {
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.Event4.SCHEMA$
}

object Event4 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event4\",\"namespace\":\"example.idl\",\"fields\":[]}")
}

final case class ShouldRenderAsOption(var value: Option[example.idl.Event1]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        value match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.value = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[example.idl.Event1]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.ShouldRenderAsOption.SCHEMA$
}

object ShouldRenderAsOption {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShouldRenderAsOption\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Event1\",\"fields\":[]}]}]}")
  object types {
    type value = Option[example.idl.Event1]
  }
}

final case class ShouldRenderAsOption2(var value: Option[example.idl.Event1]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        value match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.value = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[example.idl.Event1]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.ShouldRenderAsOption2.SCHEMA$
}

object ShouldRenderAsOption2 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShouldRenderAsOption2\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"record\",\"name\":\"Event1\",\"fields\":[]},\"null\"]}]}")
  object types {
    type value = Option[example.idl.Event1]
  }
}

final case class ShouldRenderAsOptionEither(var value: Option[Either[example.idl.Event1, example.idl.Event2]]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        value match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.value = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Either[example.idl.Event1, example.idl.Event2]]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.ShouldRenderAsOptionEither.SCHEMA$
}

object ShouldRenderAsOptionEither {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShouldRenderAsOptionEither\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Event1\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event2\",\"fields\":[]}]}]}")
  object types {
    type value = Option[Either[example.idl.Event1, example.idl.Event2]]
  }
}

final case class ShouldRenderAsOptionEither2(var value: Option[Either[example.idl.Event1, example.idl.Event2]]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        value match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.value = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Either[example.idl.Event1, example.idl.Event2]]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.ShouldRenderAsOptionEither2.SCHEMA$
}

object ShouldRenderAsOptionEither2 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShouldRenderAsOptionEither2\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"record\",\"name\":\"Event1\",\"fields\":[]},\"null\",{\"type\":\"record\",\"name\":\"Event2\",\"fields\":[]}]}]}")
  object types {
    type value = Option[Either[example.idl.Event1, example.idl.Event2]]
  }
}

final case class ShouldRenderAsOptionEither3(var value: Option[Either[example.idl.Event1, example.idl.Event2]]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        value match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.value = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Either[example.idl.Event1, example.idl.Event2]]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.ShouldRenderAsOptionEither3.SCHEMA$
}

object ShouldRenderAsOptionEither3 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShouldRenderAsOptionEither3\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"record\",\"name\":\"Event1\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event2\",\"fields\":[]},\"null\"]}]}")
  object types {
    type value = Option[Either[example.idl.Event1, example.idl.Event2]]
  }
}

final case class ShouldRenderAsOptionCoproduct(var value: Option[example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: CNil]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        value match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.value = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: CNil]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.ShouldRenderAsOptionCoproduct.SCHEMA$
}

object ShouldRenderAsOptionCoproduct {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShouldRenderAsOptionCoproduct\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Event1\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event2\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event3\",\"fields\":[]}]}]}")
  object types {
    type value = Option[example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: CNil]
  }
}

final case class ShouldRenderAsOptionCoproduct2(var value: Option[example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: CNil]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        value match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.value = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: CNil]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.ShouldRenderAsOptionCoproduct2.SCHEMA$
}

object ShouldRenderAsOptionCoproduct2 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShouldRenderAsOptionCoproduct2\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"record\",\"name\":\"Event1\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event2\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event3\",\"fields\":[]},\"null\"]}]}")
  object types {
    type value = Option[example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: CNil]
  }
}

final case class ShouldRenderAsOptionCoproduct3(var value: Option[example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: CNil]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        value match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.value = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: CNil]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.ShouldRenderAsOptionCoproduct3.SCHEMA$
}

object ShouldRenderAsOptionCoproduct3 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShouldRenderAsOptionCoproduct3\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"record\",\"name\":\"Event1\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event2\",\"fields\":[]},\"null\",{\"type\":\"record\",\"name\":\"Event3\",\"fields\":[]}]}]}")
  object types {
    type value = Option[example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: CNil]
  }
}

final case class ShouldRenderAsEither(var value: Either[example.idl.Event1, example.idl.Event2]) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(Left(new Event1))
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        value
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.value = {
        value
      }.asInstanceOf[Either[example.idl.Event1, example.idl.Event2]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.ShouldRenderAsEither.SCHEMA$
}

object ShouldRenderAsEither {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShouldRenderAsEither\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"record\",\"name\":\"Event1\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event2\",\"fields\":[]}]}]}")
  object types {
    type value = Either[example.idl.Event1, example.idl.Event2]
  }
}

final case class ShouldRenderAsCoproduct(var value: example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: example.idl.Event4 :+: CNil) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(shapeless.Coproduct[example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: example.idl.Event4 :+: CNil](new Event1))
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        value
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.value = {
        value
      }.asInstanceOf[example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: example.idl.Event4 :+: CNil]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.ShouldRenderAsCoproduct.SCHEMA$
}

object ShouldRenderAsCoproduct {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShouldRenderAsCoproduct\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"record\",\"name\":\"Event1\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event2\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event3\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event4\",\"fields\":[]}]}]}")
  object types {
    type value = example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: example.idl.Event4 :+: CNil
  }
}

final case class ShouldRenderAsCoproduct2(var value: example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: example.idl.Event4 :+: CNil) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(shapeless.Coproduct[example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: example.idl.Event4 :+: CNil](new Event1))
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        value
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.value = {
        value
      }.asInstanceOf[example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: example.idl.Event4 :+: CNil]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = example.idl.ShouldRenderAsCoproduct2.SCHEMA$
}

object ShouldRenderAsCoproduct2 {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShouldRenderAsCoproduct2\",\"namespace\":\"example.idl\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"record\",\"name\":\"Event1\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event2\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event3\",\"fields\":[]},{\"type\":\"record\",\"name\":\"Event4\",\"fields\":[]}]}]}")
  object types {
    type value = example.idl.Event1 :+: example.idl.Event2 :+: example.idl.Event3 :+: example.idl.Event4 :+: CNil
  }
}