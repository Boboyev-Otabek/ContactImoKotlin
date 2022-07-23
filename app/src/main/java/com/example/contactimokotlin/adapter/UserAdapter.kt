package com.example.contactimokotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.contactimokotlin.R
import com.example.contactimokotlin.model.User
import com.google.android.material.imageview.ShapeableImageView

class UserAdapter(var context: Context,var user:ArrayList<User>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    private val type_available_not = 1
    private val type_available_yes = 0



    override fun getItemViewType(position: Int): Int {
        val user: User = user!![position]
        return if (user.isAvailable) {
            type_available_yes
        } else type_available_not
    }

    override fun getItemCount(): Int {
        return user!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == type_available_yes) {
            val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_contact_online, parent, false)
            return UserOnlineHolder(view)
        }
        val view: View =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_contact_offline, parent, false)
        return UserOfflineHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var users= user!![position]
        if(holder is UserOnlineHolder){
            var iv_profile= holder.iv_profile
            var tv_fullname = holder.tv_fullname


            iv_profile.setImageResource(users.profile)
            tv_fullname.text=users.fullname
        }





        if(holder is UserOfflineHolder){
            var iv_profile= holder.iv_profile
            var tv_fullname = holder.tv_fullname


            iv_profile.setImageResource(users.profile)
            tv_fullname.text=users.fullname
        }
    }

    class UserOnlineHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView


        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)

        }
    }

    class UserOfflineHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView


        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)

        }
    }


}


