package ru.ancndz.task2.zoo.living;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private String name;
    private int expMonths = 0;
    private String animalCareClass; //класс животного для ухода (птицы / животные / рыбы и т.д.)
    private ArrayList<Animal> careAnimals = new ArrayList<>();


    public Animal getAloneAnimal() {
        for (Animal each: careAnimals) {
            each.getCareStaff().remove(this);
            if (each.getCareStaff().isEmpty()) {
                each.getCareStaff().add(this);
                //System.out.println("Этот сотрудник последний!");
                return each;
            } else {
                each.getCareStaff().add(this);
                //return false;
            }
        }
        return null;
    }

    public void addCareAnimal(Animal animal) {
        this.careAnimals.add(animal);
    }


    public boolean delCareAnimal(Animal animal) {
        try {
            this.careAnimals.remove(animal);
            return true;
        } catch (Exception e) {
            System.out.println("Удаление не завершено. Оно существует?");
            System.out.println(e.getMessage());
            return false;
        }
    }

    //без стажа
    public Staff(String name, String animalCareClass) {
        this.name = name;
        this.animalCareClass = animalCareClass;
    }

    public Staff(String name, int expMonths, String animalCareClass) {
        this(name, animalCareClass);
        this.expMonths = expMonths;
    }

    public String getName() {
        return name;
    }

    public int getExpMonths() {
        return expMonths;
    }

    public String getAnimalCareClass() {
        return animalCareClass;
    }

    public ArrayList<Animal> getCareAnimals() {
        return careAnimals;
    }
}
