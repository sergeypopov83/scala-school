package lectures.operators

import lectures.functions.Data

/**
  * В задачке из lectures.functions.Computations, мы реализовали
  * один и тот же метод 3-я разными способами
  *
  * Пришло время оценить на сколько разные имплементации
  * отличаются друг от друга по производительности
  *
  * Для этого, раскомментируйте код, выполните в циклах вызов 3-х имплементаций
  * Оцените разницу во времени выполнения и объясните ее происхожение
  *
  */
object EvaluateOptimization extends App with Data {

  val startTimestamp = System.currentTimeMillis()


  // ВЫПОЛНИТЬ В ЦИКЛЕ  ОТ 1 ДО 100 Computation.computation(
  //    for(??? <- ???) {
  //    print("elapsed time in Computation.computation" + (System.currentTimeMillis() - startTimestamp))
  //   }

  // ВЫПОЛНИТЬ В ЦИКЛЕ  ОТ 1 ДО 100 CurriedComputation.partiallyAppliedCurriedFunction(
  //    for(??? <- ???) {
  //     ???
  //    print("elapsed time " + (System.currentTimeMillis() - startTimestamp))
  //   }

  // ВЫПОЛНИТЬ В ЦИКЛЕ  ОТ 1 ДО 100 FunctionalComputation.filterApplied
  //    for(??? <- ???) {
  //     ???
  //    print("elapsed time " + (System.currentTimeMillis() - startTimestamp))
  //   }

  // ВЫВЕСТИ РАЗНИЦУ В ПРОДОЛЖИТЕЛЬНОСТИ ВЫПОЛНЕНИЯ МЕЖДУ КАРРИРОВАННОЙ ВЕРСИЕЙ
  // И ФУНКЦИОНАЛЬНОЙ

  //  val diff = ???

  ///  print(s"Difference is about $diff milliseconds")
}

