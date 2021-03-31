package controller;

import dao.DaoCustomer;
import model.Customer;
import bl.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

public class CustomerDao<Service> extends Util implements DaoCustomer<Service> {

    Connection connection = getConnection();

    @Override
    public Optional<Service> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Service> getAll() {
        return null;
    }

    @Override
    public void placeOrder(Service order, String[] params) {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO ORDERS (CUSTOMERID, DESCRIPTION) " +
                "VALUES(";

    }

    @Override
    public void deleteOrder(Service order) {

    }
}
