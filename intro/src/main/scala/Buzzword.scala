import io.Source

/*
http://www.scala-lang.org/api/current/index.html
*/
object Buzzword extends App {
  val content = Source.fromFile("buzz.txt", "UTF-8")

  println("Hva er årets buzzword på JavaZone ?")
}