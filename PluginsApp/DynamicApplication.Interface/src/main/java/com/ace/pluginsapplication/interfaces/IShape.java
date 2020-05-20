/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication.interfaces;

import com.ace.pluginsapplication.Subject;

/**
 *
 * @author catalin
 */
public interface IShape {
   
    public void Draw();
    public void CreateShape();
   public void ModifyShape();
   
    public void read();

    public int getAx();

    public int getCx();

    public int getAy();

    public int getCy();

}
