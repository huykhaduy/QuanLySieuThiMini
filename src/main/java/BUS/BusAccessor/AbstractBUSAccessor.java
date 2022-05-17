/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.ISimpleAccess;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 *
 * @author huykh
 * @param <Data> where T : new()
 * @param <DAO> where T : new()
 */

public abstract class AbstractBUSAccessor<Data, Key, DAO extends ISimpleAccess<Data, Key>> implements IBussAccess<Data, Key> {
    protected DAO dao;

    public AbstractBUSAccessor() {
    }

    @Override
    public Data get(Key key) {
        return dao.select(key);
    }

    @Override
    public List<Data> getAll() {
        return dao.selectAll();
    }

    @Override
    public boolean add(Data data) {
        return dao.insert(data);
    }

    @Override
    public boolean edit(Key key, Data data) {
        return dao.update(key, data);
    }

    @Override
    public boolean remove(Key key) {
        return dao.delete(key);
    }

    @Override
    public Data getNewest() {
        List<Data> list = dao.selectAll();
        return list == null ? null : list.get(list.size() - 1);
    }

    public DAO getDao() {
        return dao;
    }

    public void setDao(DAO dao) {
        this.dao = dao;
    }

}
