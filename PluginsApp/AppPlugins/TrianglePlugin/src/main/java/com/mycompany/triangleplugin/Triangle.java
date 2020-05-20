/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.triangleplugin;
import com.ace.pluginsapplication.interfaces.IShape;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Triangle implements IShape{
    public int Ax;
    public int Ay;
    public int Bx;
    public int By;
    public int Cx;
    public int Cy;
    public Triangle(){};
    
    public Triangle(int ax,int ay,int bx,int by,int cx,int cy)
    {
        this.Ax = ax;
        this.Ay = ay;
        this.Bx = bx;
        this.By = by;
        this.Cx = cx;
        this.Cy = cy;
    }
    @Override
    public void Draw() {
        System.out.println("Triangle Ax = "+Ax+" Ay = "+Ay+"Bx = "+Bx+" By = "+By+"Cx = "+Cx+" Cy = "+Cy);
        
    }

    @Override
    public void ModifyShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ax = ");
        int ax = scanner.nextInt();
        System.out.print("Ay = ");
        int ay = scanner.nextInt();
         System.out.print("Bx = ");
        int bx = scanner.nextInt();
        System.out.print("By = ");
        int by = scanner.nextInt();
         System.out.print("Cx = ");
        int cx = scanner.nextInt();
        System.out.print("Cy = ");
        int cy = scanner.nextInt();
        
        this.Ax = ax;
        this.Ay = ay;
        this.Bx = bx;
        this.By = by;
        this.Cx = cx;
        this.Cy = cy;
        
    }

    @Override
    public void CreateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ax = ");
        int ax = scanner.nextInt();
        System.out.print("Ay = ");
        int ay = scanner.nextInt();
         System.out.print("Bx = ");
        int bx = scanner.nextInt();
        System.out.print("By = ");
        int by = scanner.nextInt();
         System.out.print("Cx = ");
        int cx = scanner.nextInt();
        System.out.print("Cy = ");
        int cy = scanner.nextInt();
        
        this.Ax = ax;
        this.Ay = ay;
        this.Bx = bx;
        this.By = by;
        this.Cx = cx;
        this.Cy = cy;
        
        //Circle circle = new Circle(X,Y,Diam);
        //face 2 obiecte, nu mai face new aici, alta metoda cumva
        //inca 3 forme geoemtrice      
    }

    @Override
    public void read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAx() {
        return Bx;
    }

    @Override
    public int getCx() {
return Cx;    }

    @Override
    public int getAy() {
return By;    }

    @Override
    public int getCy() {
return Ay;    }

  
}
