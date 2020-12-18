package sample

import org.junit.Test
import kotlin.test.assertEquals

class Sample05Test {

    private val sut = Sample05()

    @Test
    fun doSomething() {

        // set up
        val expected = "sample 05"

        // exercise
        val actual = sut.doSomething()

        // verify
        assertEquals(expected, actual)
    }
}
