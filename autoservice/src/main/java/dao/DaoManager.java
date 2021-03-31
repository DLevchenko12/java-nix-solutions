package dao;

import java.util.Map;

public interface DaoManager<T> {

    void manageBespoke(Map<T, Integer> t);

    void deleteCustomer(T id);

    void checkWarehouse();

    boolean returnOrderStatus();

}
