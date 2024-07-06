import java.util.ArrayList;
import java.util.SimpleTimeZone;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();
    void prepare(){

    };
    void bake()
    {

    };
    void cut(){

    };
    void box(){};

    public String getName() {
        return this.name;
    }
}
