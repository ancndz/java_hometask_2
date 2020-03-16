package ru.ancndz.task2.zoo.living;

import ru.ancndz.task2.zoo.stuff.Journal;

import java.util.ArrayList;

public class Animal {
    private String animalType; //рыба / птица и т.д.
    private String name;
    private String age;
    private boolean isSick = false; //болеет или нет
    private String character; //характер
    private String extra; // дополнительно о животном
    private ArrayList<Staff> careStaff = new ArrayList<>();
    private Journal journal = null;

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    public Journal getJournal() {
        return journal;
    }

    public Animal(String animalType, String name, String age, String character, String extra) {
        this(animalType, name, age);
        this.character = character;
        this.extra = extra;
    }

    public Animal(String animalType, String name, String age) {
        this.animalType = animalType;
        this.name = name;
        this.age = age;
    }

    public void addCareStaff(Staff person) {
        this.careStaff.add(person);
    }

    public ArrayList<Staff> getCareStaff() {
        return careStaff;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }


    //в данном методе ведется удаление выбранного человека у животного. Если этот человек единственный (после удаления список пустой)
    //удаление отменяется.
    public boolean delCareStaff(Staff person) {
        this.careStaff.remove(person);
        if (this.careStaff.isEmpty()) {
            this.careStaff.add(person);
            System.out.println("Этот человек единственный ухаживает за данным животным! Операция прервана.");
            return false;
        } else return true;
    }

    //метод для удаления данного животного у каждого работника, который закреплен за ним
    public void delAllCareStaff() {
        for (Staff staff: this.careStaff) {
            if (!staff.delCareAnimal(this)) {
                //срабатывает, если у человека нет в списке заботы этого животного
                System.out.printf("\nОшибка при удалении сотрудника %s у животного %s", staff.getName(), this.getName());
            }
        }
    }

    public void animalSick() {
        this.isSick = true;
        System.out.println("Animal is sick.");
    }

    public void animalNotSick() {
        this.isSick = false;
        System.out.println("Animal is not sick!");
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public boolean isSick() {
        return isSick;
    }

    public String getCharacter() {
        return character;
    }

    public String getExtra() {
        return extra;
    }
}
