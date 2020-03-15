package ru.ancndz.task1.mov;

import ru.ancndz.task1.staff.WorkGroups;

public class Movie {

    private String title = "The Big Lebowski";
    private int year = 1998;
    private Scenario scenario;
    private Location[] locations;
    private WorkGroups staff;

    public void printMovie() {
        System.out.printf("----%s(%d)----", this.title, this.year);

        System.out.print("\nStaff: ");
        this.staff.printWorkers();

        System.out.print("\nLocations: ");
        for (Location each: locations) {
            each.printLoc();
        }

        System.out.print("\nScenario: ");
        this.scenario.printScenario();
    }

    public WorkGroups getStaff() {
        return staff;
    }

    public Movie(String title, int year, Scenario scenario, Location[] locations, WorkGroups staff) {
        this.title = title;
        this.year = year;
        this.scenario = scenario;
        this.locations = locations;
        this.staff = staff;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return year;
    }

    public Scenario getScenario() {
        return scenario;
    }

    public Location[] getLocations() {
        return locations;
    }

    public static class Scenario {

        private String author;
        private String textUrl = "www.somescenariotext.com";
        private String runtime = "1H 56I 59S";
        private Character[] characters;

        public Scenario(String author, String textUrl, String runtime, Character[] characters) {
            this.author = author;
            this.textUrl = textUrl;
            this.runtime = runtime;
            this.characters = characters;
        }

        public void printScenario() {
            System.out.printf("****Scenario****\n\tAuthor: %s\n\tScript URL: %s\n\tRuntime: %s",
                    this.author, this.textUrl, this.runtime);
            System.out.print("\n\t--Characters--");
            for (Character each: characters) {
                each.printCharacter();
            }
        }

        public String getAuthor() {
            return author;
        }

        public String getTextUrl() {
            return textUrl;
        }

        public String getRuntime() {
            return runtime;
        }

        public Character[] getCharacters() {
            return characters;
        }

        public static class Character {
            private String name = "the dude";
            private String gender = "male";
            private String priority = "extras";

            public Character(String name, String gender) {
                this.name = name;
                this.gender = gender;
            }

            public Character(String name, String gender, String priority) {
                this(name, gender);
                this.priority = priority;
            }

            public void printCharacter() {
                System.out.printf("\n\tName: %s\n\t\tGender: %s\n\t\tPriority: %s",
                        this.name, this.gender, this.priority);
            }

            public String getName() {
                return name;
            }

            public String getGender() {
                return gender;
            }

            public String getPriority() {
                return priority;
            }
        }

    }

    public static class Location {
        private String name = "";
        private String country = "";

        public Location(String name, String country) {
            this.name = name;
            this.country = country;
        }

        public void printLoc() {
            System.out.printf("\n\tCity: %s\n\t\tCountry: %s", this.name, this.country);
        }

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }
    }

}
