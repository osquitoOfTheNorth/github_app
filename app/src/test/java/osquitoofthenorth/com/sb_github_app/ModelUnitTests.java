package osquitoofthenorth.com.sb_github_app;


import org.junit.Assert;
import org.junit.Test;

import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.ObservableString;
import osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 *
 *
 *
 *
 */
public class ModelUnitTests {


    /**
     *
     *
     *  * NOTE TO EVALUATOR: I ran into issues running these non-instrumented unitttests
     *  after running the instrumented ones with a ClassDefNotFound error on the parcelable
     *  in my RepoInfo class.
     *
     *  If this happens to you,  Run the following on the command line:
     *
     *  gradle mockableAndroidJar --info
     *
     *  gradle mockableAndroidJar --rerun-tasks
     *
     *  or the gradle wrapper equivalent:
     *
     *  ./gradlew mockableAndroidJar --info
     *
     *  ./gradlew mockableAndroidJar --rerun-tasks
     *
     *
     */



    @Test
    public void dateFormatterModelTestHappyPath() {
        RepoInfo info = new RepoInfo("test", "test", "2016-04-14T21:29:25Z", 1,1);
        String formattedDate = info.formattedLastUpdated();
        Assert.assertTrue(formattedDate.equals("Apr 14, 2016 21:29:25 PM"));
    }

    @Test
    public void dateFormatterModelTestHandlesInvalidInputs() {
        RepoInfo info = new RepoInfo("test", "test", "201T21:29:25Z", 1,1);
        String formattedDate = info.formattedLastUpdated();
        Assert.assertTrue(formattedDate.equals(""));
    }

    @Test
    public void dateFormatterModelTestHandlesInvalidInputs2() {
        RepoInfo info = new RepoInfo("test", "test", "", 1,1);
        String formattedDate = info.formattedLastUpdated();
        Assert.assertTrue(formattedDate.equals(""));
    }

    @Test
    public void testObservableStringModel1() {
        ObservableString str = new ObservableString("test");
        Assert.assertTrue(str.getStringValue().equals("test"));
        str.setStringValue("newtest");
        Assert.assertTrue(str.getStringValue().equals("newtest"));
    }



}