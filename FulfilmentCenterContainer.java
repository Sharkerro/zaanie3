import java.util.*;

public class FulfilmentCenterContainer {
    Map<String, FulfillmentCenter> listWarehouse = new HashMap<>();
    FulfillmentCenter fulfillmentCenter;

    public void addCenter(String name, double capacity) {
        fulfillmentCenter.capacityWarehouse = capacity;
        listWarehouse.put(name, fulfillmentCenter);

    }

    public void removeCenter(String name) {
        listWarehouse.remove(name);
    }

    public List<FulfillmentCenter> findEmpty() {
        List<FulfillmentCenter> listEmptyWarehouse = new ArrayList<>();
        for (int i = 0; i < listEmptyWarehouse.size(); i++) {
            if (listEmptyWarehouse.get(i).capacityWarehouse == 0) {
                listEmptyWarehouse.add(fulfillmentCenter);
            }
        }
        return listEmptyWarehouse;
    }

    public void summary() {
        System.out.println("Warehouse name:" + fulfillmentCenter.nameWarehouse);
        System.out.println("Warehouse capacity" + fulfillmentCenter.capacityWarehouse / 100 + "%");

    }

    Set<String> keySet = listWarehouse.keySet();
}
