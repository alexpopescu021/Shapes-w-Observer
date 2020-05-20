/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication;

import com.ace.pluginsapplication.interfaces.IShape;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author catalin
 */
public class PluginApp {
    
    public static void main(String[] args)
    {
        Subject sub = new Subject();
        
        Canvas canvas = new Canvas(sub);  
        
        Menu mainMenu = initializeMainMenu(canvas);           
        mainMenu.execute();
                
    }
    private static Menu initializeMainMenu(Canvas canvas)
    {
        PluginManager pluginMan = new PluginManager();
        ApplicationMenu addMenu = new ApplicationMenu(pluginMan);
        
        ArrayList<IMenuItem> mainMenuItems = new ArrayList();
        
        addMenu.load(canvas); //incarcat o singura data
        mainMenuItems.add(new MenuItem("Add", 1, (parameters)->{
       
        addMenu.execute();}));
        //Canvas canvas = new Canvas();
        
        Scanner scanner = new Scanner(System.in);
        
        
        mainMenuItems.add(new MenuItem("Delete", 2, (parameters)->{
        System.out.println("Please enter the index of the shape to be deleted");
           int i=scanner.nextInt();
           canvas.RemoveShapes(i);
            }));        
        mainMenuItems.add(new MenuItem("Modify", 3, (parameters)->{
        System.out.println("Please enter the index of the shape to be Modified");
           int i=scanner.nextInt();
           canvas.ModifyShapes(i);
           }));        
        mainMenuItems.add(new MenuItem("Show Canvas", 4,(parameters)->{canvas.DrawShapes(); canvas.update();} ));        
        
        return new Menu("Main Menu", 0, mainMenuItems); 
        
        
    }
}
