package junitTest;

import org.junit.Test;

/**
 * Created by CHEN on 2019/12/10.
 */
public class RectTest {
    @Test
    public void test() {
        Rect r = new Rect();
        System.out.println(r );
    }

    @Test
    public void test2() {
        Rect r = new Rect(null);
        System.out.println(r );
        Rect r2 = new Rect(new Point2d(2,3));
        System.out.println(r2 );

    }
    @Test
    public void test3() {
        Rect r = new Rect(null,1,2);
        System.out.println(r );
        Rect r2 = new Rect(new Point2d(2,3),1,2);
        System.out.println(r.getArea() );
        System.out.println(r.getPerimeter() );
        System.out.println(r );
    }


}
