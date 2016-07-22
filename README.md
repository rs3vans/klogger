# klogger #
A [Kotlin](https://kotlinlang.org/) library for logging.

## Overview ##
This library is a simple set of extensions around the popular `slf4j` logging API which aim to make using them easier
when writing in Kotlin.

## Motivation ##
The popular `slf4j` framework is used in many existing libraries. It makes sense to extend this library for use in
Kotlin, rather than creating yet another logging library from scratch.

## Using ##

#### Obtaining a logger ####
Nothing prevents users of `klogger` from obtaining a [Logger](http://www.slf4j.org/apidocs/org/slf4j/Logger.html)
by the usual means, but the following extended ways are possible with `klogger`:

```kotlin
// obtain a logger for any String using it as the logger's name
val log = "com.rs3vans.kt.klogger".logger()

// obtain a logger for any type, using the class name as the logger's name
val log = logger<SomeType>()

// obtain a logger _inside_ any type (e.g. for use within a class)
class Thing {
    private val log = logger()
    
    fun doThing() {
        log.trace("A message")
    }
}
```

#### Logging messages and exceptions ####
Again, all existing methods of [Logger](http://www.slf4j.org/apidocs/org/slf4j/Logger.html) are free
to be used, but the following extensions make logging with `klogger` a little nicer:

```kotlin
// log a message using a lambda that will only be evaluated if the given level is enabled
log.trace { "Assembling this message is resource-intensive: ${loadProperties()}" }

// the same form can accept throwable causes (`warn` and `error` only)
log.error(cause) { "Assembling this message is resource-intensive: ${loadProperties()}" }
```

#### Logging within an `object` or `class` ####
A fairly common pattern is to create an internal static logger for each class that will be logging messages or errors.
`klogger` provides an interface for adding this behavior to an `object` or `class`, and then providing easy
access to the various logging functions without referencing the logger with each invocation:

```kotlin
class Thing : Logging {
    override val logger = logger()
    
    fun doThing() {
        trace("A message")
    }
}
```

## License ##
`klogger` is licensed under the Apache Software License v2.0.

`slf4j` is licensed under the [MIT License](http://www.slf4j.org/license.html).
