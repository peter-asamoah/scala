class library (member: Member){
  override def toString = s"The maximum number of books tat can be borrowed is $applica"

  def applica: String
    = {
      member.level match {
        case MembershipLevel.junior => "60"
        case MembershipLevel.regular =>"25"
        case MembershipLevel.senior =>"33"
      }
  }


}



















//class library (name:String,age:Int,membership:String){
//  def applica(membership:String): Unit
//  = {
//    membership match {
//      case "regular" =>
//      case "junior" =>
//      case "senior" =>
//    }
//
//
//
//  }
//
//}
