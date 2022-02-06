package com.company.creatures;

import com.company.devices.Car;

import java.util.Arrays;
import java.util.Objects;


public class Human extends Animal {

    private static final int DEFAULT_GARAGE_SIZE = 5;
    public String firstName;
    public String lastName;
    public Double salary;
    public Double cash;
    public Car[] garage;
    public String mobile;
    public Animal pet;
    private Car car;


    public Human() {
        super("homo sapiens");
        this.firstName = "name";
        this.lastName = "last name";
        this.salary = 0.0;
        this.cash = 0.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
        this.mobile = "xiaomi";

    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Animal getPet() {
        return pet;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary <= 0) {
            System.out.println("Nie będę robiła za darno. No.");
        } else {
            System.out.println("Nowe dane zostały przesłane do księgowego");
            System.out.println("ZUS i US zostały poinformowane o zmianie");
            System.out.println("Proszę odebrać aneks w dziale kadr");
            this.salary = salary;
        }
    }

    public Car getCar(Integer space) {
        if (space != null) {
            car = garage[space];
            return car;
        } else {
            return null;
        }
    }

    public void setCar(Car car, Integer space) {
        if (salary > car.value) {
            if (garage[space] != null) {
                this.garage[space] = car;
                System.out.println("Udało się kupić auto za gotówkę.");
            } else {
                System.out.println("To miejsce w garażu jest już zajęte.");
            }
        } else if (salary > (car.value / 12)) {
            if (garage[space] != null) {
                this.garage[space] = car;
                System.out.println("Kupiłaś auto na kredyt.");
            } else {
                System.out.println("To miejsce w garażu jest już zajęte.");
            }
        } else {
            System.out.println("Nie udało się kupić auta, za mało pieniędzy na koncie");
        }
    }

    public String toString() {
        return "Imie: " + firstName + " Nazwisko: " + lastName;
    }

    public boolean hasCar(Car newCar) {
        for (Car car : this.garage) {
            if (car != null && car.equals(newCar)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpace() {
        int counterSpace = DEFAULT_GARAGE_SIZE;
        for (Car car : this.garage) {
            if (car != null) {
                counterSpace -= 1;
            }
        }
        return counterSpace != 0;
    }

    public void deleteCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
                i = this.garage.length;
                System.out.println(this.firstName + this.lastName + " Usunięto z garażu samochód: " + car);
            } else {
                if (i == this.garage.length - 1) {
                    System.out.println("Nie masz tego auta w garażu");
                }
            }
        }
    }

    public void addCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = car;
                System.out.println(this.firstName + this.lastName + " Dodano do garażu auto w miejsce o numerze: " + i);
                i = this.garage.length;
            } else {
                if (i == this.garage.length - 1) {
                    System.out.println("Nie masz już miejsca w garażu.");
                }
            }

        }
    }

    public void carList() {
        int counter = 0;
        System.out.println(firstName + lastName + "Lista Twoich samochodów w garażu: ");
        for (Car car : garage) {
            if (car != null) {
                counter += 1;
            }
        }
        if (counter > 0) {
            for (int i = 0; i < garage.length; i++) {
                if (this.garage[i] != null) {
                    System.out.println(garage[i]);
                } else {
                    System.out.println("Miejsce numer " + i + " jest puste");
                }
            }
        } else {
            System.out.println("Nie masz żadnych aut w garażu.");
        }
    }

    public Double getGarageValue() {
        Double totalValue = 0.0;
        for (Car car : this.garage) {
            if (car != null) {
                totalValue += car.value;
            }
        }
        return totalValue;
    }

    public void sortCars() {
        Car temp;
        int carCounterNumber = 0;
        Car[] temporaryGarage = new Car[DEFAULT_GARAGE_SIZE];
        for (Car car : garage) {
            if (car != null) {
                carCounterNumber += 1;
            }
        }
        int arrayCounter = 0;
        Integer[] temporaryArray = new Integer[carCounterNumber];
        for (Car car : garage) {
            if (car != null) {
                temporaryArray[arrayCounter] = car.yearOfProduction;
                arrayCounter += 1;
            }
        }
        Arrays.sort(temporaryArray);
        for (int i = 0; i < temporaryArray.length; i++) {
            for (Car car : garage) {
                if (car != null && Objects.equals(temporaryArray[i], car.yearOfProduction)) {
                    temp = car;
                    temporaryGarage[i] = temp;


                }
            }
        }
        garage = temporaryGarage;

    }

    @Override
    protected void test() {

    }

    @Override
    public void feed() {

    }
}
