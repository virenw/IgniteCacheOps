import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.3"

  // https://mvnrepository.com/artifact/org.apache.ignite/ignite-core
  lazy val apacheIgnite = "org.apache.ignite" % "ignite-core" % "2.4.0"

  // https://mvnrepository.com/artifact/org.apache.ignite/ignite-spring
  lazy val igniteSpring = "org.apache.ignite" % "ignite-spring" % "2.4.0"
}
