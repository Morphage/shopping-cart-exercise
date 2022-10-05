import Products.prices

case class ShoppingCart(private val items: List[String]) {
  
  def add(item: String): ShoppingCart = ShoppingCart(items = items :+ item)
  
  def totalPrice: BigDecimal = items.map(prices).sum
  
}

object ShoppingCart {
  def apply(): ShoppingCart = new ShoppingCart(items = Nil)
}