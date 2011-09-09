import io.Source

/*
http://www.scala-lang.org/api/current/index.html
*/
object Buzzword extends App {
  val content = Source.fromFile("buzz.txt", "UTF-8")

  val words = for {
    line <- content.getLines()
    word <- line.split("[\\s\\,\\.\\-]") if (word != "")
  } yield word

  val buzzwords = words.toList.groupBy(_.toLowerCase).mapValues(_.size).toList.sortBy(_._2)

  println("Hva er årets buzzword på JavaZone ?")
  buzzwords.foreach(println)

  println("Buzzword Fight!")
  val buzzes = buzzwords.toMap
  val buzz1 = buzzes.get(Console.readLine("Buzzword 1: ").toLowerCase).getOrElse(0)
  val buzz2 = buzzes.get(Console.readLine("Buzzword 2: ").toLowerCase).getOrElse(0)

  println(if (buzz1 == buzz2) "It's a tie!" else (if (buzz1 > buzz2) "Buzzword 1 wins!" else "Buzzword 2 wins!"))
}