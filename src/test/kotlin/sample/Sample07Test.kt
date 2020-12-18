package sample

import org.junit.Test
import kotlin.test.assertEquals

class Sample07Test {

    private val sut = Sample07()

    @Test
    fun doSomething() {

        // set up
        val expected = "sample 07"

        // exercise
        val actual = sut.doSomething()

        // verify
        assertEquals(expected, actual)
    }
}
