package com.example.takashimatsuzaki.androiduitestdemo;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void increment() {
        onView(withId(R.id.incrementButton)).perform(click());
        onView(withId(R.id.countLabel)).check(matches(withText("1")));
    }

    @Test
    public void decrement() {
        onView(withId(R.id.decrementButton)).perform(click());
        onView(withId(R.id.countLabel)).check(matches(withText("-1")));
    }
}
