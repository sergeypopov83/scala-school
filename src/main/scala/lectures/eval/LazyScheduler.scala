package lectures.eval

import java.time.Clock

import scala.collection.SeqView

/**
  * В этом задании, ваша задча реализовать своеобразный View с таймером
  *
  * Он должен предаставлять из себя стандартный SeqView c ограничением по времени
  * Т.е. этот view ведет себя как обычно пока не истечет таймаут, предеданный при создании
  * Как только таймаут истекает view должен начать вести себя так, как буд-то коллекция пуста
  *
  * Для решения задачи подставьте на место вопросительныйх знаков реализацию view
  * Раскомментируйте и выполните тесты а lectures.eval.LazySchedulerTest
  */

object LazySchedulerView {

  implicit class SeqViewConverter[A](f: Seq[A]) {
    val c = Clock.systemDefaultZone()

    /**
      *
      * @param expirationTimeout - таймаут после которого view становиться пустым в милисекундах
      * @return - view
      */
    def lazySchedule(expirationTimeout: Long): SeqView[A, Seq[_]]  = {
      val i = c.instant().plusMillis(expirationTimeout)
      ???
    }
  }
}

object LazySchedulerViewExample extends App {

  import LazySchedulerView._

  val v = List(1, 2, 3, 56)
  val d = v.lazySchedule(1300)

  print(d.length)
  Thread.sleep(1500)
  print(d.length)
}


