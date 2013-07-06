
object Main {

  def main(args:Array[String]) = {
    val animal1 = Animal("いぬ")
    val animal2 = Animal("ねこ")
    println(animal1.description)
    println(animal2.description)
    println(Animals.Dog)
    println(Animals.Monkey)
  }

  def happyFrame() {
    import swing._
    val frame = new Frame {
      title = "Happy"
      visible = true
    }

  }
}