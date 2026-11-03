// #Sireum #Logika
//@Logika: --manual

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

val x: Z = Z.prompt("Enter first number: ")
val y: Z = Z.prompt("Enter second number: ")

//x = 3, y = 4
Assume(x > y)

//how do we assume x is bigger than y?


val max: Z = x

Assert(max >=  x & max >= y)
Assert(max == x | max == y)


//what can we put in a proof block here?

//how do we assert max is the biggest between our two inputs?
