package Factory;

public class MainRestaurant {
    public static void main(String[] args) {
        RestaurantFactoryProducer restaurantFactoryProducer = new RestaurantFactoryProducer();
        RestaurantAbstractFactory restaurantAbstractFactory1 = restaurantFactoryProducer.getRestaurantAbstractFactory(1);
        RestaurantAbstractFactory restaurantAbstractFactory2 = restaurantFactoryProducer.getRestaurantAbstractFactory(2);
        System.out.println("Soda on restaurant 1: " + restaurantAbstractFactory1.getDrink("soda"));
        System.out.println("Beer on restaurant 2: " + restaurantAbstractFactory2.getDrink("soda"));
        System.out.println();
        System.out.println("Beer on restaurant 1: " + restaurantAbstractFactory1.getFastFood("pizza"));
        System.out.println("Beer on restaurant 2: " + restaurantAbstractFactory2.getFastFood("pizza"));
    }
}