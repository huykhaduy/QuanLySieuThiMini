package DAL.DataAcessObject;

import java.util.List;

public interface IAccessDetail<T, Key1, Key2> {
    List<T> findType1(Key1 key1);
    List<T> findType2(Key2 key2);
    T save(T t);
    T update(T t);
    void delete(Key1 key1, Key2 key2);
}
