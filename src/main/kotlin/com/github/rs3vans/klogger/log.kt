package com.github.rs3vans.klogger

import org.slf4j.Logger

/**
 * Provides extension functions for [Logger] that make it easier to log messages/exceptions in certain situations.
 *
 * @author Ryan Evans (rs3vans@gmail.com)
 */

inline fun Logger.trace(message: () -> String)  {
    if (isTraceEnabled)
        trace(message.invoke())
}

inline fun Logger.debug(message: () -> String)  {
    if (isDebugEnabled)
        debug(message.invoke())
}

inline fun Logger.info(message: () -> String)  {
    if (isInfoEnabled)
        info(message.invoke())
}

inline fun Logger.warn(message: () -> String)  {
    if (isWarnEnabled)
        warn(message.invoke())
}

inline fun Logger.warn(cause: Throwable, message: () -> String)  {
    if (isWarnEnabled)
        warn(message.invoke(), cause)
}

inline fun Logger.error(message: () -> String)  {
    if (isErrorEnabled)
        error(message.invoke())
}

inline fun Logger.error(cause: Throwable, message: () -> String)  {
    if (isErrorEnabled)
        error(message.invoke(), cause)
}