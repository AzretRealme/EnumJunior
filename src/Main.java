import child.*;

import static parent.Rank.*;

public class Main {
    public static void main(String[] args){

        Developer[] developers = new Developer[]{new Developer(JUNIOR, "Anthony", 27, 33000),
                new Developer(MIDDLE, "Williams", 26, 62000),
                new Developer(SENIOR, "Kane", 28, 86000),
                new Developer(TEAMLEAD, "Alex", 30, 53000)};

        for (Developer develop : developers) {
            develop.writeCode();
            develop.goToDayOff();
            develop.goToVacation();
        }

            printDeveloperGrade(developers);
        }
        public  static void printDeveloperGrade(Developer[] developers) {

            for (Developer java : developers) {

                switch (java.getRank()) {
                    case JUNIOR:
                        System.out.println("JUNIOR: I am Junior developer");
                        break;
                    case SENIOR:
                        System.out.println("SENIOR: I am Senior developer");
                        break;
                    case MIDDLE:
                        System.out.println("MIDDLE: I am Middle developer");
                        break;
                    case TEAMLEAD:
                        System.out.println("TEAMLEAD: I am Teamlead developer");
                        break;
                    default:
                        System.out.println("THE END");
                        break;
                }
            }

    }
}
