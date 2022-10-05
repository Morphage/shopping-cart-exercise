case class ShoppingCart() {
  
  def add(item: String): ShoppingCart = this
  
  def totalPrice: BigDecimal = -1
  
}

object ShoppingCart {
  def apply(): ShoppingCart = new ShoppingCart()
}