package DAL.DataAcessObject;

import java.util.List;

//This table for access data of detail table
//Interface dùng cho các bản chi tiết ...
public interface ISimpleAccessDetail<T>{
    T select(Integer id1, Integer id2);
    boolean insert(T t);
    boolean update(Integer id1, Integer id2, T t);
    boolean delete(Integer id1, Integer id2);
    List<T> selectAllById1(Integer id1);
    List<T> selectAllById2(Integer id2);
    List<T> selectAll();
}
