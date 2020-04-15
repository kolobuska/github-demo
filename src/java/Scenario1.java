package java;

public class Scenario1 {

    @Test
    public void test1() {
        System.out.println("test");
    }


    @BeforeTest
    public void initialize() {
        System.out.println("Initialization of webdriver");
    }

    @AfterTest
    public void closeDriver() {
        System.out.println("Closing webdriver");
    }


}
