package lectures.oop

abstract class AbstractTest {
  //val name: String = ""
  //println("AbstractTest " + name)

  def whoAmI() = println("AbstractTest")
}

class NameProvider extends AbstractTest {

  //override val name: String = "name provided by trait"

  //println("NameProvider name " + name)

  override def whoAmI() = {
    println("NameProvider")
    super.whoAmI()
  }
}

trait AnotherNameProvider extends AbstractTest {
  //override val name: String = "name provided by another trait"

  //println("AnotherName Provider " + name)

  override def whoAmI() = {
    println("AnotherNameProvider")
    super.whoAmI()
  }
}

class ConcreteClass extends NameProvider with AnotherNameProvider {

  //override val name: String = "Concrete class"

  //println("ConcreteClass name " + name)

  override def whoAmI() = {
    println("ConcreteClass")
    super.whoAmI()
  }

}

object InheritanceTest extends App {
  val k = new ConcreteClass()
  k.whoAmI()
}












