import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1, height + 1);
//                        //Draw a border
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1+2, y1+2, width-4, height-4);
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1+5, y1+5, width-10, height-10);
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x1+8, y1+8, width-16, height-16);
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.setColor(Color.CYAN);
//                        g.drawLine(width, y1, x1, height);
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(width-((width+55)/2), height-((height+55)/2), 55, 55);
                        
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                        
                       
                       
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width, height/5);
                        
                      
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1+height/2, width, (height/5));
                        
                       
                        g.setColor(Color.RED);
                        g.fillRect(x1, height-height/5, width, height/5);
                        
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1 , y1 );
                        p3.addPoint(width/2, height/2);
                        p3.addPoint(x1 , height);
                        
                      
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                        
                      
            }
}