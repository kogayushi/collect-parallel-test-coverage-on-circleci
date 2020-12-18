package sample

import org.junit.Test
import kotlin.test.assertEquals

class Sample08Test {

    private val sut = Sample08()

    @Test
    fun doSomething() {

        // set up
        val expected = "sample 08"

        // exercise
        val actual = sut.doSomething()

        // verify
        assertEquals(expected, actual)
    }
}
