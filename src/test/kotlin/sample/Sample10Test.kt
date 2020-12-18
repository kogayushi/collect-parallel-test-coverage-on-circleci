package sample

import org.junit.Test
import kotlin.test.assertEquals

class Sample10Test {

    private val sut = Sample10()

    @Test
    fun doSomething() {

        // set up
        val expected = "sample 10"

        // exercise
        val actual = sut.doSomething()

        // verify
        assertEquals(expected, actual)
    }
}
