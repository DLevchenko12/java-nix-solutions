package controller;

import dao.DaoManager;

import java.util.Map;

public class ManagerDao<Customer> implements DaoManager<Customer> {

    @Override
    public void manageBespoke(Map<Customer, Integer> t) {

    }

    @Override
    public void deleteCustomer(Customer id) {

    }

    @Override
    public void checkWarehouse() {

    }

    @Override
    public boolean returnOrderStatus() {
        return false;
    }
}
