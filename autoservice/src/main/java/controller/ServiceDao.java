package controller;

import dao.DaoService;

public class ServiceDao implements DaoService {
    @Override
    public boolean checkOrderStatus() {
        return false;
    }

    @Override
    public void repair() {

    }

    @Override
    public void searchBespoke() {

    }

    @Override
    public void searchWarehouse(int id) {

    }
}
