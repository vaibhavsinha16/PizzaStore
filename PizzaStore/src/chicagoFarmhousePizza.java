public class chicagoFarmhousePizza extends  Pizza{
    public chicagoFarmhousePizza()
    {
        name = "chicago style farmhouse pizza";
        dough = "sdf";
        sauce = "mayo";
        toppings.add("onion");
    }

    void cut()
    {
        System.out.println("cutting into circle pieces");
    }
}
