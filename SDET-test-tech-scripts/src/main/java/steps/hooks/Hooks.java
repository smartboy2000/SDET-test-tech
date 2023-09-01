package steps.hooks;

import io.cucumber.java.*;

import java.io.File;

import static com.autong.base.TestBase.*;

public class Hooks {

    static int pass, fail, skip;

    @Before
    public void testInitiator() {
    }

    @BeforeAll
    public static void setup() {
        deleteFolder(new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/"));
    }

    @After
    public void testClosure(Scenario scenario) {
        Status status = scenario.getStatus();
        if (status.equals(Status.PASSED)) {
            pass++;
        } else if (status.equals(Status.FAILED)) {
            takeScreenshot(System.getProperty("user.dir") + "/src/test/resources/screenshots/"
                    + scenario.getName() + ".png");
            fail++;
        } else if (status.equals(Status.SKIPPED)) {
            skip++;
        }
    }

    @AfterAll
    public static void tearDown() {
        closeActiveSessions();
    }
}
