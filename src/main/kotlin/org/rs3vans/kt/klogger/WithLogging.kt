package org.rs3vans.kt.klogger

/**
 * An extendable class which adds logging capabilities.
 *
 * Example use:
 *
 *     class LogsStuff {
 *
 *         companion object : WithLogging()
 *     }
 *
 * @author rs3vans
 */
abstract class WithLogging : Logging {

    override val logger by lazyLogger()
}