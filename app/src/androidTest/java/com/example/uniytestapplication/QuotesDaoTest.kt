package com.example.uniytestapplication

import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class QuotesDaoTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

//    private lateinit var quoteDatabase: QuoteDatabase

    private lateinit var quoteDatabase2 : QuoteDatabase
    private lateinit var quotesDao: QuotesDao

//    @Before
//    fun setUp(){
//        val context = ApplicationProvider.getApplicationContext<Context>()
//       quoteDatabase2 = Room.inMemoryDatabaseBuilder(context, QuoteDatabase::class.java).build()
//        quotesDao = quoteDatabase2.quoteDao()
//    }
@Before
fun setUp() {
    try {
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteDatabase2 = Room.inMemoryDatabaseBuilder(context, QuoteDatabase::class.java).build()
        quotesDao = quoteDatabase2.quoteDao()
    } catch (e: Exception) {
        // Log the error message to the console or a file
        println(": ${e.message}")
        // Rethrow the exception to fail the test
        throw e
    }
}



//    @After
//    fun tearDown() {
//     quoteDatabase2.close()
//    }


    @Test
    fun insertQuote_ecpectedSingleQuote()= runBlocking{
        val quote = Quote(0,"a test quote", "Rahul")
        quotesDao.inserQuote(quote)

        val result = quotesDao.getQuotes().getOrAwaitValue()
        Assert.assertEquals(1, result.size)
        Assert.assertEquals("a test quote", result[0].text)
    }

    @Test
    fun deleteQuote_ecpectedNoResuts()= runBlocking {
        val quote = Quote(0,"a test quote", "Rahul")
        quotesDao.inserQuote(quote)

        quotesDao.delete()

        val result = quotesDao.getQuotes().getOrAwaitValue()
        Assert.assertEquals(0, result.size)
//        Assert.assertEquals("a test quote", result[0].text)
    }

    @After
    fun tearDown() {
        try {
            quoteDatabase2.close()
        } catch (e: Exception) {
            // Log the error message to the console or a file
            println("Error while closing database: ${e.message}")
            // Rethrow the exception to fail the test
            throw e
        }
    }

}
