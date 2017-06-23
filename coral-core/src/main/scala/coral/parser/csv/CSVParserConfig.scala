package coral.parser.csv

import coral.filter.FilterConfig
import coral.parser.ParserConfig

/**
  * Created by taoistwar on 2017/6/18.
  */
case class CSVParserConfig(override val id: String,
                           override val name: String,
                           override val filters: List[FilterConfig]) extends
  ParserConfig(id, name, "csv", filters) {

}
