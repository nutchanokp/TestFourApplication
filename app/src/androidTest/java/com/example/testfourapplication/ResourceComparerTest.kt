package com.example.testfourapplication

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {

    private lateinit var resourceComparer: ResourceComparer

    @Before
    fun setup() {
        resourceComparer = ResourceComparer()
    }

    @After
    fun taerdown() {

    }

    @Test
    fun stringResourceSameAsGivenString_returnTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val resoult = resourceComparer.isEqual(context, R.string.app_name, "TestFourApplication")
        assertThat(resoult).isTrue()
    }

    @Test
    fun stringResourceSameAsGivenString_returnFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val resoult = resourceComparer.isEqual(context, R.string.app_name, "Hello")
        assertThat(resoult).isFalse()
    }

}