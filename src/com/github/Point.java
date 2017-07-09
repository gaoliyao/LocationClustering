package com.github;

/**
 * Created by mars on 09/07/2017.
 */
public class Point {

    public double x;
    public double y;
    public  double index;
    public  double start_index;
    public  double end_index;

    public Point(double xx, double yy){
        x = xx;
        y = yy;
    }

    Point (Point p){
        x = p.x;
        y = p.y;
    }

    Point (String str){
        int index = str.indexOf(",");
        x = Double.parseDouble(str.substring(0,index-1));
        y = Double.parseDouble(str.substring(index+1));
    }



}