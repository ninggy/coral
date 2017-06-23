package coral.master.conf

import com.typesafe.config.{Config, ConfigFactory}
import coral.conf.Constants

import scala.util.Try

/**
  * Created by taoistwar on 2017/6/16.
  */
object Constants extends Constants {
  val cfg: Config = ConfigFactory.load("worker.conf")

  def config = cfg

  def HttpPort = getInt("rest.port", 8080)

  def HttpHost = getString("rest.host", "0.0.0.0")
}
