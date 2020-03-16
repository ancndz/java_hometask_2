package ru.ancndz.task1.mov;

import ru.ancndz.task1.staff.WorkGroups;

import java.util.ArrayList;

public class Movie {

    private String title;
    private int year;
    private Scenario scenario;
    private ArrayList<Location> locations = new ArrayList<>();
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

    public void setScenario(String author, String textUrl, String runtime) {
        this.scenario = new Scenario(author, textUrl, runtime);
    }

    public void addLocations(String name, String country) {
        this.locations.add(new Location(name, country));
    }

    public void setStaff(WorkGroups staff) {
        this.staff = staff;
    }

    public WorkGroups getStaff() {
        return staff;
    }

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
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

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public class Scenario {

        private String author;
        private String textUrl;
        private String runtime;
        private ArrayList<Character> characters = new ArrayList<>();

        public Scenario(String author, String textUrl, String runtime) {
            this.author = author;
            this.textUrl = textUrl;
            this.runtime = runtime;
        }

        public void addCharacter(String name, String gender, String priority) {
            this.characters.add(new Character(name, gender, priority));
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

        public ArrayList<Character> getCharacters() {
            return characters;
        }

        public class Character {
            private String name;
            private String gender;
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

    public class Location {
        private String name;
        private String country;

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
