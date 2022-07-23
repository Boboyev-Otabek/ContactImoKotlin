package com.example.contactimokotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactimokotlin.adapter.UserAdapter
import com.example.contactimokotlin.model.User

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    fun initView() {
        context = this
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)


        refreshAdapter(recyclerView, getAllUser())
    }

    fun refreshAdapter(recyclerView: RecyclerView, user: ArrayList<User>) {
        var adapter = UserAdapter(context, user)
        recyclerView.adapter = adapter
    }

    fun getAllUser(): ArrayList<User> {
        var users = ArrayList<User>()

        users.add(User(R.drawable.imo_1, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_2, "Boboyev Otabek", true))
        users.add(User(R.drawable.imo_3, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_2, "Boboyev Otabek", true))
        users.add(User(R.drawable.imo_3, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_1, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_2, "Boboyev Otabek", true))
        users.add(User(R.drawable.imo_3, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_2, "Boboyev Otabek", true))
        users.add(User(R.drawable.imo_3, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_1, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_2, "Boboyev Otabek", true))
        users.add(User(R.drawable.imo_3, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_2, "Boboyev Otabek", true))
        users.add(User(R.drawable.imo_3, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_1, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_2, "Boboyev Otabek", true))
        users.add(User(R.drawable.imo_3, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_2, "Boboyev Otabek", true))
        users.add(User(R.drawable.imo_3, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_1, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_2, "Boboyev Otabek", true))
        users.add(User(R.drawable.imo_3, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_2, "Boboyev Otabek", true))
        users.add(User(R.drawable.imo_3, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_1, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_2, "Boboyev Otabek", true))
        users.add(User(R.drawable.imo_3, "Boboyev Otabek", false))
        users.add(User(R.drawable.imo_2, "Boboyev Otabek", true))
        users.add(User(R.drawable.imo_3, "Boboyev Otabek", false))

        return users
    }
}