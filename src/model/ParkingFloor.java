package model;

import java.util.List;
import model.enums.Status;

public class ParkingFloor extends BaseModel{
    private int number;
    private List<ParkingSlot> parkingSlots;
    private Status Status;
    private Operator parkingFloorOperator;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public Status getParkingFloorStatus() {
        return Status;
    }

    public void setParkingFloorStatus(Status parkingFloorStatus) {
        this.Status = parkingFloorStatus;
    }

    public Operator getParkingFloorOperator() {
        return parkingFloorOperator;
    }

    public void setParkingFloorOperator(Operator parkingFloorOperator) {
        this.parkingFloorOperator = parkingFloorOperator;
    }
}
