import sbt._
object PluginDef extends Build {
  lazy val root = Project("plugins", file(".")) dependsOn( g8plugin )
  lazy val g8plugin =
    ProjectRef(uri("git://github.com/n8han/giter8#9c0f9fc"), "giter8-plugin")
}
