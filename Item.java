public class Item implements Comparable<Item> {
    public String name;
    public ItemCondition itemCondition;
    public double weight;
    public int amount;

    public Item(String name, ItemCondition itemCondition, double weight, int amount) {
        this.name = name;
        this.itemCondition = itemCondition;
        this.weight = weight;
        this.amount = amount;
    }

    public void Print() {
        System.out.println("Name of the Item:" + name);
        System.out.println("Item Condition:" + itemCondition);
        System.out.println("Weight of the Item:" + weight);
        System.out.println("Quantity of the Item:" + amount);
    }

    @Override
    public int compareTo(Item o) {
        return 0;
    }
}
