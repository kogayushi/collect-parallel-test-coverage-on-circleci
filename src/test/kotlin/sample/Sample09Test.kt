package sample

import org.junit.Test
import kotlin.test.assertEquals

class Sample09Test {

    private val sut = Sample09()

    @Test
    fun doSomething() {

        // set up
        val expected = "sample 09"

        // exercise
        val actual = sut.doSomething()

        // verify
        assertEquals(expected, actual)
    }
}
