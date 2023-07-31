
package com.mycompany.containerobj;

public class CylindricalContainer extends Container {
   private double height;
    private double radius;

    public CylindricalContainer(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    } 
}
