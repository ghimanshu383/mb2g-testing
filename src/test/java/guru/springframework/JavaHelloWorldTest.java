package guru.springframework;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


public class JavaHelloWorldTest {
    JavaHelloWorld helloWorld;
    @BeforeClass
    public static void setUp(){
        System.out.println("The test is now running ");

    }

    @Test
    public void getHello() {
        helloWorld = new JavaHelloWorld();
        assertEquals("Hello World", helloWorld.getHello());
    }
}