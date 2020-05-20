/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.squareplugin;

import com.ace.pluginsapplication.interfaces.IShape;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Square implements IShape{
      public int Ax;
    public int Ay;
    public int Cx;
    public int Cy;
    public Square(){};
    public Square(int X,int Y,int x,int y)
    {
        this.Ax = X;
        this.Ay = Y;
        this.Cx = x;
        this.Cy = y;
    }

   
    @Override
    public void Draw() {
        System.out.println("Square Ax = "+Ax+" Ay = "+Ay+" Cx = "+Cx+" Cy = "+Cy);
        
    }

    @Override
    public void ModifyShape() {
Scanner scanner = new Scanner(System.in);
        System.out.print("Ax = ");
        int X = scanner.nextInt();
        System.out.print("Ay = ");
        int Y = scanner.nextInt();
        System.out.print("Cx = ");
        int x = scanner.nextInt();
        System.out.print("Cy = ");
        int y = scanner.nextInt();
        this.Ax = X;
        this.Ay = Y;
        this.Cx = x;
        this.Cy = y;
       }

    @Override
    public void CreateShape() {
 Scanner scanner = new Scanner(System.in);
         System.out.print("Ax = ");
        int X = scanner.nextInt();
        System.out.print("Ay = ");
        int Y = scanner.nextInt();
        System.out.print("Cx = ");
        int x = scanner.nextInt();
        System.out.print("Cy = ");
        int y = scanner.nextInt();
         this.Ax = X;
        this.Ay = Y;
        this.Cx = x;
        this.Cy = y;
    }

    @Override
    public void read() {
        System.out.println("read square"); 
    }

      @Override
    public int getAx() {
        return Ax;
    }

    @Override
    public int getCx() {
        return Cx;
    }

    @Override
    public int getAy() {
        return Ay;
    }

    @Override
    public int getCy() {
        return Cy;
    }
}

