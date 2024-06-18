object TemperatureConverter {
  def celsiusToFahrenheit(celsius: Double): Double = {
    celsius * 1.8 + 32
  }

  def main(args: Array[String]): Unit = {
    val celsiusTemperature = 35
    val fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature)
    println(s"The temperature $celsiusTemperature°C is equal to $fahrenheitTemperature°F")
  }
}
