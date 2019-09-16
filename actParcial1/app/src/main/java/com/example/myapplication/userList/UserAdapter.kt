package com.example.myapplication.userList

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.myapplication.R
import kotlinx.android.synthetic.main.user_ticket.view.*

class UserAdapter:BaseAdapter{

    var listOfUsers = ArrayList<User>()
    var context: Context?=null
    constructor(context:Context, listOfUsers: ArrayList<User>): super(){
        this.listOfUsers = listOfUsers
        this.context = context
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val user = listOfUsers[position]
        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var myView = inflator.inflate(R.layout.user_ticket, null)
        myView.tvUser.text = user.name!!
        myView.tvUserDesc.text = user.desc!!
        myView.ivUser.setImageResource(user.image!!)
        return myView
    }

    override fun getItem(position: Int): Any {
        return listOfUsers[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return listOfUsers.size
    }

}