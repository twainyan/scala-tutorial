/**
  * Created by tweinyan on 27/11/2017.
  */
import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Helloworld {
  def main(args: Array[String]): Unit = {
    def factorial(num : BigInt) : BigInt = {
      if(num <= 1)
        1
      else
        num * factorial(num - 1)
    }
    println("Factorial of 10 = " + factorial(10))
  }
}
