package coral.source.file

import coral.parser.ParserConfig
import coral.source.SourceConfig

/**
  * Created by taoistwar on 2017/6/18.
  */
case class FileSourceConfig(override val id: String,
                            override val name: String,
                            root: String,
                            encoding: String)
  extends SourceConfig(id, name, "file") {

}
