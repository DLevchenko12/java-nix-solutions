package controller;

import dao.DaoCustomer;
import model.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerDao<Service> implements DaoCustomer<Customer> {
    @Override
    public Optional<Customer> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public void placeOrder(Customer customer, String[] params) {

    }

    @Override
    public void deleteOrder(Customer customer) {

    }
}
