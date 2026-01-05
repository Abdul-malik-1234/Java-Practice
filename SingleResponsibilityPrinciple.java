// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class BreadBaker{
    public void bakeBread(){
        System.out.println("baking bread.....");
    }
}

class InventoryManager{
    public void manageInventory(){
        System.out.println("Managing inventory..");
    }
}

class SupplyOrder{
    public void ordersupplies(){
        System.out.println("Order the supplies..");
    }
}
class CustomerService{
    public void customerservice(){
        System.out.println("Serving the customer..");
    }
}
class BakeryCleaner{
    public void cleanBakery(){
        System.out.println("Cleaning bakery..");
    }
}
class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        BreadBaker b=new BreadBaker();
        InventoryManager i=new InventoryManager();
        SupplyOrder s=new SupplyOrder();
        CustomerService c=new CustomerService();
        BakeryCleaner bc=new BakeryCleaner();
        b.bakeBread();
        i.manageInventory();
        s.ordersupplies();
        c.customerservice();
        bc.cleanBakery();
    }
}