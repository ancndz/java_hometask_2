package ru.ancndz.task1.staff;

public class WorkGroups {

    private String teamTitle;
    private VisioTeam visioTeam;
    private HeadTeam headTeam;

    public WorkGroups(String teamTitle,
                      VisioTeam visioTeam, HeadTeam headTeam) {
        this.teamTitle = teamTitle;
        this.visioTeam = visioTeam;
        this.headTeam = headTeam;
    }

    public void printWorkers() {
        System.out.printf("**%s**", this.teamTitle);
        this.visioTeam.printVisioTeam();
        this.headTeam.printHeadTeam();
    }

    public String getTeamTitle() {
        return teamTitle;
    }

    public VisioTeam getVisioTeam() {
        return visioTeam;
    }

    public HeadTeam getHeadTeam() {
        return headTeam;
    }

    public static class VisioTeam {
        private String visioTeamTitle = "Some Visio Band and Co.";
        private Worker[] editors;

        public VisioTeam(String teamTitle, Worker[] editors) {
            this(teamTitle);
            this.editors = editors;
        }

        public VisioTeam(String teamTitle) {
            this.visioTeamTitle = teamTitle;
        }

        public void printVisioTeam() {
            System.out.printf("\n++%s++", this.visioTeamTitle);
            for (Worker each: this.editors) {
                each.printWorker();
            }
        }

        public String getTeamTitle() {
            return visioTeamTitle;
        }

        public Worker[] getEditors() {
            return editors;
        }
    }

    public static class HeadTeam {
        private String[] directors;
        private String[] producers;

        public HeadTeam(String[] directors, String[] producers) {
            this.directors = directors;
            this.producers = producers;
        }

        public String[] getDirectors() {
            return directors;
        }

        public String[] getProducers() {
            return producers;
        }

        public void printHeadTeam() {
            System.out.print("\n---Head Group---\t\nDirectors:");
            for (String each: directors) {
                System.out.print("\t" + each);
            }
            System.out.print("\t\nProducers:");
            for (String each: producers) {
                System.out.print("\t" + each);
            }
        }
    }

}
