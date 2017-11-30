package com.company;
import java.util.*;
public class monteCarlo {

    private Random rndm = new Random();
    public double h, k, r;
    public monteCarlo(double hh, double kk, double rr)
    {
        h = hh;
        k = kk;
        r = rr;
    }

    public double nextRainDrop_x()
    {
         double rand_x = (h - r) + (2*r) * rndm.nextDouble();
         return rand_x;
    }

    public double nextRainDrop_y()
    {
        double rand_y = (k - r) + (2*r) * rndm.nextDouble();
        return rand_y;
    }

    public boolean insideCircle(double x, double y)
    {
        boolean returnValue = false;
        if((x-h)*(x-h) + (y-k)*(y-k)<= (r*r))
        {
            returnValue =true;
        }
        return returnValue;
    }
}
