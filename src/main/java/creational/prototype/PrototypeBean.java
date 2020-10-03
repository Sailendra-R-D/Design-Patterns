package creational.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrototypeBean {
    private List<String> vehicleList;

    public PrototypeBean() {
        this.vehicleList = new ArrayList<>();
    }

    public PrototypeBean(List<String> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<String> getVehicleList() {
        return vehicleList;
    }

    public void insertData() {
        vehicleList.add("Honda Amaze");
        vehicleList.add("Audi A4");
        vehicleList.add("Hyundai Creta");
        vehicleList.add("Maruti Baleno");
        vehicleList.add("Renault Duster");
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        // deep copy
        return new PrototypeBean(new ArrayList<>(this.getVehicleList()));
    }
}
