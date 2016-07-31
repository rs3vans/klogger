package org.rs3vans.kt.klogger

import org.junit.Test
import java.time.LocalDateTime

class WithLoggingTest {

    @Test
    fun testWithLoggingClass() {
        Thing().doStuff()
    }

    class Thing {
        fun doStuff() {
            trace("Doing that thing!")
            trace { "The current time is ${LocalDateTime.now()}" }
            debug("Doing that thing!")
            debug { "The current time is ${LocalDateTime.now()}" }
            info("Doing that thing!")
            info { "The current time is ${LocalDateTime.now()}" }
            warn("Uh-oh!")
            warn("Uh-oh!", RuntimeException())
            warn { "Oh noes! The current time is ${LocalDateTime.now()}" }
            warn(RuntimeException()) { "Oh noes! The current time is ${LocalDateTime.now()}" }
            error("Uh-oh!")
            error("Uh-oh!", RuntimeException())
            error { "Oh noes! The current time is ${LocalDateTime.now()}" }
            error(RuntimeException()) { "Oh noes! The current time is ${LocalDateTime.now()}" }
        }

        companion object : WithLogging()
    }
}