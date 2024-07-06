public class Main {
    public static void main(String[] args) {
        PizzaStore chicagofactory = new chicagoStore();
       Pizza pizza = chicagofactory.orderPizza("cheeze");
       System.out.println("ethan order a pizza "+pizza.getName());
       Pizza pizza1 = chicagofactory.orderPizza("farmhouse");
        System.out.println("ethan order a pizza "+pizza1.getName());


    }
}