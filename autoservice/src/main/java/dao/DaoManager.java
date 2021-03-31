package dao;

import model.Customer;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface DaoManager<T> {

    List<T> getAll() throws SQLException;

    T getCustomer(int id);

    void manageBespoke(Map<String, Integer> t);

    void deleteCustomer(int id);

    void addCustomer(Customer customer) throws SQLException;

    void checkWarehouse();

    void checkOrders();

    boolean returnOrderStatus();

}
