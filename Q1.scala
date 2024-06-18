object DiskAreaCalculator {
  def areaOfDisk(radius: Double): Double = {
    val pi = Math.PI
    pi * radius * radius
  }

  def main(args: Array[String]): Unit = {
    val radius = 5
    val area = areaOfDisk(radius)
    println(s"The area of a disk with radius $radius is $area")
  }
}
