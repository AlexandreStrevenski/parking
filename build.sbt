import play.sbt.PlayJava

name := """parking"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  javaJpa,
  cache,
  javaWs,
  "org.hibernate" % "hibernate-entitymanager" % "5.2.5.Final" exclude("dom4j", "dom4j"),
  "mysql" % "mysql-connector-java" % "6.0.5",
  "dom4j" % "dom4j" % "1.6.1" intransitive(),
  "com.adrianhurt"% "play-bootstrap_2.11" % "1.0-P25-B3"
)

libraryDependencies += evolutions

fork in run := true

PlayKeys.externalizeResources := false

javaOptions in Test += "-Dconfig.file=conf/application.test.conf"
