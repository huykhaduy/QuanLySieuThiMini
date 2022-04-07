package DAL.DataAcessObject;

import DAL.DatabaseConnector.ConnectManager;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public abstract class AbtractAccessDatabase<T> {
    protected ConnectManager connectManager;
    protected BeanListHandler<T> beanListHandler;
    protected BeanHandler<T> beanHandler;


    //Simple query for table
    protected T executeQuery(String query, Object... params) {
        getNewConnectionManager();
        QueryRunner queryRunner = new QueryRunner();
        try{
            return queryRunner.query(connectManager.getConnection(), query, beanHandler, params);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    protected boolean executeUpdate(String query, Object... params) {
        getNewConnectionManager();
        QueryRunner queryRunner = new QueryRunner();
        try{
            int result = queryRunner.update(connectManager.getConnection(), query, params);
            return checkUpdateSuccess(result);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return false;
    }

    protected List<T> executeQueryList(String query) {
        getNewConnectionManager();
        QueryRunner queryRunner = new QueryRunner();
        try{
            return queryRunner.query(connectManager.getConnection(), query, beanListHandler);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    protected void setClazz(Class<T> clazz) {
        this.beanHandler = new BeanHandler<>(clazz);
        this.beanListHandler = new BeanListHandler<>(clazz);
    }

    private void getNewConnectionManager(){
        connectManager = new ConnectManager();
    }

    private boolean checkUpdateSuccess(int result){
        return result > 0;
    }

}
