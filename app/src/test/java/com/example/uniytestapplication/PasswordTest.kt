package com.example.uniytestapplication

import com.example.uniytestapplication.utils.Utils
import org.junit.Assert.*
import org.junit.Test

class PasswordTest {

    @Test
    fun validaPassword_blakInput_expectedRequiredField(){
        val sut = Utils()
        val result = sut.validatePassword("     ")
        assertEquals("Password is required field", result)
    }
    @Test
    fun validaPassword_blakInput_expectedValidationMsg(){
        val sut = Utils()
        val result = sut.validatePassword("au6jh6dytjudytjudfytu7jfnuhkicdukytdcgmb")
        assertEquals(  "Length of the password should be less than 15", result)
    }
    @Test
    fun validaPassword_blakInput_expectedValidationMs(){
        val sut = Utils()
        val result = sut.validatePassword("abb")
        assertEquals(  "Length of the password should be greater than 6", result)
    }

    @Test
    fun validaPassword_blakInput_expectedValidPassword(){
        val sut = Utils()
        val result = sut.validatePassword("Pass123")
        assertEquals("Valid", result)
    }

}