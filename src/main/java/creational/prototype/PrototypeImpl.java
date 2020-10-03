package creational.prototype;

import interfaces.DesignPatternInterface;

import java.util.List;

public class PrototypeImpl implements DesignPatternInterface {

    @Override
    public void implement() throws CloneNotSupportedException {
        PrototypeBean bean = new PrototypeBean();
        bean.insertData();

        PrototypeBean anotherBean = (PrototypeBean) bean.clone();
        List<String> lstVehicles = anotherBean.getVehicleList();
        lstVehicles.add("Honda new Amaze");

        System.out.println(bean.getVehicleList());
        System.out.println("**********************");
        System.out.println(lstVehicles);
    }
}
