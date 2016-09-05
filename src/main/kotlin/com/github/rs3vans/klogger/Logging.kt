package com.github.rs3vans.klogger

import org.slf4j.Logger

/**
 * An interface that defines a contract for internal logging within a class or object.
 *
 * @author Ryan Evans (rs3vans@gmail.com)
 */
interface Logging {

    val logger: Logger

    fun trace(message: String) = logger.trace(message)
    fun trace(message: () -> String) = logger.trace(message)

    fun debug(message: String) = logger.debug(message)
    fun debug(message: () -> String) = logger.debug(message)

    fun info(message: String) = logger.info(message)
    fun info(message: () -> String) = logger.info(message)

    fun warn(message: String) = logger.warn(message)
    fun warn(message: String, cause: Throwable) = logger.warn(message, cause)
    fun warn(message: () -> String) = logger.warn(message)
    fun warn(cause: Throwable, message: () -> String) = logger.warn(cause, message)

    fun error(message: String) = logger.error(message)
    fun error(message: String, cause: Throwable) = logger.error(message, cause)
    fun error(message: () -> String) = logger.error(message)
    fun error(cause: Throwable, message: () -> String) = logger.error(cause, message)
}