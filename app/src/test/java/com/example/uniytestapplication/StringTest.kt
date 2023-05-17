package com.example.uniytestapplication

import com.example.uniytestapplication.utils.Utils
import junit.framework.TestCase.assertEquals
import org.junit.Test

class StringTest {

    @Test
    fun testStringReversal_EMptyString_expectedSingleChar(){
        val sut  = Utils()
        val  result= sut.reverseString("a")
        assertEquals("a",  result )
    }
    @Test
    fun testStringReversal_EMptyString_expectedEmptyString(){
        val sut  = Utils()
        val  result= sut.reverseString("")
        assertEquals("",  result )
    }
    @Test
    fun testStringReversal_EMptyString_expectedSameString(){
        val sut  = Utils()
        val  result= sut.reverseString("Rahul")
        assertEquals("luhaR",  result )
    }
    @Test(expected = IllegalAccessException::class)
    fun testStringReversal_EMptyString_expectedException(){
        val sut  = Utils()
        val  result= sut.reverseString(null)
//        assertEquals("luhaR",  result )
    }
}