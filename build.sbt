import _root_.sbt.Keys._

name := "scala"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions := Seq(
  "-encoding", "utf8",
  "-feature",
  "-unchecked",
  "-deprecation",
  "-target:jvm-1.8",
  "-Ymacro-debug-lite",
  "-language:_",
  "-Xexperimental")