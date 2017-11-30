package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int cirCount = 0;
        int sqCount = 0;

        monteCarlo mcObj = new monteCarlo(5,3,2);
        for(int i = 0; i <2147000000; i++)
        {
            double x = mcObj.nextRainDrop_x();
            double y = mcObj.nextRainDrop_y();

            if(mcObj.insideCircle(x,y))
            {
                cirCount++;
            }
            sqCount++;
        }
        double side = (2*mcObj.r);
        double pi = (cirCount * side * side )/(sqCount * mcObj.r * mcObj.r);
        System.out.println(pi);
    }
}
