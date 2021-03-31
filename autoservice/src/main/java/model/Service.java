package model;

import java.util.Map;

public class Service {

    private boolean reparationStatus;
    private int id;
    private Map<String, Integer> bespokeDetails;
    private Map<String, Integer> repairDetails;

    public Service() {
    }

    public Service(boolean reparationStatus, int id) {
        this.reparationStatus = reparationStatus;
        this.id = id;
    }

    public Service(boolean reparationStatus, int id, Map<String, Integer> bespokeDetails, Map<String, Integer> repairDetails) {
        this.reparationStatus = reparationStatus;
        this.id = id;
        this.bespokeDetails = bespokeDetails;
        this.repairDetails = repairDetails;
    }

    public boolean isReparationStatus() {
        return reparationStatus;
    }

    public void setReparationStatus(boolean reparationStatus) {
        this.reparationStatus = reparationStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, Integer> getBespokeDetails() {
        return bespokeDetails;
    }

    public void setBespokeDetails(Map<String, Integer> bespokeDetails) {
        this.bespokeDetails = bespokeDetails;
    }

    public Map<String, Integer> getRepairDetails() {
        return repairDetails;
    }

    public void setRepairDetails(Map<String, Integer> repairDetails) {
        this.repairDetails = repairDetails;
    }

    @Override
    public String toString() {
        return "Service{" +
                "reparationStatus=" + reparationStatus +
                ", id=" + id +
                ", bespokeDetails=" + bespokeDetails +
                ", repairDetails=" + repairDetails +
                '}';
    }
}
