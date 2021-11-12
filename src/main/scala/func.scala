import java.io.File



object func extends App{
val rawFiles = new File(".").listFiles
//  for file <- files do println(file)



  val names = rawFiles.map(_.getName).filter(!_.startsWith("."))

  val normalFiles = rawFiles.filter(_.isFile).map(_.getName)

  val directories = rawFiles.filter(_.isDirectory).map(_.getName)

  normalFiles.foreach(println)
  println("======")
  directories.foreach(println)





}
