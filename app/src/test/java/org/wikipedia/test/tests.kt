import android.R
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity


@Rule
var activityActivityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule<MainActivity>(
    MainActivity::class.java
)

@Test
fun clickButtonHome() {
    Espresso.onView(withId(R.id.navigation_home)).perform(click())
        .check(matches(ViewMatchers.isDisplayed()))
}