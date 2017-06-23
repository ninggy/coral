package coral.http.router

import akka.http.scaladsl.coding.Deflate
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import coral.http.entity.Asset

/**
  * Created by taoistwar on 2017/6/18.
  */
case class AssetRouter() extends BaseRouter[Asset] {
  override def uri: String = "asset"

  override def getRoute: Route = path(uri) {
    encodeResponseWith(Deflate) {
      complete {
        ""
      }
    }
  }

  override def pagerRoute: Route = path(uri) {
    get {
      complete {
        ""
      }
    }
  }

  override def postRoute: Route = path(uri) {
    get(decodeRequest(

      complete {
        ""
      }
    ))
  }

  override def putRoute: Route = path(uri) {
    get {
      complete {
        ""
      }
    }
  }

  override def deleteRoute: Route = path(uri) {
    delete {
      complete {
        ""
      }
    }
  }
}
