class trade(val ID:Int,val symbol:String,val quantity:Int, var price:Double) {
  def getprice(): Double = price

  def setPrice(nprice:Double): Unit = if(nprice >0){price =nprice}else{println("error")}



  override def toString = s"trade($ID, $symbol, $quantity, $price)"

  object trade {

  }


}
