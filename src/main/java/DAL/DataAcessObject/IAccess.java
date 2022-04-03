package DAL.DataAcessObject;

import java.util.List;

public interface IAccess<T,Id> {
    T find(Id id);
    T save(T entity);
    T update(T entity);
    void delete(Id id);
    List<T> findAll();
}
