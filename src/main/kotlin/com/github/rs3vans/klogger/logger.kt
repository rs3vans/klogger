package com.github.rs3vans.klogger

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
        LoggerFactory.getLogger(unwrapCompanionClass(this.javaClass))

fun Any.lazyLogger(): Lazy<Logger> =
        lazy { logger() }

inline fun <reified T : Any> logger(): Logger =
        LoggerFactory.getLogger(T::class.java)

private fun <T: Any> unwrapCompanionClass(ofClass: Class<T>): Class<*> {
    return if (ofClass.enclosingClass != null
            && ofClass.name == (ofClass.enclosingClass.name + "\$Companion")) {
        ofClass.enclosingClass
    } else {
        ofClass
    }
}