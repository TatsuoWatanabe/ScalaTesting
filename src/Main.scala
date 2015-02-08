import Animals.Animals
import scala.collection.generic.Sorted
import java.util.Calendar
import org.junit.Test

class Main {
  /**
   * regExp4chars
   */
  @Test def regExp4chars() {
    val date    = "0131"
    val pattern = """^(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])$"""
    val result = if (date.matches(pattern)) { date } else {
      "else"
    }
    println(result)
  }
  
  /**
   * calendarTest
   */
  @Test def calendarTest() {
    val cal = Calendar.getInstance()
    cal.add(Calendar.YEAR, -20)
    println(cal.getTime)
  }
  
  /**
   * emptyListTest
   */
  @Test def emptyListTest(){
    val l = Option(List()).filterNot(_.isEmpty)
    println(l)
  }
  
  /**
   * sortArrayTest
   */
  @Test def sortArrayTest() {
    val a = Array(1,3,5,2,4).sorted(Ordering[Int].reverse)
    a foreach println
  }
  
  /**
   * what data type of char 
   */
  @Test def ternaryOperatorTest() {
    val a = if(true) 'A' else 65
    val b = if(false) 'A' else 65
    val c = 65.asInstanceOf[Char]
    
    println(a)
    println(b)
    println(c)
  }  
  
  /**
   * List exists for accept formats
   */
  @Test def acceptFormatsTest() {
    val acceptFormats = List(".wav", ".mp3", ".aac", ".m4a", ".mid")
    val name = "music.MP3"
    val result = acceptFormats.exists(name.toLowerCase.endsWith(_))
    println(result)
  }
  
  /**
   * Simple date format
   */
  @Test def simpleDateFormatTest() {
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
  @Test def splitString() {
    //val l = "全体,ぜんたい"
    //println(l.substring(0, l.indexOf(",")), l.substring(l.indexOf(",") + 1))
    val s = "音声ファイル01.mp3"
    println(s.substring(0, s.lastIndexOf('.')))
  } 
  
  /**
   * List shuffle sample
   */
  @Test def randomList() {
    val l = 1 to 100 //List.range(1, 100 + 1)
    println(l)
    //ランダムに4つ取り出し
    println(scala.util.Random.shuffle(l).take(4))
  }
  
  /**
   * Case Class and Enum Sample
   */
  @Test def animal() {
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
  
}