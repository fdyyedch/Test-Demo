package mavenJavaTest;

import org.junit.Assert;
import mavenJava.Demo;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testSay(){
        Demo d=new Demo();
        String ret=d.say("javamaven");
        Assert.assertEquals("hello javamaven",ret);
    }
}
