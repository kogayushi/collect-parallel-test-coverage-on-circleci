package sample

import org.junit.Test
import kotlin.test.assertEquals

class Sample01Test {

    private val sut = Sample01()

    @Test
    fun doSomething() {

        // set up
        val expected = "sample 01"

        // exercise
        val actual = sut.doSomething()

        // verify
        assertEquals(expected, actual)
    }
}
