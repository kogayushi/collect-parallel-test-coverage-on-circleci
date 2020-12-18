package sample

import org.junit.Test
import kotlin.test.assertEquals

class Sample02Test {

    private val sut = Sample02()

    @Test
    fun doSomething() {

        // set up
        val expected = "sample 02"

        // exercise
        val actual = sut.doSomething()

        // verify
        assertEquals(expected, actual)
    }
}
