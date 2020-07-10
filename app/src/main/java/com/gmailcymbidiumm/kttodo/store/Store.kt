package com.gmailcymbidiumm.kttodo.store

import com.gmailcymbidiumm.kttodo.model.Action
import androidx.arch.core.util.Function

interface Store<T> {
    fun dispatch(action: Action)

    fun subscribe(renderer: Renderer<T>, func: Function<T, T> = Function{it})
}