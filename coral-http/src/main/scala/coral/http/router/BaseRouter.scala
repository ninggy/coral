package coral.http.router

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

/**
  * Created by taoistwar on 2017/6/18.
  */
trait BaseRouter[T] {
  def uri: String

  def getRoute: Route

  def pagerRoute: Route

  def postRoute: Route

  def putRoute: Route

  def deleteRoute: Route

  def route: Route = getRoute ~ pagerRoute ~ postRoute ~ putRoute ~ deleteRoute
}
