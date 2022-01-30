package com.company.devices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device{
    private static final String DEFAULT_APP_SERVER = "appstore.wsb.com";
    private static final String DEFAULT_APP_PROTOCOL = "https://";
    private static final String DEFAULT_APP_VERSION = "latest version";

    String user;
    String memory;
    Double screenWidth;
    private final Integer ramSize;
    private List<String> appNames;

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


    @Override
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

    public void installAnApp(List<String> appNames){
        System.out.println("instalowanie aplikacji z listy");
        for (String appName : appNames) {
            this.installAnApp(appNames);
        }
    }
    public void installAnApp(String name, String appName){
        System.out.println("instalowanie aplikacji wg nazwy: " + appName);
            this.installAnApp(appName, DEFAULT_APP_VERSION);
    }
    public void installAnApp(String appName, String version,String server){
        System.out.println("instalowanie aplikacji wg nazwy: " + appName + " i wersji: " + version);
        this.installAnApp(appName, version, DEFAULT_APP_SERVER);

    }
    public void installAnApp(String appName, String version, String server, String protocol){
        System.out.println("instalowanie aplikacji wg nazwy: " + appName + " i wersji: " + version + "i protokołu: " + protocol);

        try {
            URL url = new URL("https", server, 443, appName + "-" + version);
        } catch (MalformedURLException e)  {
            System.out.println("nie udało się zainstalować aplikacji " + appName);
            e.printStackTrace();
        }

    }
    public void installAnApp(URL url){
        System.out.println("sprawdzanie adresu docelowego: ");

    }
}
