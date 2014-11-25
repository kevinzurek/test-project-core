name := """project-core"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)dependsOn(projectModule)
lazy val projectModule = RootProject(
uri("git://github.com/kevinzurek/test-project-module")
)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
