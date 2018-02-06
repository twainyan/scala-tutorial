class Rational(n:Int, d:Int) {
  require(d!=0)
  private val g = gcd(n.abs, d.abs)
  val number = n/g
  val denom = d/g
  override def toString = number + "/" + denom
  def +(that:Rational) =
    new Rational(
        number * that.denom + that.number * denom,
        denom * that.denom
      )
  def +(i:Int) = new Rational(number + i * denom, denom)
  def *(that:Rational) =
    new Rational(
        number * that.number, denom * that.denom
      )
  def this(n:Int) = this(n, 1)
  private def gcd(a:Int, b:Int):Int =
    if(b==0) a else gcd(b, a % b)
}

implicit def intToRational(x:Int) = new Rational(x)
