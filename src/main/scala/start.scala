
object start {

//  def main(args: Array[String
 def main(args: Array[String]): Unit = {

//   println("Enter the degrees in celcius")
//   val c = readLine()
//    val d= c.map(_.toDouble)

   converter(22.3)
   def converter(cdegrees: Double): Unit = {
     var fdegrees: Double = (cdegrees * 9 / 5) + 32
     println(fdegrees)

   }


   def datee(datesss:String): Unit = {

  val datess: Array[Int] = datesss.split("/").map(_.toInt)
     datess(1) match {
       case 1  => println(datess(0)+"th"+" January "+datess(2))
       case 2  => println(datess(0)+"th"+" February "+datess(2))
       case 3  => println(datess(0)+"th"+" March "+datess(2))
       case 4  => println(datess(0)+"th"+" April "+datess(2))
       case 5  => println(datess(0)+"th"+" may "+datess(2))
       case 6  => println(datess(0)+"th"+" June "+datess(2))
       case 7  => println(datess(0)+"th"+" July "+datess(2))
       case 8  => println(datess(0)+"th"+" August "+datess(2))
       case 9  => println(datess(0)+"th"+" September "+datess(2))
       case 10 => println(datess(0)+"th"+" October "+datess(2))
       case 11 => println(datess(0)+"th"+" November "+datess(2))
       case 12 => println(datess(0)+"th"+" December "+datess(2))


     }
   }
datee("01/08/1222")


   def extraction(st: String): Unit = {

     st.split(":").foreach(println)

   }
extraction("root:x:0:0:root:/root:/bin/bash")


 }
}
