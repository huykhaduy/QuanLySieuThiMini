/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.Component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.imgscalr.Scalr;

/**
 *
 * @author huykh
 */
public class ImagePanel extends JPanel{
    private ImageIcon image;
    public final static String imgDirectory = "src/main/java/Assets/Image/";
    public final static String imgExtension = ".png";
    
    public ImagePanel (String url){
        image = new ImageIcon(imgDirectory+url+imgExtension);
    }
    
    public ImagePanel(){
        image = new ImageIcon();
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
    
    public Icon getImage() {
        return image;
    }
    
    public void setImagePath(String url){
        this.image = new ImageIcon(imgDirectory+url+imgExtension);
        System.out.println(imgDirectory+url+imgExtension);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if (this.image != null){
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(java.awt.RenderingHints.KEY_INTERPOLATION, java.awt.RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            BufferedImage imageBuffer = getImgBuffer(this.image);
            BufferedImage buff = Scalr.resize(imageBuffer, getWidth());
            g2d.drawImage(buff,0,0,null);
            g2d.dispose();
        }
    }
    
    private BufferedImage getImgBuffer(ImageIcon icon){
        BufferedImage bi = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();
        return bi;
    }
    
}
