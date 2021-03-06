package coral.worker.process

import akka.actor.Actor
import akka.actor.Actor.Receive
import akka.remote.ContainerFormats.ActorRef

import scala.collection.mutable.HashMap

/**
  * Created by taoistwar on 2017/6/17.
  */
class PullActor extends Actor {
  val taskMaps = new HashMap[String, ActorRef] //value : SourceActor

  def startTask(id: String): Unit = {

  }

  def stopTask(id: String): Unit = {

  }

  override def receive: Receive = {
    case ("start", id: String) =>
      startTask(id)
    case ("stop", id: String) =>
      stopTask(id)
  }
}
