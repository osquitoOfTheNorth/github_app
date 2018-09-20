package osquitoofthenorth.com.sb_github_app.sb_github_app.Activities;


import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import osquitoofthenorth.com.sb_github_app.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainAcitivityTestSearchSingleUser() throws InterruptedException {
        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.search_input),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.support.design.widget.TextInputLayout")),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText.perform(replaceText("octocat "), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.search_button), withText("Search"),
                        childAtPosition(
                                allOf(withId(R.id.search_container),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatButton.perform(click());
        Thread.sleep(2000);
        ViewInteraction textView = onView(
                allOf(withText("The Octocat"),
                        childAtPosition(
                                allOf(withId(R.id.user_info_wrapper),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                                1)),
                                1),
                        isDisplayed()));
        textView.check(matches(withText("The Octocat")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.repo_name), withText("boysenberry-repo-1"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        textView2.check(matches(withText("boysenberry-repo-1")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.repo_description), withText("Testing"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class),
                                        0),
                                1),
                        isDisplayed()));
        textView3.check(matches(withText("Testing")));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.repo_name), withText("git-consortium"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        textView4.check(matches(withText("git-consortium")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.repo_description), withText("This repo is for demonstration purposes only."),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class),
                                        0),
                                1),
                        isDisplayed()));
        textView5.check(matches(withText("This repo is for demonstration purposes only.")));

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.repo_name), withText("hello-worId"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        textView6.check(matches(withText("hello-worId")));

        ViewInteraction textView7 = onView(
                allOf(withId(R.id.repo_description), withText("My first repository on GitHub."),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class),
                                        0),
                                1),
                        isDisplayed()));
        textView7.check(matches(withText("My first repository on GitHub.")));


        ViewInteraction textView8 = onView(
                allOf(withId(R.id.repo_name), withText("Hello-World"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        textView8.check(matches(withText("Hello-World")));


    }

    @Test
    public void mainAcitivityTestFetchDetailedRepoInfo() throws InterruptedException {
        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.search_input),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.support.design.widget.TextInputLayout")),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText.perform(replaceText("octocat "), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.search_button), withText("Search"),
                        childAtPosition(
                                allOf(withId(R.id.search_container),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatButton.perform(click());

        Thread.sleep(2000);
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.repo_info_recycler_view)));

        recyclerView.perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));

        ViewInteraction textView = onView(
                allOf(withId(R.id.value_for_label), withText("May 10, 2018 17:51:31 PM"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.first_line),
                                        0),
                                1),
                        isDisplayed()));
        textView.check(matches(withText("May 10, 2018 17:51:31 PM")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.value_for_label), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.third_line),
                                        0),
                                1),
                        isDisplayed()));
        textView2.check(matches(withText("0")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.value_for_label), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.second_line),
                                        0),
                                1),
                        isDisplayed()));
        textView3.check(matches(withText("1")));

    }
    @Test
    public void mainActivityTestSearchMultipleUsers() throws InterruptedException {
        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.search_input),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.support.design.widget.TextInputLayout")),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText.perform(replaceText("octocat "), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.search_button), withText("Search"),
                        childAtPosition(
                                allOf(withId(R.id.search_container),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatButton.perform(click());
        Thread.sleep(2000);
        ViewInteraction textInputEditText2 = onView(
                allOf(withId(R.id.search_input), withText("octocat "),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.support.design.widget.TextInputLayout")),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText2.perform(click());

        ViewInteraction textInputEditText3 = onView(
                allOf(withId(R.id.search_input), withText("octocat "),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.support.design.widget.TextInputLayout")),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText3.perform(replaceText("osquitoOfTheNorth "));

        ViewInteraction textInputEditText4 = onView(
                allOf(withId(R.id.search_input), withText("osquitoOfTheNorth "),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.support.design.widget.TextInputLayout")),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText4.perform(closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.search_button), withText("Search"),
                        childAtPosition(
                                allOf(withId(R.id.search_container),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatButton2.perform(click());
        Thread.sleep(2000);
        ViewInteraction imageView = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.user_info_wrapper),
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                        1)),
                        0),
                        isDisplayed()));
        imageView.check(matches(isDisplayed()));

        ViewInteraction textView = onView(
                allOf(withId(R.id.repo_name), withText("osquitoOfTheNorth.github.io"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        textView.check(matches(withText("osquitoOfTheNorth.github.io")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.repo_name), withText("project-safe-reef-client"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        textView2.check(matches(withText("project-safe-reef-client")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.repo_name), withText("queRico"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        textView3.check(matches(withText("queRico")));
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
