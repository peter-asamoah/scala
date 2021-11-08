
object monday {
  def main(args: Array[String]): Unit = {
    println("Hello world to scala")
  myfunction
  }

  def myfunction: Unit = {
    println("Depressed")

    var me = 10
        me += 30
    println(me)

    val name = "Your name"
    val lname = "lname"
    println(name+" "+lname)

    val z = {val a = 5; a+10}
    //z:Int =8
    println(z)

    var mew: Int =8
   mew += 20

    println(mew + z)


    def pierre(i:Int) = i*20

    println( pierre(20))

    def poerro(stringing: String*): Unit = {
      println(stringing.map(_.toUpperCase()))
    }
    poerro("one","three")

    def poerros(stringing: String): Unit = {
      println(stringing.map(_.toUpper))
    }
    poerros("one")

    def greetings()= println("Hello worldly")

    greetings()



  }



}


//Java String name = "Peter"
// Scala name:String = "Peter"