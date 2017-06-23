package coral.source.net

import com.typesafe.config.Config
import coral.entity.Result
import coral.source.Source


/**
  * Created by taoistwar on 2017/6/18.
  */
class NetSource(config: NetConfig) extends Source(config) {
  override def start: Result = {
    null
  }

  override def stop: Result = {
    null
  }
}
