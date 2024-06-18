object WholesaleCostCalculator {
  def totalWholesaleCost(copies: Int): Double = {
    val coverPrice = 24.95
    val discount = 0.4
    val discountedPrice = coverPrice * (1 - discount)
    val shippingCostFirst50 = 3.0
    val shippingCostAdditional = 0.75

    val totalBookCost = discountedPrice * copies

    val totalShippingCost = if (copies <= 50) {
      shippingCostFirst50
    } else {
      shippingCostFirst50 + (copies - 50) * shippingCostAdditional
    }

    totalBookCost + totalShippingCost
  }

  def main(args: Array[String]): Unit = {
    val copies = 60
    val totalCost = totalWholesaleCost(copies)
    println(s"The total wholesale cost for $copies copies is Rs. $totalCost")
  }
}
