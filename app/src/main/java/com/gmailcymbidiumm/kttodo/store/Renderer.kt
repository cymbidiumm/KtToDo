package com.gmailcymbidiumm.kttodo.store

import androidx.lifecycle.LiveData

interface Renderer<T> {
    fun render(model: LiveData<T>)
}