/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scilca.circuit.bridge;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Sukant Pal
 */
public interface View{
    
    public static final short BUTTON_VIEW = 0x1;
    public static final short CONTAINER_VIEW = 0x2;
    
    public void paintComponent(Graphics g);
    
    public short getViewType();
    
}
