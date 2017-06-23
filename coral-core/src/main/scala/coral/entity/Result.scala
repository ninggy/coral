package coral.entity

import scala.beans.BeanProperty

/**
  * Created by taoistwar on 2017/6/17.
  */
case class Result(@BeanProperty status: Int,
                  @BeanProperty message: String = null)