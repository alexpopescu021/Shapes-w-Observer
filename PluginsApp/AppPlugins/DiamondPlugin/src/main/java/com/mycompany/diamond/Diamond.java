/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diamond;
import com.ace.pluginsapplication.interfaces.IShape;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Diamond implements IShape{
    public int diag1Ax;
    public int diag1Ay;
    public int diag2Bx;
    public int diag2By;
    public Diamond(){};
   
    public Diamond(int X,int Y,int x, int y)
    {
        this.diag1Ax = X;
        this.diag1Ay = Y;
        this.diag2Bx = x;
        this.diag2By = y;
    }
    @Override
    public void Draw() {
        System.out.println("Diamond Diag1("+diag1Ax+", "+diag1Ay+") "+"Diag2("+diag2Bx+", "+diag2By+")");
        
    }

    @Override
    public void ModifyShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("diag1Ax = ");
        int X = scanner.nextInt();
        System.out.print("diag1Ay = ");
        int Y = scanner.nextInt();
        System.out.print("diag2Bx = ");
        int x = scanner.nextInt();
        System.out.print("diag2By = ");
        int y = scanner.nextInt();
       
        this.diag1Ax = X;
        this.diag1Ay = Y;
         this.diag2Bx = x;
        this.diag2By = y;
        
    }

    @Override
    public void CreateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("diag1Ax = ");
        int X = scanner.nextInt();
        System.out.print("diag1Ay = ");
        int Y = scanner.nextInt();
        System.out.print("diag2Bx = ");
        int x = scanner.nextInt();
        System.out.print("diag2By = ");
        int y = scanner.nextInt();
        
      this.diag1Ax = X;
        this.diag1Ay = Y;
         this.diag2Bx = x;
        this.diag2By = y;
    }

   

    @Override
    public void read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAx() {
return diag1Ax;    }

    @Override
    public int getCx() {
return diag1Ay;    }

    @Override
    public int getAy() {
return diag2Bx;    }

    @Override
    public int getCy() {
return diag2By;    }

  


  
}
