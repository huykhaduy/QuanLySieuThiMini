package DAL.DataAcessObject;
import java.util.List;

public class AccessorData <T, Id> implements IAccessInterface<T,Id> {

    @Override
    public T find(Id id) {
        return null;
    }

    @Override
    public T save(T entity) {
        return null;
    }

    @Override
    public T update(T entity) {
        return null;
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public List<T> findAll() {
        return null;
    }
}
