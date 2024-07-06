public class chicagoStore extends PizzaStore{

    @Override
    Pizza createPizza(String item) {
        if(item.equalsIgnoreCase("cheeze"))
            return new chicagoCheezePizza();
        if(item.equalsIgnoreCase("farmhouse"))
            return new chicagoFarmhousePizza();
        return null;
    }
}
