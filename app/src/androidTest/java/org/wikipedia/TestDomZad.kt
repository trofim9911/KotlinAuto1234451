package org.wikipedia

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.*
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.AllOf
import org.junit.Before
import org.junit.Test
import org.wikipedia.database.AppDatabase
import org.wikipedia.notifications.db.NotificationDao
import org.wikipedia.search.db.RecentSearchDao
import org.wikipedia.talk.db.TalkPageSeenDao
import java.util.concurrent.TimeUnit

class FirstTest {

    @Before//Тут я так понимаю, мне нужно запистить приложение, но чтото идет не так. Пробовал по примеру из класса AppDatabaseTests, но у меня тут ошибит

    @Test
    fun clickButtonDonate() {
        onView(withId(R.id.nav_more_container)).perform(click())
        onView(withId(R.id.main_drawer_donate_container)).perform(click())
        //А тут я должен пойать интент, но приложение не переходит в браузер и я не вижу что ловить
    }

    @Test
    fun clickBittonSettings() {
        onView(withId(R.id.nav_more_container)).perform(click())
        onView(withId(R.id.main_drawer_settings_container)).perform(click())
        onView(
            AllOf(
                withId(R.id.switchWidget)
            )
        )
            .check(isClickable())

    }

    private fun ViewInteraction.check(clickable: Matcher<View>?) {

    }//Хз что это. Предложил мне как исправление ошибки
}