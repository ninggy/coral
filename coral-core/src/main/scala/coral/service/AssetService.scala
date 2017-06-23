package coral.service

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.stream.ActorMaterializer
import coral.http.entity.Asset

import scala.io.StdIn
/**
  * Created by taoistwar on 2017/6/18.
  */
trait AssetService extends BaseService[Asset, String] {

}