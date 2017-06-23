package coral.conf

import com.typesafe.config.{Config, ConfigFactory}

import scala.util.Try

/**
  * Created by taoistwar on 2017/6/16.
  */
trait Constants {
  def config: Config

  def getInt(key: String, defaultValue: Int): Int = Try {
    config.getInt(key)
  }.getOrElse(defaultValue)

  def getString(key: String, defaultValue: String = null): String = Try {
    config.getString(key)
  }.getOrElse(defaultValue)

}
