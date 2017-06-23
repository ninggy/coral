package coral.http.entity

import coral.sink.{Sink, SinkConfig}
import coral.source.SourceConfig


/**
  * Created by taoistwar on 2017/6/18.
  */
case class DataSource(id: String,
                      name: String,
                      sourceId: String,
                      sinkIds: List[String]
                     ) {

}