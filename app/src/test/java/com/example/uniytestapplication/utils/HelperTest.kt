package com.example.uniytestapplication.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {


    lateinit var  helper : Helper
    @Before
    fun setup(){
        helper = Helper()
        println("Before every test case")
    }

    @After
    fun setdown(){
        println("After every test case")
    }




    @Test
    fun isPallindrome() {
        // Arrange

        //Act
        val result = helper.isPallindrome("hello")
        // Assert
        assertEquals(false,result)
    }

    @Test
    fun isPallindrome_inputString_level_expectedTrue() {
        // Arrange
//        val helper = Helper()
        //Act
        val result = helper.isPallindrome("0000")
        // Assert
        assertEquals(true,result)
    }
}