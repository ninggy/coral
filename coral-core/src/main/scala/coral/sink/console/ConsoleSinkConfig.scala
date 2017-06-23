package coral.sink.console

import coral.sink.SinkConfig

/**
  * Created by taoistwar on 2017/6/18.
  */
case class ConsoleSinkConfig(override val id: String,
                             override val name: String)
  extends SinkConfig(id, name, "console") {

}
