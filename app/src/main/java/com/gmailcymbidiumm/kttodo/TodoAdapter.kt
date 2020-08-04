package com.gmailcymbidiumm.kttodo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import com.gmailcymbidiumm.kttodo.model.Todo
import kotlinx.android.synthetic.main.todo_item.view.*


class TodoAdapter(context: Context, val todos: List<Todo>) :
    ArrayAdapter<Todo>(context, 0, todos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.todo_item, parent, false)

        todos[position].let { item ->
            view.textView.text = item.text
            view.checkBox.isChecked = item.isChecked
        }
        return view
    }

    override fun getItemId(position: Int): Long = todos[position].id

}