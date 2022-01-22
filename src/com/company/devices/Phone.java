package com.company.devices;

public class Phone extends Device{

    String user;
    String memory;
    Double screenWidth;
    private final Integer ramSize;

    public Phone(String producer, String model, Integer yearOfProduction, Integer ramSize, String colour) {
        super(producer, model, yearOfProduction);
        this.ramSize = ramSize;
    }

    public Phone(String producer, String model, Integer yearOfProduction, Integer ramSize) {

        super(producer, model, yearOfProduction);
        this.user = user;
        this.memory = memory;
        this.screenWidth = screenWidth;
        this.ramSize = ramSize;
    }
    public String getRamSize(){
        return this.ramSize + "GB";
    }
    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", user='" + user + '\'' +
                ", memory='" + memory + '\'' +
                ", screenWidth=" + screenWidth +
                '}';
    }


    public void turnOn() {
        System.out.println("wciskam guzik");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("o jest, logo się wyświetla");

    }


    public boolean isTurnedOn() {
        return true;
    }
}
