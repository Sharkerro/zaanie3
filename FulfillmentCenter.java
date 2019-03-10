import java.util.*;

public class FulfillmentCenter implements Comparable<Item> {
    public Scanner scanner = new Scanner(System.in);
    public String nameWarehouse;
    List<Item> list = new ArrayList<Item>();
    public double capacityWarehouse;
    Item i1 = Collections.max(list, new Comparator<Item>() {
        @Override
        public int compare(Item o1, Item o2) {
            return Integer.compare(o1.amount, o2.amount);
        }
    });

    public void addProduct(Item item) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(item.name)) {
                if (list.get(i).weight + item.weight > capacityWarehouse) {
                    System.err.println("Capacity Warehouse has been exceeed.");
                } else {
                    list.get(i).weight += item.weight;
                }
            } else
                list.add(item);
        }
    }

    public void getProduct(Item item) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).amount - 1 == 0) {
                list.remove(list.get(i));
            } else {
                list.get(i).amount -= 1;
            }
        }
    }

    public void removeProduct(Item item) {
        list.remove(item);
    }

    public Item search(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.compareTo(name) == 0) {
                return list.get(i);
            }
        }
        return null;


    }

    public List<Item> searchPartial(String name) {
        List<Item> listItem = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.contains(name)) {
                listItem.add(list.get(i));
            }
        }
        return listItem;
    }

    public int[] countByCondition(ItemCondition itemCondition) {
        int tab[] = new int[3];
        int sumRefurbished = 0;
        int sumNew = 0;
        int sumeUser = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).itemCondition == itemCondition.REFURBISHED) {
                sumRefurbished += 1;
            } else {
                if (list.get(i).itemCondition == itemCondition.NEW) {
                    sumNew += 1;
                } else {
                    if (list.get(i).itemCondition == itemCondition.USER) {
                        sumeUser += 1;
                    }
                }

            }

        }
        tab[0] = sumNew;
        tab[1] = sumeUser;
        tab[2] = sumRefurbished;
        return tab;
    }

    public void summary() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Product number." + i + ":" + list.get(i));
        }
    }

    public List<Item> sortByName() {
        Collections.sort(list);
        return list;
    }

    public List<Item> sortByAmount() {
        int swap = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j).amount > list.get(j + 1).amount) {
                    swap = list.get(j + 1).amount;
                    list.get(j + 1).amount = list.get(i).amount;
                    list.get(j).amount = swap;
                }
            }
        }
        return list;

    }


    @Override
    public int compareTo(Item o) {
        return 0;
    }
}


