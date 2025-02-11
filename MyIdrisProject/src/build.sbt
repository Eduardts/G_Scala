name := "secure-ml-platform"
version := "1.0"
scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % "2.6.19",
  "com.typesafe.akka" %% "akka-cluster" % "2.6.19",
  "org.apache.spark" %% "spark-core" % "3.2.1",
  "org.apache.spark" %% "spark-mllib" % "3.2.1",
  "io.circe" %% "circe-core" % "0.14.1",
  "io.circe" %% "circe-generic" % "0.14.1"
)
