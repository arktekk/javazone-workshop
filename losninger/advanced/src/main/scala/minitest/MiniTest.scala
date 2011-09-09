package minitest

import collection.mutable.ListBuffer

sealed trait Result
case object Success extends Result
case class Failure(error:String) extends Result
case class Pending(reason: String) extends Result

case class Test(name:String, result: Result)

trait BeforeAndAfter {

  private val befores:ListBuffer[() => Unit] = ListBuffer()
  private val afters:ListBuffer[() => Unit] = ListBuffer()

  protected def before(b: => Unit) {
    befores += b _
  }

  protected def runBefores() {
    befores.foreach(_())
  }

  protected def after(a: => Unit) {
    afters += a _
  }

  protected def runAfters() {
    afters.foreach(_())
  }
}

trait MiniTest extends BeforeAndAfter {

  var tests:ListBuffer[Test] = ListBuffer()

  case class AssertSyntax[A](a: A) {
    def ===(other: A) = assertEq(a, other)
    def !==(other: A) = assertNotEq(a, other)
  }

  implicit def pimpSyntax[A](a: A) = AssertSyntax(a)

  def assertNotEq[A](a1: A, a2: A) = {
    if (a1 != a2) Success
    else Failure(a1 + " equals " + a2)
  }

  def assertEq[A](a1: A, a2: A) = {
    if (a1 == a2) Success
    else Failure(a1 + " does not equal " + a2)
  }

  def pending(reason: String) = Pending(reason)

  def test(name:String)(assertion: => Result) {
    val result = try {
      runBefores()
      val r = assertion
      runAfters()
      r
    } catch {
      case e => Failure(e.getMessage)
    }
    tests = tests + Test(name, result)
  }

  def run() {
    tests.foreach { t =>
      println(t.name + " " + (t.result match {
        case Success          => "SUCCESS!"
        case Failure(error)   => "FAILURE! " + error
        case Pending(reason)  => "PENDING! " + reason
      }))
    }
  }
}
