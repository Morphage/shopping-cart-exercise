import org.scalatest.funsuite.AnyFunSuite

class ShoppingCartSpec extends AnyFunSuite {

  test("calculates the correct price for a shopping cart") {
    val shoppingCart =
      ShoppingCart()
        .add("Apple")
        .add("Apple")
        .add("Orange")
        .add("Apple")
        
    assert(shoppingCart.totalPrice === 2.05)
  }

}
