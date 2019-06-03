package config

import com.typesafe.config.Config

case class AppConfig(
    dao: DaoConfig
)

object AppConfig {
  def loadFrom(config: Config): AppConfig = AppConfig(
    DaoConfig()
  )
}
