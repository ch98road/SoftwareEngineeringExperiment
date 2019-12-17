package junitTest;

import org.junit.Test;

import java.awt.*;

/**
 * Created by CHEN on 2019/12/10.
 */
public class PathTest {


    @Test
    public void test() {
        Point p = new Point(0, 0);
        Path.Coverage(30, 25, 20, p);
        System.out.println(p);

        p = new Point(0, 0);
        Path.Coverage(20, 21, 20, p);
        System.out.println(p);

        p = new Point(0, 0);
        Path.Coverage(-1, 10, -5, p);
        System.out.println(p);

        p = new Point(0, 0);
        Path.Coverage(3, 1, 1, p);
        System.out.println(p);

        p = new Point(0, 0);
        Path.Coverage(24, 21, 20, p);
        System.out.println(p);

        p = new Point(0, 0);
        Path.Coverage(9, 8, 7, p);
        System.out.println(p);

        p = new Point(0, 0);
        Path.Coverage(8, 7, 6, p);
        System.out.println(p);

        p = new Point(0, 0);
        Path.Coverage(21, 22, 23, p);
        System.out.println(p);

    }


}
