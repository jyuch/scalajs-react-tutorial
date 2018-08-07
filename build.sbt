enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.github.jyuch",
      scalaVersion := "2.12.6",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "scalajs-react-tutorial",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
      "com.github.japgolly.scalajs-react" %%% "core" % "1.2.3"
    ),
    npmDependencies in Compile ++= Seq(
      "react" -> "16.2.0",
      "react-dom" -> "16.2.1"
    ),
    useYarn := true
  )
