object RunningTimeCalculator {
  def totalRunningTime(): Int = {
    val easyPace = 8 
    val tempoPace = 7

    val easyDistance1 = 2 
    val tempoDistance = 3 
    val easyDistance2 = 2 

    val easyTime1 = easyPace * easyDistance1
    val tempoTime = tempoPace * tempoDistance
    val easyTime2 = easyPace * easyDistance2

    easyTime1 + tempoTime + easyTime2
  }

  def main(args: Array[String]): Unit = {
    val totalTime = totalRunningTime()
    println(s"The total running time is $totalTime minutes")
  }
}
