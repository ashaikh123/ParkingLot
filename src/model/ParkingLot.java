package model;

import model.enums.VehicleType;
import model.enums.Status;
import java.util.List;
import java.util.Map;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloor;
    private List<Gate> gates;
    private Status Status;
    private String name;
    private String address;
    private Map<VehicleType,Integer> baseRateMap;

    public List<ParkingFloor> getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(List<ParkingFloor> parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public model.enums.Status getStatus() {
        return Status;
    }

    public void setStatus(model.enums.Status status) {
        Status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<VehicleType, Integer> getBaseRateMap() {
        return baseRateMap;
    }

    public void setBaseRateMap(Map<VehicleType, Integer> baseRateMap) {
        this.baseRateMap = baseRateMap;
    }
}
