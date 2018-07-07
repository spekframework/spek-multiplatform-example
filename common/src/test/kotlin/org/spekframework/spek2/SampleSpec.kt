package org.spekframework.spek2

import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals

expect class Calculator() {
    fun add(a: Int, b: Int): Int
}

object SampleSpec: Spek({
    val calculator by memoized { Calculator() }

    describe("something") {
        it("test something") {
            assertEquals(3, calculator.add(1, 2))
        }
    }
})
