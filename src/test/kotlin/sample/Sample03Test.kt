package sample

import org.junit.Test
import kotlin.test.assertEquals

class Sample03Test {

    private val sut = Sample03()

    @Test
    fun doSomething() {

        // set up
        val expected = "sample 03"

        // exercise
        val actual = sut.doSomething()

        // verify
        assertEquals(expected, actual)
    }
}
