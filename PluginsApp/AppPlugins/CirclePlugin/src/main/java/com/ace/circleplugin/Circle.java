/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.circleplugin;

import com.ace.pluginsapplication.Observer;
import com.ace.pluginsapplication.Subject;
import com.ace.pluginsapplication.interfaces.IShape;
import java.util.Scanner;

/**
 *
 * @author catalin
 */
public class Circle extends Subject implements  IShape  {

    public int x;
    public int y;
    public int radius;
    public Circle(){};
    public void setX(int X)
            {
                this.x=X;
                
            }
     public void setY(int Y)
            {
                this.y=Y;
            }
      public void setradius(int radius)
            {
                this.radius=radius;
            }
    public Circle(int X,int Y,int radius)
    {
        
        this.x = X;
        this.y = Y;
        this.radius  = radius;
    }
    @Override
    public void Draw() {
        System.out.println("Circle x = "+x+" y = "+y+" radius = "+radius);
        
    }

    @Override
    public void ModifyShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        int X = scanner.nextInt();
        System.out.print("y = ");
        int Y = scanner.nextInt();
        System.out.print("radius = ");
        int radius = scanner.nextInt();
   
        this.radius = radius;
        this.x = X;
        this.y = Y;
        
    }

    @Override
    public void CreateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        int X = scanner.nextInt();
        System.out.print("y = ");
        int Y = scanner.nextInt();
        System.out.print("radius = ");
        int radius = scanner.nextInt();
        this.radius = radius;
        this.x = X;
        this.y = Y;
        
        //Circle circle = new Circle(X,Y,radius);
        //face 2 obiecte, nu mai face new aici, alta metoda cumva
        //inca 3 forme geoemtrice
      
    }

   

    @Override
    public void read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAx() {
        return x-radius;
    }

    @Override
    public int getCx() {
return  x+radius;    }

    @Override
    public int getAy() {
return y-radius;
    }

    @Override
    public int getCy() {
return  y+radius;    }

   
}
