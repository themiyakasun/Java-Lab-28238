/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Heezi
 */
abstract class Shape {
    public abstract double calculateArea();

    public void display() {
        System.out.println("Shape: " + getClass().getSimpleName());
        System.out.println("Area: " + calculateArea());
    }
}
