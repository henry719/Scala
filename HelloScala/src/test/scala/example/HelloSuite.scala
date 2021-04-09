package example
import java.math.BigDecimal

object HelloSuite extends App {
  println("HELLO~")

  val local_price=new BigDecimal(0.015)
  val exchange_rate = new BigDecimal(2)
  println(local_price)
  println(exchange_rate)
  println(local_price.multiply(exchange_rate))

  import scala.math.BigDecimal
  println(BigDecimal("0.015") *  BigDecimal("2"))
  println(BigDecimal("0.1") *  BigDecimal("0.751879699"))
  println(BigDecimal("0.1234") * BigDecimal("0.234234234"))
}