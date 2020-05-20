/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication;
import com.ace.pluginsapplication.interfaces.IShape;
import static java.lang.Math.min;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class Canvas extends Observer {
    public List<IShape> Shapes = new ArrayList<IShape>();
    private int Index=0;
    public int Ax=99;
    public int Ay=99;
    public int Cx=-99;
    public int Cy=-99;
    
    public Canvas(Subject subject)
    {
        this.subject = subject;
        this.subject.add(this);
    }
    public void DrawShapes()
        {
            for(int i=0;i<Shapes.size();i++)
            {
                Shapes.get(i).Draw();
            }
              
        }
    public void AddShape(IShape shape)
    {
        shape.CreateShape();
        Shapes.add(shape);
        Index++;
        
    }
    public void RemoveShapes(int index)
    {
        Shapes.remove(index);
    }
    public void ModifyShapes(int index)
    {
        Shapes.get(index).ModifyShape();
    }

    @Override
    public void update() {
        int ax;
        int ay;
        int cx;
        int cy;
        for(IShape shape:Shapes)
        {
            
            ax = shape.getAx();
            cx =  shape.getCx();
            ay = shape.getAy();
            cy = shape.getCy();
           
            if(ax<Ax)
                Ax=ax;
            if(ay<Ay)
                Ay=ay;
            if(cx>Cx)
                Cx=cx;
            if(cy>Cy)
                Cy=cy;
            
        }
        System.out.print("Board is "+Ax+" "+Ay+"   "+Cx+" "+Cy+'\n');
    }
  
    
}
