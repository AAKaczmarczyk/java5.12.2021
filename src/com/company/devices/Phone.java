package com.company.devices;

public class Phone extends Device{

    String user;
    String memory;
    Double screenWidth;
    private final Integer ramSize;

    public Phone(String producer, String model, Integer yearOfProduction, Integer ramSize, String colour) {
        super(producer, model, yearOfProduction, colour);
        this.ramSize = ramSize;
    }

    public Phone(String producer, String model, Integer yearOfProduction, String user, String colour, String memory, Double screenWidth, Integer ramSize) {

        super(producer, model, yearOfProduction, colour);
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
                ", colour='" + colour + '\'' +
                ", memory='" + memory + '\'' +
                ", screenWidth=" + screenWidth +
                '}';
    }
}
