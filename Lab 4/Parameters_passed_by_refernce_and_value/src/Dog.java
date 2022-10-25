class Dog {
    static int dogCount = 0;

    public Dog() {
        dogCount += 1;
    }

    public static void main(String[] args) {
        new Dog();
        new Dog();
        new Dog();
        System.out.println("Frog count is now " + Dog.dogCount);
    }
}
