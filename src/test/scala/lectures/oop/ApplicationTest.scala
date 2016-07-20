package lectures.oop

import org.scalatest.WordSpec

/**
  * Раскомментруйте и допишите тесты на
  * класс lectures.oop.Application
  */
class ApplicationTest extends WordSpec {

  private val started = new AfterWord("started")

  "Application" should {
    "return correct answer" when started{
      "in a test environment" in {
        //??? shouldBe 8
      }
      "in a production environment" in {
      //   ??? shouldBe 3
      }
    }
  }
}
