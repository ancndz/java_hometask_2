package ru.ancndz.task1.staff;

public class WorkGroups {

    private String teamTitle;
    private VisioTeam visioTeam;
    private HeadTeam headTeam = new HeadTeam();

    public WorkGroups(String teamTitle) {
        this.teamTitle = teamTitle;
    }

    public void setVisioTeam(String teamTitle, Worker[] workers) {
        this.visioTeam = new VisioTeam(teamTitle, workers);
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

    public class VisioTeam {
        private String visioTeamTitle;
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

    public class HeadTeam {
        private String[] directors;
        private String[] producers;

        public HeadTeam() {}

        public void setDirectors(String[] directors) {
            this.directors = directors;
        }

        public void setProducers(String[] producers) {
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
