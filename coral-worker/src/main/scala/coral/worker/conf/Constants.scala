package coral.worker.conf

import com.typesafe.config.{Config, ConfigFactory}

/**
  * Created by taoistwar on 2017/6/16.
  */
object WorkerConstants extends coral.conf.Constants {
  val workerConfig = ConfigFactory.load("worker.conf")

  override def config: Config = workerConfig
}
