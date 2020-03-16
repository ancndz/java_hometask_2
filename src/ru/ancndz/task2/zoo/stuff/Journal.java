package ru.ancndz.task2.zoo.stuff;

import ru.ancndz.task2.zoo.living.Animal;
import ru.ancndz.task2.zoo.living.Staff;

import java.util.ArrayList;


public class Journal {
    private Animal animal;
    private ArrayList<String> pages = new ArrayList<>();
    private Staff lastModifiedBy = null;

    public Journal(Animal animal) {
        this.animal = animal;
        animal.setJournal(this);
    }

    public void addPage(String page, Staff staff) {
        this.pages.add(page);
        this.lastModifiedBy = staff;
    }

    public boolean delPage(int pos) {
        try {
            this.pages.remove(pos);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public Animal getAnimal() {
        return animal;
    }

    public ArrayList<String> getPages() {
        return pages;
    }

    public Staff getLastModifiedBy() {
        return lastModifiedBy;
    }
}
