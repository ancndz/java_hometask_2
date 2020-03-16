package ru.ancndz.task2.zoo;

import ru.ancndz.task2.zoo.living.Animal;
import ru.ancndz.task2.zoo.living.Staff;
import ru.ancndz.task2.zoo.stuff.Journal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String title;
    private ArrayList<Animal> animals;
    private ArrayList<Staff> staff;
    private ArrayList<Journal> journals;

    public Zoo(String title, ArrayList<Animal> animals, ArrayList<Staff> staff, ArrayList<Journal> journals) {
        this.title = title;
        this.animals = animals;
        this.staff = staff;
        this.journals = journals;
    }

    public ArrayList<Journal> getJournals() {
        return journals;
    }

    public void addStaff(Staff person) {
        this.staff.add(person);
    }

    //удалить сотрдуника можем только если у него нет таких животных, у которого этот сотрудник - последний.
    //метод у сотрудника getAloneAnimal возвращает животное, если такое существует и null если таких животных нет
    public void fireStaff(Staff person) {
        Animal caredAnimal = person.getAloneAnimal();
        if (caredAnimal == null) {
            this.staff.remove(person);
        } else {
            System.out.printf("Нельзя удалить работника! он ухаживает за %s!", caredAnimal.getName());
        }
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }


    //при удалении животного сначала чистится это животное у каждого работника из списка заботы
    public void delAnimal(Animal animal) {
        animal.delAllCareStaff();
        this.animals.remove(animal);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }
}
