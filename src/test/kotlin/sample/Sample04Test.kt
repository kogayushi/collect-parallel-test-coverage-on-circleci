package sample

import org.junit.Test
import kotlin.test.assertEquals

class Sample04Test {

    private val sut = Sample04()

    @Test
    fun doSomething() {

        // set up
        val expected = "sample 04"

        // exercise
        val actual = sut.doSomething()

        // verify
        assertEquals(expected, actual)
    }
}
