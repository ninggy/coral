package coral.source

import coral.entity.Result
import coral.module.Module

/**
  * Created by taoistwar on 2017/6/18.
  */
abstract class Source(config: SourceConfig) extends Module("source", "数据来源") {

  def start: Result

  def stop: Result
}
