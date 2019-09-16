package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.userList.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.user_ticket.*

class MainActivity : AppCompatActivity() {

    var listOfUsers = ArrayList<User>()
    var adapter:UserAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listOfUsers = ArrayList<User>()
        listOfUsers.add(User("Jorge A Nino", "Likes to play videogames, 22 years old",R.drawable.dummy1))
        listOfUsers.add(User("Pablo Prado", "Likes to read books, 21 years old",R.drawable.dummy2))
        listOfUsers.add(User("Marcela Vazquez", "Likes to sleep, 24 years old",R.drawable.dummy3))
        listOfUsers.add(User("Beto Martin", "Likes to use the PC, 20 years old",R.drawable.dummy4))
        listOfUsers.add(User("Elvis Presley", "Likes to play instruments, 60 years old",R.drawable.dummy5))
        listOfUsers.add(User("Jose Carlos", "Likes to play videogames, 30 years old",R.drawable.dummy6))
        listOfUsers.add(User("Martha Elizabeth", "Likes to go shopping, 25 years old",R.drawable.dummy7))
        listOfUsers.add(User("Christian Ivan", "Likes to buy starbucks, 28 years old",R.drawable.dummy8))
        listOfUsers.add(User("Alejandra Martinez", "Likes to travel, 29 years old",R.drawable.dummy9))
        listOfUsers.add(User("Eduardo Lopez", "Likes to eat italian food, 56 years old",R.drawable.dummy10))
        adapter = UserAdapter(this, listOfUsers)
        lvUsers.adapter = adapter
    }

}
