package org.rs3vans.kt.klogger

import org.junit.Test
import java.util.*

class WithLoggingTest {

    @Test
    fun testWithLoggingClass() {
        Thing().doStuff()
    }

    class Thing {
        fun doStuff() {
            trace("Doing that thing!")
            trace { "The current time is ${Date()}" }
            debug("Doing that thing!")
            debug { "The current time is ${Date()}" }
            info("Doing that thing!")
            info { "The current time is ${Date()}" }
            warn("Uh-oh!")
            warn("Uh-oh!", RuntimeException())
            warn { "Oh noes! The current time is ${Date()}" }
            warn(RuntimeException()) { "Oh noes! The current time is ${Date()}" }
            error("Uh-oh!")
            error("Uh-oh!", RuntimeException())
            error { "Oh noes! The current time is ${Date()}" }
            error(RuntimeException()) { "Oh noes! The current time is ${Date()}" }
        }

        companion object : WithLogging()
    }
}