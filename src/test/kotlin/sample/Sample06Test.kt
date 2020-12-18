package sample

import org.junit.Test
import kotlin.test.assertEquals

class Sample06Test {

    private val sut = Sample06()

    @Test
    fun doSomething() {

        // set up
        val expected = "sample 06"

        // exercise
        val actual = sut.doSomething()

        // verify
        assertEquals(expected, actual)
    }
}
