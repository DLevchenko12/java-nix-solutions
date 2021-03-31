package controller;

import dao.DaoService;
import model.Service;

public class ServiceDao implements DaoService<Service> {
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
}
