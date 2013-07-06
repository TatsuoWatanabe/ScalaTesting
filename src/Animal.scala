
/**
 * @author tatsuo
 *
 */
case class Animal(animalName: String) {

  lazy val description = "この動物の名前は「%s」です。".format(this.animalName)
  override def toString = super.toString + " " + this.description
}