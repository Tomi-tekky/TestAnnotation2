import org.testng.annotations.*;

public class TestAnnotation2 {

    @BeforeClass
    void beforeClass()
    {
        System.out.println("This would execute before every Class ");//write selenium test
    }

    @AfterClass
    void AfterClass()
    {
        System.out.println("This would execute after every Class ");//write selenium test
    }

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This would execute before every Method ");//write selenium test
    }

    @AfterMethod
    void afterMethod()
    {
        System.out.println("This would execute after every Method");//write selenium test
    }

    @Test()
    void test1()
    {
        System.out.println("login");//write selenium test
    }

    @Test()
    void test2()
    {
        System.out.println("close browser");//write selenium test
    }

}
