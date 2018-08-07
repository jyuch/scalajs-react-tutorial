enablePlugins(ScalaJSPlugin)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.github.jyuch",
      scalaVersion := "2.12.6",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "scalajs-react-tutorial",
    scalaJSUseMainModuleInitializer := true
  )
