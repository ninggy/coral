package coral.master

import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import coral.CoralApp
import coral.http.ApiApp
import coral.master.conf.Constants

/**
  * Created by taoistwar on 2017/6/16.
  */
object MasterApp extends CoralApp with ApiApp {
  implicit val system = createActorSystem("master")
  implicit val materializer = ActorMaterializer()
  implicit val executionContext = system.dispatcher

  val bindingFuture = Http().bindAndHandle(routes, Constants.HttpHost, Constants.HttpPort)
  println(s"Server online at http://localhost:${Constants.HttpPort}/")

  bindingFuture.failed.foreach { ex =>
    println(ex, "Failed to bind to {}:{}!", Constants.HttpHost, Constants.HttpPort)
  }

}
