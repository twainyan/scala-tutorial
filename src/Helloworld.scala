/**
  * Created by tweinyan on 27/11/2017.
  */
object Helloworld {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5; j <- 6 to 10) {
      println("i: " + i)
      println("j: " + j)
    }
  }
}
