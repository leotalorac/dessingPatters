package Factory;

public class main {
    public static void main(String[] args) {
        RestaurantFactoryProducer restaurantFactoryProducer = new RestaurantFactoryProducer();
        RestaurantAbstractFactory restaurantAbstractFactory = restaurantFactoryProducer.getRestaurantAbstractFactory(1);
        Drink beer = restaurantAbstractFactory.getDrink("beer");

    }
}