package com.example.uniytestapplication.rePository

import com.example.uniytestapplication.model.LOGIN_STASUS
import com.example.uniytestapplication.model.User

class UserRepository {

    val users = listOf<User>(
        User(1, "John","john@gmail.com","2asdas1mq"),
        User(1, "Wein","wein@gmail.com","34dd3s2po"),
        User(1, "Emaily","emily@gmail.com","1dfd2s12q"),
    )

    fun loginUser(email:String,password:String):LOGIN_STASUS{
        //Fetch user from db
        val users = users.filter { user -> user.email==email }
        return if (users.size == 1 ){
            if (users[0].password == password){
                LOGIN_STASUS.SUCCESS
            }else{
                LOGIN_STASUS.INVALID_PASSWORD
            }
        }else{
            LOGIN_STASUS.INVALID_USER
        }
    }
}