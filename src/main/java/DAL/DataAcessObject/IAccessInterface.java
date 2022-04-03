package DAL.DataAcessObject;

import DAL.DatabaseConnector.ConnectManager;

import java.sql.Connection;
import java.util.List;

public interface IAccessInterface<T,Id> {
    T find(Id id);
    T save(T entity);
    T update(T entity);
    void delete(Id id);
    List<T> findAll();
}
