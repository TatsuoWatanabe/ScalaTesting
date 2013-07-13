import Animals.Animals

object Main {

  def main(args:Array[String]) = {
 
  }
  
  /**
   * List shuffle sample
   */
  def randomList() {
    val l = List.range(1, 100 + 1)
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