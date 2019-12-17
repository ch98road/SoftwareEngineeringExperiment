package junitTest;

import java.awt.*;

/**
 * Created by CHEN on 2019/12/10.
 */
public class Path {


    public static void Coverage(int a, int b, int c, Point p)
    {
        int x = 5;
        int y = 7;
        if(a>b && b>c)
        {
            a += 1;
            x += 6;

            if(a==10 || b>20)
            {
                b += 1;
                x = y+4;
            }

            if(a<10 || c==20)
            {
                b += 2;
                y = 4;
            }

            a = a + b + 1;
            y = x + y;
        }

        if(a>5 || c<10)
        {
            b = c + 5;
            x += 1;
        }

        p.x = x;
        p.y = y;
    }
}
