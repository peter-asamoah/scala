class equity(ID:Int, symbol:String, quantity:Int, initialPrice:Int) extends trade( ID,quantity,initialPrice)
  {

    def isExecutable(): Unit = false

    override def toString = s"equityTrade($ID,$symbol,$quantity,$initialPrice )"
  }
