package coral

import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory

/**
  * Created by taoistwar on 2017/6/16.
  */
trait CoralApp extends App {
  def createActorSystem(name: String = "coral") = {
    val config = ConfigFactory.load("application.conf")
    ActorSystem(name, config)
  }

}
