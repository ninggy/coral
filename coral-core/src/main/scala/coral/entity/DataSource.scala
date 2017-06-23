package coral.entity

import coral.parser.ParserConfig
import coral.sink.SinkConfig
import coral.source.SourceConfig

/**
  * Created by taoistwar on 2017/6/18.
  */
case class DataSource(id: String,
                      name: String,
                      source: SourceConfig,
                      parser: ParserConfig,
                      sinks: List[SinkConfig]) {

}
