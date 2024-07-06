public class chicagoCheezePizza extends  Pizza{

    public chicagoCheezePizza()
    {
        name = "chicago style cheeze pizza";
        dough = "sdf";
        sauce = "chille";
        toppings.add("onion");
    }

    void cut()
    {
        System.out.println("cutting into sqaure pieces");
    }
}
