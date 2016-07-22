package org.rs3vans.kt.klogger

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * A simple set of extension functions for easily creating isntances of [Logger].
 *
 * @author rs3vans
 */

fun String.logger(): Logger =
        LoggerFactory.getLogger(this)

fun Any.logger(): Logger =
        LoggerFactory.getLogger(this.javaClass)

inline fun <reified T : Any> logger(): Logger =
        LoggerFactory.getLogger(T::class.java)