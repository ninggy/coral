package coral.http.router

import coral.http.router.AssetRouter
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.marshallers.xml.ScalaXmlSupport.defaultNodeSeqMarshaller

/**
  * Created by taoistwar on 2017/6/18.
  */
trait CoralRouter {
  def routes = indexRouter ~ AssetRouter().route


  def indexRouter = pathEndOrSingleSlash {
    complete {
      <html>
        <head>
          <title>index</title>
        </head>
        <body>
          index
        </body>
      </html>
    }
  }
}
