package coral.parser

import coral.filter.FilterConfig

/**
  * Created by taoistwar on 2017/6/18.
  */
case class ParserConfig(id: String, name: String, `type`: String, filters: List[FilterConfig]) {

}
