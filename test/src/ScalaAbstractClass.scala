/**
  * Created by tweinyan on 29/11/2017.
  */
object ScalaAbstractClass {
  def main(args: Array[String]): Unit = {
    val fang = new Wolf("Fang")
    fang.moveSpeed = 36.0
    println(fang.move)
  }
  abstract class Mammal(val name: String){
    var moveSpeed: Double
    def move: String
  }
  class Wolf(name: String) extends Mammal(name){
    var moveSpeed = 35.0
    def move = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)
  }
}
