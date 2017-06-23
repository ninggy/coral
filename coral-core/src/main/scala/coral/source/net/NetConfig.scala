package coral.source.net

import coral.parser.ParserConfig
import coral.source.SourceConfig

/**
  * Created by taoistwar on 2017/6/18.
  */
case class NetConfig(override val id: String,
                     override val name: String,
                     protocol: String,
                     foramt: String,
                     port: Int,
                     override val parser: ParserConfig
                    ) extends SourceConfig(id, name, "net", parser)
