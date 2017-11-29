/**
  * Created by tweinyan on 29/11/2017.
  */
object ScalaTuple {
  def main(args: Array[String]): Unit = {
    var tupleMerge = (103, "Merge Simpson", 10.25)
    printf("%s owns us $%.2f\n", tupleMerge._2, tupleMerge._3)

    tupleMerge.productIterator.foreach{ i => println(i)}
    println(tupleMerge.toString())
  }
}
