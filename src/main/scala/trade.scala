import java.lang.reflect.Executable

abstract class trade(val ID:Int,val quantity:Int, var initialPrice:Int) {
  private var _price = initialPrice //initialPrice is constructor parameter
  def price = _price
  def setPrice(nprice:Int): Unit = if(nprice >=0) _price = nprice else{println("error")}
  def value():Double = quantity*_price
  def  isExecutable()







//object trade {
//
//    def apply(symbol: String): trade = {
//      symbol match {
//        case "GOOG" => new trade(23, "GOOG", 4, 5.5)
//        case "APPL" => new trade(76, "APPL", 6, 6.5)
//        case "IBM" => new trade(8, "GOOG", 2, 7.5)
//        case _ => new trade(638, "GHA", 0, 0)
//      }
//    }



  override def toString = s"trade($ID, $initialPrice)"
}
