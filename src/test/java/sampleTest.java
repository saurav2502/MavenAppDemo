import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class sampleTest {
    @Test
    public void sampleFail(){
        int a=0;
        int b=4;
        assertTrue(a+b == 4);
    }
    @Test
    public void samplePass(){
        int a=0;
        int b=5;
        assertTrue(a+b == 5);
    }
}
