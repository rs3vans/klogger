package org.rs3vans.kt.klogger

import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalDateTime

class LogFunctionTests {

    @Test
    fun testTrace() {
        logger().trace { "The current time is ${LocalDateTime.now()}" }
    }

    @Test
    fun testDebug() {
        logger().debug { "The current time is ${LocalDateTime.now()}" }
    }

    @Test
    fun testInfo() {
        logger().info { "The current time is ${LocalDateTime.now()}" }
    }

    @Test
    fun testWarn() {
        logger().warn { "The current time is ${LocalDateTime.now()}" }
    }

    @Test
    fun testWarn_WithCause() {
        val cause = IllegalStateException()
        logger().warn(cause) { "The current time is ${LocalDateTime.now()}" }
    }

    @Test
    fun testError() {
        logger().error { "The current time is ${LocalDateTime.now()}" }
    }

    @Test
    fun testError_WithCause() {
        val cause = IllegalStateException()
        logger().error(cause) { "The current time is ${LocalDateTime.now()}" }
    }
}