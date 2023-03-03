ThisBuild / version := "0.3.6"
ThisBuild / scalaVersion := "2.12.17"
ThisBuild / organization := "com.hillel"

Test / parallelExecution := false

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "3.3.0" % "provided",
    "org.apache.spark" %% "spark-sql" % "3.3.0" % "provided",
    "org.scalatest" %% "scalatest" % "3.2.13" % "test",
    "com.holdenkarau" %% "spark-testing-base" % "3.3.0_1.4.0" % "test"
)

// include the 'provided' Spark dependency on the classpath for `sbt run`
Compile / run := Defaults.runTask(Compile / fullClasspath, Compile / run / mainClass, Compile / run / runner).evaluated
