package controller;

import bl.Util;
import dao.DaoManager;
import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ManagerDao<T> extends Util implements DaoManager<T> {

    Connection connection = getConnection();

    @Override
    public List<T> getAll() throws SQLException {
        List<Customer> customerList = new ArrayList<>();

        String sql = "SELECT * FROM CUSTOMERS";

        Statement statement = null;

        try {
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()) {
                Customer customer = new Customer();
                customer.setId(resultSet.getInt("ID"));
                customer.setName(resultSet.getString("NAME"));
                customer.setSurname(resultSet.getString("SURNAME"));
                customer.setPhoneNumber(resultSet.getString("PHONE_NUMBER"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(statement != null) {
                statement.close();
            }
            if(connection != null) {
                connection.close();
            }
        }
        return (List<T>) customerList;
    }

    @Override
    public T getCustomer(int id) {
        return null;
    }

    @Override
    public void manageBespoke(Map<String, Integer> t) {

    }

    @Override
    public void deleteCustomer(int id) {

    }

    @Override
    public void addCustomer(model.Customer customer) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO CUSTOMERS (NAME, SURNAME, PHONE_NUMBER) VALUES(?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getSurname());
            preparedStatement.setString(3, customer.getPhoneNumber());

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public void checkWarehouse() {

    }

    @Override
    public void checkOrders() {

    }

    @Override
    public boolean returnOrderStatus() {
        return false;
    }
}
