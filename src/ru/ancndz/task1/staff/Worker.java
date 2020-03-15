package ru.ancndz.task1.staff;

public class Worker {
    //класс отдельного гражданина - работника

    private String name;
    private String position;

    public void printWorker() {
        System.out.printf("\n\tName: %s\n\tPosition: %s",
                this.name, this.position);
    }

    //сеттер на его должность (может же поменяться по ходу фильма по решению начальства?)
    public void changePosition(String position) {
        this.position = position;
    }

    public Worker(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

}
