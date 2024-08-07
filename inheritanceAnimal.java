class inheritanceAnimal {
    void eat() {
        System.out.println("i am hungry");
    }
}

class cat extends inheritanceAnimal {
    void run() {
        System.out.println("cat is running so fast");
    }

    public static void main(String[] args) {
        cat d = new cat();
        d.eat();
        d.run();
    }

}
