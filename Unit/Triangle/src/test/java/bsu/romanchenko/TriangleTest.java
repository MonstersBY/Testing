package bsu.romanchenko;

import org.testng.annotations.Test;
import org.testng.Assert;

public class TriangleTest {
    private Triangle t = new Triangle();

    @Test
    public void Test1(){
        final boolean actual = this.t.Tri(4,2,5);
        final boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Test2(){
        final boolean actual = this.t.Tri(1,2,3);
        final boolean expected = false;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Test3(){
        final boolean actual = this.t.Tri(8,3,3);
        final boolean expected = false;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Test4(){
        final boolean actual = this.t.Tri(2,7,8);
        final boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Test5(){
        final boolean actual = this.t.Tri(6,6,6);
        final boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Test6(){
        final boolean actual = this.t.Tri(-1,-1,-1);
        final boolean expected = false;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Test7(){
        final boolean actual = this.t.Tri(2,-7,8);
        final boolean expected = false;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Test8(){
        final boolean actual = this.t.Tri(9,2,11);
        final boolean expected = false;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Test9(){
        final boolean actual = this.t.Tri(9,3,9);
        final boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Test10(){
        final boolean actual = this.t.Tri(4,5,3);
        final boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

}
