import java.util.ArrayList;
import java.util.List;

public class AppleRunner {
    public static void main(String[] args) {

        List<Apple> inventory=new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(75,Color.YELLOW));
        inventory.add(new Apple(175,Color.RED));
        inventory.add(new Apple(250,Color.GREEN));
        inventory.add(new Apple(325,Color.RED));
        inventory.add(new Apple(205,Color.YELLOW));
        inventory.add(new Apple(50,Color.GREEN));


        List<Apple>heavyApple= filterApples(inventory,new AppleWeightPredicate());
        System.out.println(heavyApple);

    }
    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){
        List<Apple> result=new ArrayList<>();

        for (Apple apple:inventory
             ) {
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return  result;
    }

}
