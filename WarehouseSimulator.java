public class WarehouseSimulator {
    public static void main (String[] args)
    {
        Item item1=new Item("placek",ItemCondition.NEW ,100,50);
        Item item2=new Item("placek",ItemCondition.NEW ,100,50);
        Item item3=new Item("placek",ItemCondition.NEW ,100,50);
           FulfillmentCenter fulfillmentCenter1 =new FulfillmentCenter();
           fulfillmentCenter1.addProduct(item1);
        fulfillmentCenter1.addProduct(item1);
        fulfillmentCenter1.addProduct(item1);
        fulfillmentCenter1.summary();

    }
}
