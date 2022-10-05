import org.scalatest.funsuite.AnyFunSuite

class ShoppingCartSpec extends AnyFunSuite {

  test("calculates the correct price for a shopping cart") {
    val shoppingCart =
      ShoppingCart()
        .add("Apple")
        .add("Orange")
        
    assert(shoppingCart.totalPrice === 0.85)
  }

  test("calculates the correct price for a shopping cart taking into account offers") {
    val shoppingCart =
      ShoppingCart()
        .add("Apple")
        .add("Apple")
        .add("Orange")
        .add("Apple")
        .add("Orange")
        .add("Orange")

    assert(shoppingCart.totalPrice === 1.70)
  }

}
