// #Sireum #Logika
//@Logika: --manual

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

//finding x*y by doing x + x + x + ... + x (y times)
def mult(x: Z, y: Z): Z = {
  //What can we use as the function contract?

  var total: Z = 0
  var i: Z = 0

  //what goes here?

  Deduce(

  )

  while (i != y) {
    //what goes here?
    Invariant(
      Modifies(total, i),

      total == i * x
    )
    total = total + x
    Deduce(
      1 (Old(total) == i*x) by Premise,
      2 (total == Old(total) + x),
      3 (total == i*x + x) by Algebra*(1, 2),
    )
    i = i + 1

    Deduce(
      1 ( i == Old(i) + 1) by Premise,
      2 (total == Old(i)*x + x) by Premise,
      3 (Old(i) == i - 1) by Algebra*(1),
      4 (total == (i - 1)*x + x) by Algebra*(2, 3),
      5 (total == i*x -x + x) by Algebra*(4),
      6 (total == i*x) by Algebra*(5),
    )

    //what should we be able to assert here?


  }

  //what do we need here?
  Deduce(
    1 !(i != y) by Premise,
    2 ( i == y) by Algebra*(1),
    3 (total == i*x) by Premise,
    (total == x*y) by A
  )

  return total
}

//////////// test code /////////

val a: Z = 5
val b: Z = 4

var ans: Z = mult(a, b)

//what do we want to assert that ans is?