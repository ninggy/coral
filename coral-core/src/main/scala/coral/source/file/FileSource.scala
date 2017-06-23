package coral.source.file

import coral.entity.Result
import coral.source.Source

/**
  * Created by taoistwar on 2017/6/18.
  */
class FileSource(config:FileSourceConfig) extends Source(config){
  override def start: Result = {
    null
  }

  override def stop: Result = {
    null
  }
}
