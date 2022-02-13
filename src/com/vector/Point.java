package com.vector;

public class Point {

    //state
    private final double x;
    private final double y;
    private final double z;

    //getters
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public double getZ()
    {
        return z;
    }

    //Constructor if we are passing values
    public Point(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    //An extra constructor if we want to pass objects
    public Point(Point points)
    {
        this.x = points.x;
        this.y = points.y;
        this.z = points.z;
    }

}
