import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;


/**
 * Created by thialves
 * On 10/10/17
 * For testeIntegracao
 **/
public class testLongest {

    @Before
    public void setUp(){
        Longest l = new Longest(3);
        Longest z = new Longest(5);
    }

//    @Test
//    public void testMain() throws IOException {
//        String[] args = null;
//        final InputStream original = System.in;
//        final FileInputStream fips = new FileInputStream(new File("/Users/thialves/Desktop/V&V/src/test/java/numbers.txt"));
//        System.setIn(fips);
//        Longest.main(args);
//        System.setIn(original);
//    }

    @Test
    public void testLong1(){
        Longest l = new Longest(3);
        l.generateQuot();
        Assert.assertEquals(l.getQuot(), 0);
    }

    @Test
    public void testLong2(){
        Longest z = new Longest(6);
        z.generateQuot();
        Assert.assertEquals(z.getQuot(),0);
    }

    @Test
    public void testToBinary(){
       Longest z = new Longest(6);
       Longest l = new Longest(3);
       z.generateQuot();
       l.generateQuot();
       Assert.assertEquals(z.printBinary(), "110");
       Assert.assertEquals(l.printBinary(), "11");
    }
    	
    @Test 
    public void testCleanBinary(){
        Longest z = new Longest(6);
        Longest l = new Longest(10);
        z.generateQuot();
        z.printBinary();
        z.cleanBinary();
        l.generateQuot();
        l.printBinary();
        l.cleanBinary();
        Assert.assertEquals(z.getI(), 1);
        Assert.assertEquals(l.getI(), 2);
    }
    
    @Test
    public void testGetLongest() {
    		Longest z = new Longest(121212);
        Longest l = new Longest(1000);
        Longest w = new Longest(12345);
        z.generateQuot();
        z.printBinary();
        z.cleanBinary();
        l.generateQuot();
        l.printBinary();
        l.cleanBinary();
        w.generateQuot();
        w.printBinary();
        w.cleanBinary();
        Assert.assertEquals(z.getLongestSequence(), 2);
        Assert.assertEquals(l.getLongestSequence(), 1);
        Assert.assertEquals(w.getLongestSequence(), 6);
    }
}
