/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.Component;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author huykh
 */
public class ScrollPanel extends JScrollPane{
    private final JPanel panel;
    private int width;
    private int height;
    private int hGap = 10;
    private int wGap = 10;
    
    public ScrollPanel(int width, int height){
        panel = new JPanel();
        this.setViewportView(panel);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setViewportBorder(BorderFactory.createEmptyBorder());
        this.width = width;
        this.height = height;
        panel.setPreferredSize(new Dimension(this.width,this.height));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT,wGap,hGap));
        panel.setBackground(Color.white);
//        this.putClientProperty("JScrollBar.width", 50);
//        this.setBorder(null);
//        setOpaque(false);
    }
    
    public Component addToPanel(Component comp){
        Component com = panel.add(comp);
        panel.revalidate();
        panel.repaint();
        System.out.println(panel.getPreferredSize());
        return com;
    }
    
    
    private Dimension getChildComponentSize(){
        if (panel.getComponentCount() == 0)
            return new Dimension(0,0);
        return new Dimension((int) panel.getComponent(0).getPreferredSize().getWidth(), calculateHeight());
    }
    
    private int calculateHeight(){
        if (panel.getComponentCount() == 0 || getChildComponentSize().getWidth() == 0 || getChildComponentSize().getHeight() == 0)
            return (int) panel.getPreferredSize().getHeight();
        int maxInCol = (int) (panel.getPreferredSize().getWidth() / getChildComponentSize().getWidth());
        int maxInRow = (int) (panel.getComponentCount() / maxInCol);
        maxInRow = maxInCol == 0 ? 1 : maxInRow;
        int weight = (int) (maxInRow*(getChildComponentSize().getHeight()+1));
        return weight;
    }

    public int gethGap() {
        return hGap;
    }

    public void sethGap(int hGap) {
        this.hGap = hGap;
    }

    public int getwGap() {
        return wGap;
    }

    public void setwGap(int wGap) {
        this.wGap = wGap;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        panel.setPreferredSize(new Dimension(this.width,this.height));
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        panel.setPreferredSize(new Dimension(this.width,this.height));
    }
    
    public JPanel getPanel(){
        return panel;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);
        g2d.dispose();
        super.paintComponent(g);
    }
    
}
