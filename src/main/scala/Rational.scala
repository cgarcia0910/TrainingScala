class Rational(x: Int, y: Int) {
  def numer = x / gcd(x, y)
  def denom = y /gcd(x, y)

  /*
    Euclides algorithm for gcd
   */

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def add(that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  }

  def neg(): Rational = new Rational(-numer, denom)

  def sub(that: Rational): Rational = {
    add(that.neg())
  }
  override def toString: String = s"$numer / $denom"
}
