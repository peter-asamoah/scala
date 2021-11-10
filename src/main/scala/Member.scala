import MembershipLevel.MembershipLevel

class Member(val name: String,val level: MembershipLevel) {
  override def toString = s"Name: $name ,Membership Level: $level"


}