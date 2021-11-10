import org.scalatest.funsuite.AnyFunSuite

class libraryTest extends AnyFunSuite {
  val kwame = new Member("kwame",MembershipLevel.regular)
  test("testApplica") {
    val librarydata = new library(kwame)
println(librarydata)
  }

  test("testToString") {
    println(kwame)
  }

}
