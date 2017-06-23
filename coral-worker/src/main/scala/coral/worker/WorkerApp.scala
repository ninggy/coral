package coral.worker

import akka.actor.Props
import coral.CoralApp
import coral.actor.Processor
import coral.entity.{DataSource, Result}
import coral.parser.{Parser, ParserConfig}
import coral.parser.csv.CSVParserConfig
import coral.sink.SinkConfig
import coral.sink.console.ConsoleSinkConfig
import coral.source.file.FileSourceConfig
import coral.source.{Source, SourceConfig}
import coral.worker.conf.Constants


/**
  * Created by taoistwar on 2017/6/16.
  */
object WorkerApp extends CoralApp {
  implicit val system = createActorSystem("worker")


  // linked

  // chain
  // single
  val parser = CSVParserConfig("1", "iis", Nil)
  val source = FileSourceConfig("1", "file source", "d:/logs/", "utf-8")
  val sinks = List(ConsoleSinkConfig("1", "console sink"))
  val task = DataSource("1", "file source", source, parser, sinks)
  startTask(task)

  def startTask(ds: DataSource): Result = {

    system.actorOf(Props.create(classOf[Processor], ds))
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
    Constants.getString("coral.source." + config.`type`) match {
      case null | "" =>
        null
      case className =>
        Class.forName(className).
          getConstructor(config.getClass).
          newInstance(config).asInstanceOf[Source]
    }
  }

  private def instance(config: ParserConfig): Parser = {
    Constants.getString("coral.parser." + config.`type`) match {
      case null | "" =>
        null
      case className =>
        Class.forName(className).
          getConstructor(config.getClass).
          newInstance(config).asInstanceOf[Parser]
    }
  }

  private def instance(config: SinkConfig): Source = {
    Constants.getString("coral.sink." + config.`type`) match {
      case null | "" =>
        null
      case className =>
        Class.forName(className).
          getConstructor(config.getClass).
          newInstance(config).asInstanceOf[Source]
    }
  }

}
