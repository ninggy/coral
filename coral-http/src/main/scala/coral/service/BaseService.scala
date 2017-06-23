package coral.service

import coral.http.entity.Asset

/**
  * Created by taoistwar on 2017/6/18.
  */
trait BaseService[T, ID] {
  def query(id: ID): T


  def all: List[T]

  def retrieve(page: Int, size: Int, order: String = null)

  def delete(id: ID)

  def create(entity: T): Boolean

  def update(entity: T): Int

  def merge(entity: T): Int

}
