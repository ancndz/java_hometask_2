package ru.ancndz.task1;

import ru.ancndz.task1.mov.Movie;
import ru.ancndz.task1.mov.Movie.Scenario;
import ru.ancndz.task1.staff.WorkGroups;
import ru.ancndz.task1.staff.Worker;

public class Main {

    public static void main(String[] args){

        //предисловие: очень много static методов

        //массив героев фильма
        Scenario.Character[] terminatorCharacters = new Scenario.Character[3];

        terminatorCharacters[0] = new Scenario.Character("The Terminator", "Male", "main anti-hero");
        terminatorCharacters[1] = new Scenario.Character("Sarah Connor", "Female", "main hero");
        terminatorCharacters[2] = new Scenario.Character("Kyle Reese", "Male", "main hero");

        //создаем объект "сценарий" с массивом героев и подробностями
        Scenario terminatorScenario = new Scenario("James Cameron", "https://en.wikipedia.org/wiki/The_Terminator", "107I", terminatorCharacters);

        //массив локаций
        Movie.Location[] terminatorLocations = new Movie.Location[2];

        terminatorLocations[0] = new Movie.Location("Future", "World");
        terminatorLocations[1] = new Movie.Location("Los Angeles", "USA");

        //массив работников
        Worker[] terminatorEditors = new Worker[2];
        terminatorEditors[0] = new Worker("First Worker", "i don't know at all");
        terminatorEditors[1] = new Worker("Second Worker", "i don't know at all");

        //создаем объект группы работников с массивом и названием
        WorkGroups.VisioTeam terminatorVisioTeam = new WorkGroups.VisioTeam("HFC Visio Group", terminatorEditors);
        //создаем объект главных работников (в моем случае режиссеры и продюссеры)
        WorkGroups.HeadTeam terminatorHeadTeam = new WorkGroups.HeadTeam(new String[] {"James Cameron"}, new String[] {"Gale Anne Hurd"});

        //создаем объект группы производства
        WorkGroups terminatorStaff = new WorkGroups("Hemdale Film Corporation", terminatorVisioTeam, terminatorHeadTeam);

        //создаем объект фильма с производственной площадкой, сценарием и локациями
        Movie terminator = new Movie("Terminator", 1984, terminatorScenario, terminatorLocations, terminatorStaff);

        //детальный вывод на экран
        terminator.printMovie();

        //отдельный вывод на экран - вывели сару коннор
        terminator.getScenario().getCharacters()[1].printCharacter();

        System.out.println("\n////////////////////////////////////////////////////////////");

        //массив героев фильма
        Scenario.Character[] snatchCharacters = new Scenario.Character[6];

        snatchCharacters[0] = new Scenario.Character("Turkish", "Male", "main");
        snatchCharacters[1] = new Scenario.Character("Mickey O'Neil", "Male", "main");
        snatchCharacters[2] = new Scenario.Character("Tommy", "Male", "main");
        snatchCharacters[3] = new Scenario.Character("\"Brick Top\" Pulford", "Male", "main");
        snatchCharacters[4] = new Scenario.Character("Vinny", "Male", "main");
        snatchCharacters[5] = new Scenario.Character("Boris \"The Blade\" Yurinov", "Male", "main");

        //создаем объект "сценарий" с массивом героев и подробностями
        Scenario snatchScenario = new Scenario("Guy Ritchie", "https://en.wikipedia.org/wiki/Snatch_(film)", "102I", snatchCharacters);

        //массив локаций
        Movie.Location[] snatchLocations = new Movie.Location[1];

        snatchLocations[0] = new Movie.Location("New York", "USA");

        //массив работников
        Worker[] snatchEditors = new Worker[2];
        snatchEditors[0] = new Worker("First Worker", "i don't know");
        snatchEditors[1] = new Worker("Second Worker", "i don't know");

        //создаем объект группы работников с массивом и названием
        WorkGroups.VisioTeam snatchVisioTeam = new WorkGroups.VisioTeam("Sony Visio Group", snatchEditors);
        //создаем объект главных работников (в моем случае режиссеры и продюссеры)
        WorkGroups.HeadTeam snatchHeadTeam = new WorkGroups.HeadTeam(new String[] {"Guy Ritchie"}, new String[] {"Matthew Vaughn"});

        //создаем объект группы производства
        WorkGroups snatchStaff = new WorkGroups("Columbia Pictures", snatchVisioTeam, snatchHeadTeam);

        //создаем объект фильма с производственной площадкой, сценарием и локациями
        Movie snatch = new Movie("snatch", 2000, snatchScenario, snatchLocations, snatchStaff);

        //детальный вывод на экран
        snatch.printMovie();

        snatch.getScenario().getCharacters()[3].printCharacter();

        System.out.println("\n////////////////////////////////////////////////////////////");

        //массив героев фильма
        Scenario.Character[] resDogsCharacters = new Scenario.Character[6];

        resDogsCharacters[0] = new Scenario.Character("Mr. White/Larry Dimmick", "Male", "main");
        resDogsCharacters[1] = new Scenario.Character("Mr. Orange/Freddy Newandyke", "Male", "main");
        resDogsCharacters[2] = new Scenario.Character("Mr. Blonde/Vic Vega", "Male", "main");
        resDogsCharacters[3] = new Scenario.Character("Mr. Pink", "Male", "main");
        resDogsCharacters[4] = new Scenario.Character("\"Nice Guy\" Eddie Cabot", "Male", "main");
        resDogsCharacters[5] = new Scenario.Character("Mr. Blue", "Male", "main");

        //создаем объект "сценарий" с массивом героев и подробностями
        Scenario resDogsScenario = new Scenario("Quentin Tarantino", "https://en.wikipedia.org/wiki/Reservoir_Dogs", "99I", resDogsCharacters);

        //массив локаций
        Movie.Location[] resDogsLocations = new Movie.Location[1];

        resDogsLocations[0] = new Movie.Location("Los Angeles", "USA");

        //массив работников
        Worker[] resDogsEditors = new Worker[2];
        resDogsEditors[0] = new Worker("First Worker", "i don't know");
        resDogsEditors[1] = new Worker("Second Worker", "i don't know");

        //создаем объект группы работников с массивом и названием
        WorkGroups.VisioTeam resDogsVisioTeam = new WorkGroups.VisioTeam("Miramax Films", resDogsEditors);
        //создаем объект главных работников (в моем случае режиссеры и продюссеры)
        WorkGroups.HeadTeam resDogsHeadTeam = new WorkGroups.HeadTeam(new String[] {"Quentin Tarantino"}, new String[] {"Lawrence Bender"});

        //создаем объект группы производства
        WorkGroups resDogsStaff = new WorkGroups("Dog Eat Dog Productions", resDogsVisioTeam, resDogsHeadTeam);

        //создаем объект фильма с производственной площадкой, сценарием и локациями
        Movie resDogs = new Movie("Reservoir Dogs", 1992, resDogsScenario, resDogsLocations, resDogsStaff);

        //детальный вывод на экран
        resDogs.printMovie();

        resDogs.getScenario().getCharacters()[3].printCharacter();
    }

}
