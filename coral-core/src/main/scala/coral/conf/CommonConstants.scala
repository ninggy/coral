package coral.conf

import com.typesafe.config.{Config, ConfigFactory}

import scala.util.Try

/**
  * Created by taoistwar on 2017/6/16.
  */
object CommonConstants extends Constants {
  val common = ConfigFactory.load("common.conf")

  override def config: Config = common
}
