package com.github.rs3vans.klogger

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