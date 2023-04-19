package homeworks.hw1804.task2;

class Phone {
    private String number;
    private String model;
    private int weight;

    Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    String getNumber() {
        return number;
    }

    String getPhonesInfo() {
        return "Phone's number: " + number + ", model: " + model + ",  weight: " + weight + " g.";
    }
}
