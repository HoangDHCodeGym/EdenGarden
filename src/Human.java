public class Human extends LivingBeing {
    private String name;
    private boolean gender;
    private int age;

    public Human(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isGender() {
        return gender;
    }

    public void eat(Apple food) {
        if (food.weight <= 0) {
            System.out.println("Táo đã ăn hết");
            food.isEmpty = true;
        } else {
            System.out.println(this.name + " đã cắn một miếng");
            food.weight -= 1;
        }
    }

    public void sleep() {
        System.out.println(this.name + "đã đi ngủ");
    }
}
