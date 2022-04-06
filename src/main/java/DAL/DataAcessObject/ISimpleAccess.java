package DAL.DataAcessObject;

import java.util.List;

//Interface dùng cho các bản ghi có trong database
public interface ISimpleAccess<T> {
    //Insert datatype T into database by common SQL command: INSERT INTO
    boolean insert(T t);

    //Delete rows has primary key equals to id (or maybe we change property of IS_DELETED to true)
    boolean delete(Integer id);

    //Update row has id by t properties
    boolean update(Integer id, T t);

    //Get row has id: SELECT * FROM table WHERE id = id
    T select(Integer id);

    //Get all rows in the table: SELECT * FROM table
    List<T> selectAll();
}