import org.scalatest.funsuite.AnyFunSuite

class transactionTest extends AnyFunSuite {

  val testing = new transaction(12, 10, 125,"APPL")

  test("testAmount") {

    assert(testing.amount==142.5)
  }

}
