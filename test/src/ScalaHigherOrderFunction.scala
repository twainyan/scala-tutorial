/**
  * Created by tweinyan on 29/11/2017.
  */
import scala.math._

object ScalaHigherOrderFunction {
  def main(args: Array[String]): Unit = {
    val log10Func = log10 _
    println(log10Func(1000))
    List(1000.0, 10000.0).map(log10Func).foreach(println)
    List(1,2,3,4,5).map((x: Int) => sqrt(x)).foreach(println)
    List(1,2,3,4,5).filter(_ % 2 == 0).foreach(println)

    println("--------------------")
    def time3(num: Int) = num * 3
    def time4(num: Int) = num * 4
    def multIt(func: (Int) => Double, num: Int) = {
      func(num)
    }
    printf("3 * 100 = %.1f\n", multIt(time3, 100))
    printf("4 * 100 = %.1f\n", multIt(time4, 100))
    // closure
    val divisorVal = 5
    val divisor5 = (num: Double) => num / divisorVal
    println("5 / 5 = " + divisor5(5.0))
  }
}
