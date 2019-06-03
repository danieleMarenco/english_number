object Main {

  def start(): Unit = {

    while (true) {
      print("insert a number -> ")
      val a = scala.io.StdIn.readInt()
      println( "   * " +calculateNumber(a))
    }
  }

  def main(args: Array[String]): Unit = {
    Main.start()
  }

  def mainConstants(a: Int): String = a match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case 4 => "four"
    case 5 => "five"
    case 6 => "six"
    case 7 => "seven"
    case 8 => "eight"
    case 9 => "nine"
  }

  def calculationTens(fist: Int): String = fist match {
    case 20 => "twenty"
    case 30 => "thirty"
    case 40 => "fourty"
    case 50 => "fifty"
    case 60 => "sixty"
    case 70 => "seventy"
    case 80 => "eighty"
    case 90 => "ninety"
  }

  def form20to100(a: Int): String = {

    a.toString.map(_.asDigit) match {
      case Seq(first, second) if second == 0 =>
        //80 -> eighty
        calculationTens(first * 10)

      case Seq(first, second) =>
        //88 -> eighty-eight
        calculationTens(first * 10) + "-" + mainConstants(second)
    }
  }

  def from16to19(a: Int): String = {
    //14 -> four + "teen"
    a.toString.map(_.asDigit) match {
      case Seq(_, second) if second == 8 => mainConstants(second) + "een"
      case Seq(_, second) => mainConstants(second) + "teen"

    }
  }

  def between100and999(a: Int): String = {
    a.toString.map(_.asDigit) match {
      case Seq(first, second, third) => {
        val secondPart = calculateNumber(
          (second.toString ++ third.toString).toInt)
        if (secondPart != "NOT implemented")
          mainConstants(first) + " hundred and " + secondPart
        else
          mainConstants(first) + " hundred"
      }
    }

  }

  def calculateNumber(a: Int): String = a match {
    case ten if (1 to 9) contains ten =>
      mainConstants(ten)
    case 10 => "ten"
    case 11 => "eleven"
    case 12 => "twelve"
    case 13 => "thirteen"
    case 14 => from16to19(a)
    case 15 => "fifteen"
    case between16and19 if (16 to 19) contains between16and19 =>
      from16to19(between16and19)
    case between20and99 if (20 to 99) contains between20and99 =>
      form20to100(between20and99)
    case lastPart if (100 to 999) contains lastPart =>
      between100and999(lastPart)

    case _ => "NOT implemented"
  }
}
