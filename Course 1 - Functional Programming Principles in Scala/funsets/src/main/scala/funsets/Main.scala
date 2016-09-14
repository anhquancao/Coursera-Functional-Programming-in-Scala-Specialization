package funsets

import FunSets._

object Main extends App {

  val x1 = union(singletonSet(1), singletonSet(3))
  val x2 = union(singletonSet(4), singletonSet(5))
  val x3 = union(singletonSet(7), singletonSet(1000))
  val y = union(union(x1, x2), x3)
  val z = map(y, x => x - 1)
}

