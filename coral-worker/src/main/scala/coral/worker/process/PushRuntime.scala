package coral.worker.process

import coral.core.model.Sink
import coral.core.parser.Parser
import coral.core.source.Source


/**
  * Created by taoistwar on 2017/6/17.
  */
case class PushRuntime(taskId: String, source: Source, parser: Parser, sinks: List[Sink]) {

}
