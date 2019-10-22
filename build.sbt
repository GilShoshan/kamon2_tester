import sbt._
import sbt.Keys.libraryDependencies


  name := "kamon2_tester"

  version := "0.2"

  scalaVersion := "2.11.12"

  //libraryDependencies += "io.kamon" %% "kamon-bundle" % "2.0.1"
  //libraryDependencies += "io.kamon" %% "kamon-datadog" % "2.0.0"
  // https://mvnrepository.com/artifact/org.slf4j/slf4j-api

libraryDependencies += "io.kamon" %% "kamon-core" % "2.0.0" 
//libraryDependencies += "io.kamon" %% "kamon-status-page" % "2.0.1"
libraryDependencies += "io.kamon" %% "kamon-scala-future" % "2.0.1"

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.28" % Test

/*
  scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:implicitConversions",
  "-language:higherKinds",
  "-language:existentials",
  "-language:postfixOps",
  "-unchecked",
  "-Xfuture",
  "-Ydelambdafy:method",
  "-target:jvm-1.8",
  "-Ylog-classpath"
)
 */