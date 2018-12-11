object Hello extends App{
  println("Hello World !")

  val name: String = "Scala"
  //name = "Overwrite" // error
  println(name)

  lazy val lazyDate = {
    println("Initializing a date...")
    new java.util.Date
  }
  println(lazyDate)

  // Unit 戻り値 void
  def echo(str: String): Unit = println(str)
  echo("echo")

  // 戻り値の型推論
  def double(n: Int) = n * 2
  println(double(2))

  // function object
  def isAlphaNumeric(str: String) = str.matches("[a-zA-Z0-9\\s]+")
  val isAlphamericF = isAlphaNumeric _
  val words = Seq("Scala", "2.12")
  println(words.filter(isAlphamericF))
}
