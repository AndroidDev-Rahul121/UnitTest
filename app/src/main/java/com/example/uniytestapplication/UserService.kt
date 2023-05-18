package com.example.uniytestapplication

import com.example.uniytestapplication.model.LOGIN_STASUS.*
import com.example.uniytestapplication.rePository.UserRepository
import java.net.PasswordAuthentication

class UserService(private val userRepository: UserRepository) {

    fun loginUser(email:String,password:String):String{
        val status = userRepository.loginUser(email,password)
        return when(status){
            INVALID_USER->"User doex not exist"
            INVALID_PASSWORD->"Password is invalid"
            UNKNOWN_ERROR->"Unknown error occurred"
            SUCCESS->"Logged in successfully"

        }
    }
}