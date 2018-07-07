package org.spekframework.spek2

import org.spekframework.spek2.dsl.Root
import org.spekframework.spek2.style.specification.describe

abstract class MyJvmSpec(body: Root.() -> Unit): Spek(body)

actual class Calculator {
    actual fun add(a: Int, b: Int) = a + b
}

object SampleJvmSpec: MyJvmSpec({
    describe("something") {
        it("test something") {}
    }
})
