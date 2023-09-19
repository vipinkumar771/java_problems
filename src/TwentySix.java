import java.util.ArrayList;
import java.util.List;

class Toy{
    double price;
    String color;
    Toy(String color, double price){
        this.color= color;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
}

public class TwentySix {
    public static void main(String[] args) {
        List<Toy> toys = new ArrayList<>();
        toys.add(new Toy("red", 10));
        toys.add(new Toy("Yellow", 10));
        toys.add(new Toy("red", 10));
        double totalPrice = toys.stream().filter(e->e.getColor() == "red").peek(e->e.getPrice()).count();
            System.out.println("Total price of Red Toys: " + totalPrice);
        }
}
//
// Add given the code fragment

// .map(e->e.getPrice()
// .peek(e->getPrice() ans
// .mapToDouble(e->e.getPrice()
// .flatMap(e->e.getPrice()