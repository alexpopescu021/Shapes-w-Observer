/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diamond;
import com.ace.pluginsapplication.interfaces.IPluginsAppPlugin;
import com.ace.pluginsapplication.interfaces.IShape;
/**
 *
 * @author catalin
 */
public class DiamondPlugin implements IPluginsAppPlugin {

    @Override
    public String getUniqueNameText() {
        return "DiamondPlugin";
    }

    @Override
    public String getDisplayText() {
        return "Diamond";
    }

    @Override
    public IShape getShape() {
        return new Diamond();
    }
    
}
