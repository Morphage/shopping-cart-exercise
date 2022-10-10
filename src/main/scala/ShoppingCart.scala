import Products.prices

import java.lang.Math.ceil

case class ShoppingCart(private val items: List[String]) {

  def add(item: String): ShoppingCart = ShoppingCart(items = items :+ item)

  def totalPrice: BigDecimal =
    items
      .groupBy(identity)
      .map { case (itemName, items) =>
        val itemsRequiringPayment = ceil(
          itemName match {
            case "Apple" => items.size / 2.0           // buy one, get one free
            case "Orange" => items.size / 3.0 * 2.0    // 3 for the price of 2
          }
        )
        itemsRequiringPayment * prices(itemName)
      }
      .sum

}

object ShoppingCart {
  def apply(): ShoppingCart = new ShoppingCart(items = Nil)
}