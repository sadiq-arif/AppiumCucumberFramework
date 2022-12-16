package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tests.TestBase;

import java.net.MalformedURLException;

public class Hooks extends TestBase {

    @Before
    public void setUp() throws MalformedURLException {
        Android_Setup();
    }

    @After
    public void close() {
        tearDown();
    }
}
