// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

@pure def not5(p: B, q: B, r: B): Unit = {
  Deduce(
    ( !(!p | !q) ) |- ( p & q )
      Proof(
        1 (  !(!p | !q) ) by Premise,

        2 SubProof(
          3 Assume (!p),
          4 (!p | !q) by ORI1(3),
        )

    )
  )
}