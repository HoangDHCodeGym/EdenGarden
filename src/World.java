public class World {
    public static void main(String[] args) {
        God god = new God();
        Snake snake = new Snake();
        Apple apple = new Apple(5);
        Human adam = new Human("Adam", true);
        System.out.println(adam.getName() + " vừa được sinh ra");
        Human eve = new Human("Eve",false);
        System.out.println(eve.getName() + " vừa được sinh ra");
        god.say("Không được ăn táo, nếu ăn sẽ chết");
        snake.say("Ăn táo đi, ngon lắm. Không chết đâu!");
        while (!apple.isEmpty) {
            adam.eat(apple);
            eve.eat(apple);
        }
        adam.sleep();
        eve.sleep();
        god.say("Eve! Bà sẽ phải vâng lời chồng và đau đớn khi sinh con.");
        god.say("Adam! Ngươi sẽ phải cuốc đất trồng cấy mà ăn");
        System.out.println("Hêt!");
    }
}
