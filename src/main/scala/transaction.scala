class transaction(quantity:Int, initialPrice:Int,ID:Int,symbol:String) extends equity( ID,symbol,quantity, initialPrice) with FeePayable with Taxable {
var amounts =value()
  def amount:Double= amounts+flatfee+taxrate


}


