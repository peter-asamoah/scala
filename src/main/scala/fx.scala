class fx(ID:Int,quantity:Int, initialPrice:Int) extends trade( ID,quantity, initialPrice)
{
   def isExecutable(): Unit = true

  override def toString = s"FXTrade($ID,$initialPrice )"
}
