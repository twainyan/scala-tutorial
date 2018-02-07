import scala.io.Source

object LongLines {
  def processFile(filename: String, width:Int) {
    def processLine(line:String) {
      if(line.length > width)
        println(filename + ":" + line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }
}

LongLines.processFile(args(0), args(1).toInt)
