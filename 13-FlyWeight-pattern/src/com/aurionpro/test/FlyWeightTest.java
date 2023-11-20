package com.aurionpro.test; 
 
import com.aurionpro.model.CircleShapefactory; 
import com.aurionpro.model.IShape; 
 
public class FlyWeightTest { 
    public static void main(String[] args) { 
        String[] colors = {"Red", "Blue", "Green", "Red", "Blue", "Yellow"}; 
 
        CircleShapefactory factory = new CircleShapefactory(); 
 
        for (String color : colors) { 
            IShape temp = factory.getCircle(color); 
            temp.draw(); 
        } 
    } 
}