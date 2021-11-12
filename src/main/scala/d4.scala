
class d4{
  def function1(arg: String, x: Int, y: Int): Int = {
    arg match {
      case "add" => add(x, y)
      case "subtract" => subtract(x, y)
      case "power" => power(x, y)
    }
  }

    def add(x: Int, y: Int): Int = x + y

    def subtract(x: Int, y: Int): Int = x - y

    def power(x: Int, y: Int): Int = scala.math.pow(x,y).toInt

}