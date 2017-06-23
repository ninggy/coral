package coral.actor

import akka.actor.Actor
import coral.conf.CommonConstants
import coral.entity.{DataSource, Result}
import coral.parser.{Parser, ParserConfig}
import coral.sink.{Sink, SinkConfig}
import coral.source.{Source, SourceConfig}

/**
  * Created by taoistwar on 2017/6/19.
  */
class Processor(ds: DataSource)
  extends Actor {

  override def receive: Receive = {
    case "start" =>
      start()
  }

  def start(): Result = {
    // TODO validate data source
    // start
    val res = validate(ds)

    if (res._1.status != 200) {
      res._1
    } else {
      val source = res._2
      val parser = res._3
      val sinks = res._4;




      res._1
    }
  }

  def validate(ds: DataSource): (Result, Source, Parser, Unit) = {
    val source = instance(ds.source)
    val parser = instance(ds.parser)
    val sinks = ds.sinks foreach (instance(_))
    (Result(200), source, parser, sinks)
  }

  private def instance(config: SourceConfig): Source = {
    CommonConstants.getString("coral.source." + config.`type`) match {
      case null | "" =>
        null
      case className =>
        Class.forName(className).
          getConstructor(config.getClass).
          newInstance(config).asInstanceOf[Source]
    }
  }

  private def instance(config: ParserConfig): Parser = {
    CommonConstants.getString("coral.parser." + config.`type`) match {
      case null | "" =>
        null
      case className =>
        Class.forName(className).
          getConstructor(config.getClass).
          newInstance(config).asInstanceOf[Parser]
    }
  }

  private def instance(config: SinkConfig): Source = {
    CommonConstants.getString("coral.sink." + config.`type`) match {
      case null | "" =>
        null
      case className =>
        Class.forName(className).
          getConstructor(config.getClass).
          newInstance(config).asInstanceOf[Source]
    }
  }
}
