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
        val logger = Thing1.logger

        Assert.assertEquals(Thing1::class.java.name, logger.name)
    }

    @Test
    fun testLoggerSelfInCompanion() {
        val logger = Thing2.logger

        Assert.assertEquals(Thing2::class.java.name, logger.name)
    }

    @Test
    fun testLoggerSelfByLazy() {
        val logger = Thing3.logger

        Assert.assertEquals(Thing3::class.java.name, logger.name)
    }

    @Test
    fun testLoggerSelfByLazyInCompanion() {
        val logger = Thing4.logger

        Assert.assertEquals(Thing4::class.java.name, logger.name)
    }

    @Test
    fun testLoggerReified() {
        val logger = logger<String>()

        Assert.assertEquals(String::class.java.name, logger.name)
    }

    object Thing1 {
        val logger = logger()
    }

    class Thing2 {
        companion object {
            val logger = logger()
        }
    }

    object Thing3 {
        val logger by lazyLogger()
    }

    class Thing4 {
        companion object {
            val logger by lazyLogger()
        }
    }
}