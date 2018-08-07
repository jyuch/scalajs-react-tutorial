package react4s

import org.scalajs.dom.document
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

object Hello {
  val playground = document.getElementById("playground")

  def main(args: Array[String]): Unit = {
    val Example = ScalaComponent.builder[Unit]("Example")
      .initialState(State("", List("Hello World")))
      .renderBackend[Backend].build

    Example().renderIntoDOM(playground)
  }

  case class State(item: String, items: List[String])

  class Backend($: BackendScope[Unit, State]) {
    def render(s: State): VdomElement = {
      <.div(
        <.form(^.onSubmit ==> handleSubmit,
          <.input(^.onChange ==> onChange, ^.value := s.item),
          <.button("Add item")
        ),
        <.ul(
          s.items map { it => <.li(it) }: _*
        )
      )
    }

    def handleSubmit(e: ReactEventFromInput): Callback = {
      e.preventDefaultCB >> $.modState(s => State("", s.item :: s.items))
    }

    def onChange(e: ReactEventFromInput): Callback = {
      val v = e.target.value
      $.modState(_.copy(item = v))
    }
  }

}
