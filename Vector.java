package com.vector;
import java.lang.Math;

public class Vector {

    private final Point points;

    //Constructor
    public Vector(Point points)
    {
        this.points = points;
    }

    //toString method
    public String toString()
    {
        return String.format("( X - %.2f, Y - %.2f, Z - %.2f )",points.getX(),points.getY(),points.getZ());
    }

    //method for finding the length of the vector
    public double length()
    {
        double x = this.points.getX();
        double y = this.points.getY();
        double z = this.points.getZ();

        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
    }

    //method for finding sum of two vectors
    public Vector sum(Vector vector_input)
    {
        double x = (this.points.getX() + vector_input.points.getX());
        double y = (this.points.getY() + vector_input.points.getY());
        double z = (this.points.getZ() + vector_input.points.getZ());

        return new Vector(new Point(x,y,z));
    }

    //method for finding difference of two vectors
    public Vector diff(Vector vector_input)
    {
        double x = (this.points.getX() - vector_input.points.getX());
        double y = (this.points.getY() - vector_input.points.getY());
        double z = (this.points.getZ() - vector_input.points.getZ());

        return new Vector(new Point(x,y,z));
    }

    //method for finding the dot product of two vectors
    public double mul(Vector vector_input)
    {
        double x = (this.points.getX() * vector_input.points.getX());
        double y = (this.points.getY() * vector_input.points.getY());
        double z = (this.points.getZ() * vector_input.points.getZ());

        return (x+y+z);
    }
    //method for finding the angle of cosine between two vectors
    public double angle(Vector vector_input1, Vector vector_input2)
    {
        double mul = vector_input1.mul(vector_input2);
        double length1 = vector_input1.length();
        double length2 = vector_input2.length();

        return Math.acos((mul/(length1*length2)));
    }
}
