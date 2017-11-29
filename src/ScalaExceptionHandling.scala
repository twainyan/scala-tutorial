/**
  * Created by tweinyan on 29/11/2017.
  */
object ScalaExceptionHandling {
  def main(args: Array[String]): Unit = {
    def divideNums(num1: Int, num2: Int) = try
    {
      (num1 / num2)
    } catch {
      case ex: java.lang.ArithmeticException => "Can't divide by zero"
    } finally {
      // clean up after exception
    }
    println("3 / 0 = " + divideNums(3, 0))
  }
}
