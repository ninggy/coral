package coral.entity

/**
  * Created by taoistwar on 2017/6/16.
  */
case class Asset(override val id: String, name: String,
                 ip: String,
                 mac: String,
                 assetTypeId: String,
                 deviceType: String = null, // 笔记本、台式机、服务器、手机、平板、
                 os: String = null, // 操作系统
                 description: String = null
                ) extends BaseEntity[String](id)