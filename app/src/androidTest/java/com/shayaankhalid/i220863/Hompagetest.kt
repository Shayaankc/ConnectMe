package com.shayaankhalid.i220863

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.*

import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomePageTest
{
    @get:Rule
    val activityRule = ActivityScenarioRule(HomePage::class.java)
    @Before
    fun setUp()
    {
        Intents.init()
    }
    @After
    fun tearDown()
    {
        Intents.release()
    }
    @Test
    fun testRecyclerViewScrolling()
    {
        onView(withId(R.id.recyclerView)).perform(RecyclerViewActions.scrollToPosition<PostAdapter.PostViewHolder>(3))
    }
    @Test
    fun testDMButtonClick()
    {
        onView(withId(R.id.dmbutton)).perform(click())
        Intents.intended(hasComponent(DMs::class.java.name))
    }
}
