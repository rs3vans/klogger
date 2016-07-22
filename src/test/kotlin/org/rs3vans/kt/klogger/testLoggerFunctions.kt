package org.rs3vans.kt.klogger

import org.junit.Assert
import org.junit.Test

class LoggerFunctionTests {

    @Test
    fun testLoggerString() {
        val logger = "hello.world".logger()

        Assert.assertEquals("hello.world", logger.name)
    }

    @Test
    fun testLoggerSelf() {
        val logger = logger()

        Assert.assertEquals(LoggerFunctionTests::class.java.name, logger.name)
    }

    @Test
    fun testLoggerReified() {
        val logger = logger<String>()

        Assert.assertEquals(String::class.java.name, logger.name)
    }
}