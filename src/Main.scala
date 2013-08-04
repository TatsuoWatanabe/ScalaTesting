import Animals.Animals

object Main {

  def main(args:Array[String]) = {
    simpleDateFormatTest
  }
  
  /**
   * Simple date format
   */
  def simpleDateFormatTest() {
    simpleDateFormat(5000)     //0:05  
    simpleDateFormat(100000)   //1:40
    simpleDateFormat(1000000)  //16:40
    simpleDateFormat(10000000) //2:46:40
  }
  def simpleDateFormat(milliseconds: Long = 9400000) {
    val df = new java.text.SimpleDateFormat("H:mm:ss")
    df.setTimeZone(java.util.TimeZone.getTimeZone("UTC"))
    val hms = df.format(milliseconds)
    
    val pattern = """(\d+):(\d+):(\d+)""".r
    
    val result = hms match {
      case pattern(h, mm, ss) if h == "0" && mm.head == '0' => mm.last.toString + ":" + ss
      case pattern(h, mm, ss) if h == "0"                   => mm + ":" + ss
      case _ => hms
    }
    
    println(result)
  }
  
  /**
   * String split sample
   */
  def splitString() {
    //val l = "全体,ぜんたい"
    //println(l.substring(0, l.indexOf(",")), l.substring(l.indexOf(",") + 1))
    val s = "音声ファイル01.mp3"
    println(s.substring(0, s.lastIndexOf('.')))
  } 
  
  /**
   * List shuffle sample
   */
  def randomList() {
    val l = 1 to 100 //List.range(1, 100 + 1)
    println(l)
    //ランダムに4つ取り出し
    println(scala.util.Random.shuffle(l).take(4))
  }
  
  /**
   * Case Class and Enum Sample
   */
  def animal() {
    val animal1 = Animal("いぬ")
    val animal2 = Animal("ねこ")
    println(animal1.description)
    println(animal2.description)
    println(Animals.Dog)
    println(Animals.Monkey)
    
    //enumを型として宣言
    val ani :Animals = Animals.Cat
    println(ani)    
  }
  
/**
 * GUI Sample
 */
  def happyFrame() {
    import swing._
    val frame = new Frame {
      title = "Happy"
      visible = true
    }
  }
}