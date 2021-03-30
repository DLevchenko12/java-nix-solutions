package dao;

import model.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerDao implements Dao<Customer> {
    @Override
    public Optional<Customer> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public void save() {

    }

    @Override
    public void update(Customer customer, String[] params) {

    }

    @Override
    public void delete(Customer customer) {

    }
}
