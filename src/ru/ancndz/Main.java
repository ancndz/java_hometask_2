package ru.ancndz;

import ru.ancndz.task1.mov.Movie;
import ru.ancndz.task1.staff.WorkGroups;
import ru.ancndz.task1.staff.Worker;
import ru.ancndz.task2.zoo.Zoo;
import ru.ancndz.task2.zoo.living.Animal;
import ru.ancndz.task2.zoo.living.Staff;
import ru.ancndz.task2.zoo.stuff.Journal;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Movie terminator = new Movie("The Terminator", 1984);

        terminator.setScenario("James Cameron", "https://en.wikipedia.org/wiki/The_Terminator", "107I");

        terminator.getScenario().addCharacter("The Terminator", "Male", "main anti-hero");
        terminator.getScenario().addCharacter("Sarah Connor", "Female", "main hero");
        terminator.getScenario().addCharacter("Kyle Reese", "Male", "main hero");

        terminator.addLocations("Future", "World");
        terminator.addLocations("Los Angeles", "USA");

        //массив работников
        Worker[] terminatorEditors = new Worker[2];
        terminatorEditors[0] = new Worker("First Worker", "i don't know at all");
        terminatorEditors[1] = new Worker("Second Worker", "i don't know at all");

        WorkGroups terminatorWorkGroup = new WorkGroups("Hemdale Film Corporation");
        terminatorWorkGroup.setVisioTeam("HFC Visio Group", terminatorEditors);
        terminatorWorkGroup.getHeadTeam().setDirectors(new String[] {"James Cameron"});
        terminatorWorkGroup.getHeadTeam().setProducers(new String[] {"Gale Anne Hurd"});

        terminator.setStaff(terminatorWorkGroup);

        terminator.printMovie();

        //отдельный вывод на экран - вывели сару коннор
        terminator.getScenario().getCharacters().get(1).printCharacter();

        System.out.println("\n////////////////////////////////////////////////////////////");

        Movie snatch = new Movie("snatch", 2000);

        snatch.setScenario("Guy Ritchie", "https://en.wikipedia.org/wiki/Snatch_(film)", "102I");

        snatch.getScenario().addCharacter("Turkish", "Male", "main");
        snatch.getScenario().addCharacter("Mickey O'Neil", "Male", "main");
        snatch.getScenario().addCharacter("Tommy", "Male", "main");
        snatch.getScenario().addCharacter("\"Brick Top\" Pulford", "Male", "main");
        snatch.getScenario().addCharacter("Vinny", "Male", "main");
        snatch.getScenario().addCharacter("Boris \"The Blade\" Yurinov", "Male", "main");

        snatch.addLocations("New York", "USA");

        //массив работников
        Worker[] snatchEditors = new Worker[2];
        snatchEditors[0] = new Worker("First Worker", "i don't know at all");
        snatchEditors[1] = new Worker("Second Worker", "i don't know at all");

        WorkGroups snatchWorkGroup = new WorkGroups("Columbia Pictures");
        snatchWorkGroup.setVisioTeam("Sony Visio Group", snatchEditors);
        snatchWorkGroup.getHeadTeam().setDirectors(new String[] {"Guy Ritchie"});
        snatchWorkGroup.getHeadTeam().setProducers(new String[] {"Matthew Vaughn"});

        snatch.setStaff(snatchWorkGroup);

        snatch.printMovie();
        
        snatch.getScenario().getCharacters().get(1).printCharacter();

        System.out.println("\n////////////////////////////////////////////////////////////");

        Movie resDogs = new Movie("Reservoir Dogs", 1992);

        resDogs.setScenario("Quentin Tarantino", "https://en.wikipedia.org/wiki/Reservoir_Dogs", "99I");

        resDogs.getScenario().addCharacter("Mr. White/Larry Dimmick", "Male", "main");
        resDogs.getScenario().addCharacter("Mr. Orange/Freddy Newandyke", "Male", "main");
        resDogs.getScenario().addCharacter("Mr. Blonde/Vic Vega", "Male", "main");
        resDogs.getScenario().addCharacter("Mr. Pink", "Male", "main");
        resDogs.getScenario().addCharacter("\"Nice Guy\" Eddie Cabot", "Male", "main");
        resDogs.getScenario().addCharacter("Mr. Blue", "Male", "main");

        resDogs.addLocations("Los Angeles", "USA");

        //массив работников
        Worker[] resDogsEditors = new Worker[2];
        resDogsEditors[0] = new Worker("First Worker", "i don't know at all");
        resDogsEditors[1] = new Worker("Second Worker", "i don't know at all");

        WorkGroups resDogsWorkGroup = new WorkGroups("Miramax Films");
        resDogsWorkGroup.setVisioTeam("Dog Eat Dog Productions", resDogsEditors);
        resDogsWorkGroup.getHeadTeam().setDirectors(new String[] {"James Cameron"});
        resDogsWorkGroup.getHeadTeam().setProducers(new String[] {"Gale Anne Hurd"});

        resDogs.setStaff(resDogsWorkGroup);

        resDogs.printMovie();

        resDogs.getScenario().getCharacters().get(1).printCharacter();

        System.out.println("\n////////////////////////////////////////////////////////////");

        System.out.println("\n////////////////////////////////////////////////////////////");
        System.out.println("\n///////////////////// Задание 2 /////////////////////////////");
        System.out.println("\n////////////////////////////////////////////////////////////");

        ArrayList<Animal> zooAnimals = new ArrayList<>();
        ArrayList<Journal> zooJournals = new ArrayList<>();

        zooAnimals.add(new Animal("bird", "jonathan livingston", "2 years"));
        zooJournals.add(new Journal(zooAnimals.get(0)));
        zooAnimals.add(new Animal("fish", "Clown Eddie", "1.2 years"));
        zooJournals.add(new Journal(zooAnimals.get(1)));
        zooAnimals.add(new Animal("bear", "Snowball", "5 years"));
        zooJournals.add(new Journal(zooAnimals.get(2)));

        ArrayList<Staff> zooStaff = new ArrayList<>();

        zooStaff.add(new Staff("Person 1", 10, "Birds"));
        zooStaff.add(new Staff("Person 2", 10, "Birds"));
        zooStaff.add(new Staff("Person 3", 10, "Birds"));
        zooStaff.add(new Staff("Person 4", 10, "Birds"));

        Zoo zoo = new Zoo("Z-O(3)", zooAnimals, zooStaff, zooJournals);

        //добавили первому работнику в список заботы нашего медведя
        zoo.getStaff().get(0).addCareAnimal(zooAnimals.get(2));
        zoo.getAnimals().get(2).addCareStaff(zoo.getStaff().get(0));
        //животное заболело, сотрудник, который за ним закреплен вносит правки в журнал животного
        zoo.getAnimals().get(2).animalSick();
        zoo.getAnimals().get(2).getJournal().addPage("First page in sick history", zoo.getAnimals().get(2).getCareStaff().get(0));
        //пытаемся уволить сотрудника
        zoo.fireStaff(zoo.getStaff().get(0));
    }

}
