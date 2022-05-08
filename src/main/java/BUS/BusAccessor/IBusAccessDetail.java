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
interface IBusAccessDetail<DataType> {
    // Chi tiet thi se co 2 khoa. VD: chitiethoadon se co khoa chinh la mahoadon va masp
    // Lay thong tin
    DataType get(int key1, int key2);
    // Lay thong tin bang khoa 1
    List<DataType> getByKey1(int key1);
    // Lay thong tin bang khoa 2
    List<DataType> getByKey2(int key2);
    // Lay tat ca thong tin
    List<DataType> getAll();
    // Them doi tuong
    boolean add(DataType data);
    // Sua doi tuong co khoa 1 va khoa 2
    boolean edit(int key1, int key2, DataType data);
    // Xoa doi tuong co khoa 1 va khoa 2
    boolean remove(int key1, int key2);
}
