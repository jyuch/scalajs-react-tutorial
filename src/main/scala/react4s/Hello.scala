package react4s

object Hello extends Greeting {
  def main(args: Array[String]): Unit = {
    println(greeting)
  }
}

trait Greeting {
  lazy val greeting: String = "Hello world"
}
