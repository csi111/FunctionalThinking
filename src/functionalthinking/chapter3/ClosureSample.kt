package functionalthinking.chapter3

var local_variable = 0
val makeCounter : () -> Int = {
    ++local_variable
}