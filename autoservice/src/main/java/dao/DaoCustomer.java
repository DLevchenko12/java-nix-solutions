package dao;

import java.util.List;
import java.util.Optional;

public interface DaoCustomer<T> {

    Optional<T> get(long id);

    List<T> getAll();

    void placeOrder(T t, String[] params);

    void deleteOrder(T t);
}
