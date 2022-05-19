/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.ManageGroup.ManageItem.ManageBasicHandler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

/**
 *
 * @author TUANMINH
 */
public class TableClickedListener extends MouseAdapter{
    private JTable table;
    private int row;
    
    TableClickedListener(JTable table){
        this.table = table;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        this.row = table.getSelectedRow();
    }
    
    public String[] getDataAtRow(int row){
        String[] data = new String[this.table.getColumnCount()];
        
        for(int i = 0; i < data.length ; i++){
            data[i] = (String) this.table.getValueAt(row, i);
        }
        return data;
    }
    
}
