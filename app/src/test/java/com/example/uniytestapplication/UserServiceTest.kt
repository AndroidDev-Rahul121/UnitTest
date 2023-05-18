package com.example.uniytestapplication

import com.example.uniytestapplication.model.LOGIN_STASUS
import com.example.uniytestapplication.rePository.UserRepository
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class UserServiceTest {

    @Mock
    lateinit var userRepository: UserRepository

    @Before
    fun setup(){
        MockitoAnnotations.openMocks(this)
        Mockito.`when`(userRepository.loginUser(anyString(), anyString())).thenReturn(LOGIN_STASUS.INVALID_PASSWORD)

    }

    @Test
    fun testUserServices(){
        val sut = UserService(userRepository)
        val stasus = sut.loginUser("abc@gmail.com","111111")
        Assert.assertEquals("Password is invalid",stasus)
    }

}