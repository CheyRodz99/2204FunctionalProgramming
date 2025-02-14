object SphereVolumeCalculator {
  def volumeOfSphere(radius: Double): Double = {
    val pi = Math.PI
    (4.0 / 3.0) * pi * Math.pow(radius, 3)
  }

  def main(args: Array[String]): Unit = {
    val radius = 5
    val volume = volumeOfSphere(radius)
    println(s"The volume of a sphere with radius $radius is $volume")
  }
}
