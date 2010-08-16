import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val giter8 = "net.databinder" % "giter8-plugin" % "$giter8_version$"
}
