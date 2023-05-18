package com.example.uniytestapplication.utils

import com.example.uniytestapplication.MainCoroutineRule
import com.example.uniytestapplication.Util
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Assert.*

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class UtilTest {


//    private val testDispatcher = StandardTestDispatcher()

//
//    @Before
//    fun setUp() {
//        Dispatchers.setMain(testDispatcher)
//
//    }

    @get:Rule
    val mainCoroutineRule=MainCoroutineRule()


    @Test
    fun testGetUser(){
        val  sut = Util(mainCoroutineRule.testDispatcher)
        runTest {
            sut.getAddressDetail()
            mainCoroutineRule.testDispatcher.scheduler.advanceUntilIdle()
            assertEquals(true,sut.globalArg)
        }
    }

//    @After
//    fun tearDown() {
//        Dispatchers.resetMain()
//    }
}