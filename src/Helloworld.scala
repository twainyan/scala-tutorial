/**
  * Created by tweinyan on 27/11/2017.
  */
object Helloworld {
  def main(args: Array[String]): Unit = {
    def printPrimes(): Unit ={
      val primeList = List(1,2,3,5,7,11)
      for(i <- primeList) {
        if(i == 11) {
          return
        }

        if(i != 1){
          println(i)
        }
      }
    }
    printPrimes
  }
}
