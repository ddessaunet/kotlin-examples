/*
* Using higher-order functions imposes certain runtime penalties: each function is an object,
* and it captures a closure, i.e. those variables that are accessed in the body of the function.
* Memory allocations (both for function objects and classes) and virtual calls introduce runtime overhead.
*
* Inlining means that the function is being inlining is going to be copy-past by the compiler replacing
* the function call.
* */

package main.kotlin.advance.inline

// The inline modifier affects both the function itself and the lambdas
// passed to it: all of those will be inlined into the call site.
//
// In case you want only some of the lambdas passed to an inline
// function to be inlined, you can mark some of your function parameters with the noinline modifier:
inline fun operation(x: Int, y: Int, func: (Int, Int) -> Int, noinline g: () -> Unit) {
    println("Function being called")
    func(x, y)
    println("Function was called")
}