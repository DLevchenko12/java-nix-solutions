package dao;

import java.util.List;

public interface DaoService {

    boolean checkOrderStatus();

    void repair();

    void searchBespoke();

    void searchWarehouse(int id);
}
