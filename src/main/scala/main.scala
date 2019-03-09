object Main extends App {
  def rational1 = new Rational(1, 2)
  def rational2 = new Rational(1, 2)
  println(s"The sum of ${rational1.toString} and ${rational2.toString} is ${rational1.sub(rational2)}")
}
