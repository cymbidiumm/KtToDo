package com.gmailcymbidiumm.kttodo.model

sealed class Action

var counter = 0L
data class AddTodo(val text: String, val id: Long = counter++) : Action()
data class ToggleTodo(val id: Long) : Action()
data class SetVisibility(val visibility: Visibility) : Action()
data class RemoveTodo(val id: Long) : Action()

sealed class Visibility {
    object All : Visibility()
    object Active : Visibility()
    object Completed : Visibility()
}

