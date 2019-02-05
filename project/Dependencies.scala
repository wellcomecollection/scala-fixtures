import sbt._

object Dependencies {

  lazy val versions = new {
    val grizzled = "1.3.2"
  }

  val loggingDependencies = Seq(
    "org.clapper" %% "grizzled-slf4j" % versions.grizzled,
  )

  val libraryDependencies = loggingDependencies
}
