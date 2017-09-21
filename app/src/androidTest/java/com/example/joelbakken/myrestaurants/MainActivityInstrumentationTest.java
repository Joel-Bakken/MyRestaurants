package com.example.joelbakken.myrestaurants;

import android.support.test.rule.ActivityTestRule;

import com.example.joelbakken.myrestaurants.ui.MainActivity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityInstrumentationTest {

    @Rule
        public ActivityTestRule<MainActivity> activityTestRule =
                new ActivityTestRule<>(MainActivity.class);

    @Test
        public void validateEditText() {
            onView(withId(R.id.appNameTextView)).perform(typeText("MyRestaurants"))
                    .check(matches(withText("MyRestaurants")));
        }

//    @Test
//        public void locationIsSentToRestaurantActivity() {
//            String location = "Portland";
//            onView(withId(R.id.locationEditText)).perform(typeText(location));
//            onView(withId(R.id.findRestaurantsButton)).perform(click());
//            onView(withId(R.id.locationTextView)).check(matches
//                    (withText("Here are all the restaurants near: " + location)));
//    }
}
