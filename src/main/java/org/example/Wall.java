package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public double setWidth( double width){
        this.width = width;

        if (width < 0){
            return this.width = 0.0;
        } else {
            return this.width;
        }
    }

    public double setHeight( double height){
        this.height = height;

        if (height < 0){
            return this.height = 0.0;
        } else {
            return this.height;
        }
    }

    public double getArea(){
        return this.width * this.height;
    }
}