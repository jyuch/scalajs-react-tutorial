package react4s

import org.scalajs.dom.document
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

object Hello {
  val playground = document.getElementById("playground")

  def main(args: Array[String]): Unit = {
    val NoArgs =
      ScalaComponent.builder[Unit]("No args")
        .renderStatic(<.div("Hello World"))
        .build

    NoArgs().renderIntoDOM(playground)
  }
}
