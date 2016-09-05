package com.github.rs3vans.klogger

import org.junit.Test
import java.util.*

class LogFunctionTests {

    @Test
    fun testTrace() {
        logger().trace { "The current time is ${Date()}" }
    }

    @Test
    fun testDebug() {
        logger().debug { "The current time is ${Date()}" }
    }

    @Test
    fun testInfo() {
        logger().info { "The current time is ${Date()}" }
    }

    @Test
    fun testWarn() {
        logger().warn { "The current time is ${Date()}" }
    }

    @Test
    fun testWarn_WithCause() {
        val cause = IllegalStateException()
        logger().warn(cause) { "The current time is ${Date()}" }
    }

    @Test
    fun testError() {
        logger().error { "The current time is ${Date()}" }
    }

    @Test
    fun testError_WithCause() {
        val cause = IllegalStateException()
        logger().error(cause) { "The current time is ${Date()}" }
    }
}