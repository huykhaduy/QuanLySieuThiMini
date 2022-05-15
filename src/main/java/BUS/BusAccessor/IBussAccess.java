/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import java.util.List;

/**
 *
 * @author huykh
 */
interface IBussAccess<DataType,id> {
    // Lay thong tin doi tuong
    DataType get(id key);  
    // Lay tat ca doi tuong
    List<DataType> getAll();
    // Them doi tuong
    boolean add(DataType data);
    // Chinh sua doi tuong
    boolean edit(id key, DataType data);
    // Xoa doi tuong
    boolean remove(id key);
    // Lay khoa chinh moi nhat
    DataType getNewest();
}
