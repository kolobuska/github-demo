package java;

public class Scenario1 {

    @Test
    public void test1() {
        System.out.println("test");
    }


    @Before
    public void initialize() {
        System.out.println("Initialization of webdriver");
    }

    @After
    public void closeDriver() {
        System.out.println("Closing webdriver");
    }


}
