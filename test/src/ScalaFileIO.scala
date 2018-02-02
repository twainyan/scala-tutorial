/**
  * Created by tweinyan on 29/11/2017.
  */
import java.io.PrintWriter
import scala.io.Source
object ScalaFileIO {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter("test.txt")
    writer.write("Just some random text\nSome more random text")
    writer.close()

    val textFromFile = Source.fromFile("test.txt", "UTF-8")
    val lineIterator = textFromFile.getLines
    for(line <- lineIterator)
      println(line)
    textFromFile.close()
  }
}
