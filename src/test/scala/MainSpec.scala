import Main.calculateNumber
import org.scalatest._

class MainSpec extends FlatSpec with Matchers {

  "Returns the grammatically correct English phrase" should "for number '21'" in {
    val result = calculateNumber(21)
    result shouldEqual "twenty-one"
  }

  it should "for number '111'" in {
    val result = calculateNumber(111)
    result shouldEqual "one hundred and eleven"
  }

}