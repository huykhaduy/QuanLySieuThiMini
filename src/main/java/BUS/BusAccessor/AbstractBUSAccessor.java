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
public abstract class AbstractBUSAccessor<Data, DAO extends ISimpleAccess<Data, Integer>> implements IBussAccess<Data,Integer> {

    protected Class<DAO> clazz;
    protected DAO dao;

    public AbstractBUSAccessor() {
    }

    protected DAO createDAO(Class<DAO> clazz) {
        try {
            this.dao = clazz.getDeclaredConstructor().newInstance();
            return this.dao;
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.out.println("Error create class");
        }
        return null;
    }

    @Override
    public Data get(Integer key) {
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
    public boolean edit(Integer key, Data data) {
        return dao.update(key, data);
    }

    @Override
    public boolean remove(Integer key) {
        return dao.delete(key);
    }

    @Override
    public Data getNewest() {
        List<Data> list = dao.selectAll();
        return list == null ? null : list.get(list.size() - 1);
    }

    public Class<DAO> getClazz() {
        return clazz;
    }

    public void setClazz(Class<DAO> clazz) {
        this.clazz = clazz;
    }

    public DAO getDao() {
        return dao;
    }

    public void setDao(DAO dao) {
        this.dao = dao;
    }

}
