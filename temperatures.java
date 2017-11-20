public class temperatures {
    public static void main(String[] args) {
        int temps[][] = new int[4][7];
        // int tempsRowZero[] = {68, 70, 76, 70, 68, 71, 75};
        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;

        System.out.println("Temperature Calculator");
        System.out.println("");
        System.out.println("The data provided are:");

        for (int row = 0; row < 1; row++) {
            for (int column = 0; column < 1; column++) {
                System.out.println("7 AM: " + temps[0][0] + ", " + temps[0][1] + ", " + temps[0][2]+ ", " + temps[0][3]+ ", " + temps[0][4]+ ", " + temps[0][5]+ ", " + temps[0][6]);
                System.out.println("3 PM: " + temps[1][0] + ", " + temps[1][1] + ", " + temps[1][2]+ ", " + temps[1][3]+ ", " + temps[1][4]+ ", " + temps[1][5]+ ", " + temps[1][6]);
                System.out.println("7 PM: " + temps[2][0] + ", " + temps[2][1] + ", " + temps[2][2]+ ", " + temps[2][3]+ ", " + temps[2][4]+ ", " + temps[2][5]+ ", " + temps[2][6]);
                System.out.println("3 AM: " + temps[3][0] + ", " + temps[3][1] + ", " + temps[3][2]+ ", " + temps[3][3]+ ", " + temps[3][4]+ ", " + temps[3][5]+ ", " + temps[3][6]);

            }
            int averageTempMonday = ((temps[0][1] + temps[1][1] + temps[2][1] + temps[3][1]) / 4);
            int averageTempTuesday = ((temps[0][2] + temps[1][2] + temps[2][2] + temps[3][3]) / 4);
            int averageTempWednesday = ((temps[0][3] + temps[1][3] + temps[2][2] + temps[3][3]) / 4);
            int averageTempThursday = ((temps[0][4] + temps[1][4] + temps[2][4] + temps[3][4]) / 4);
            int averageTempFriday = ((temps[0][5] + temps[1][5] + temps[2][5] + temps[3][5]) / 4);
            int averageTempSaturday = ((temps[0][6] + temps[1][6] + temps[2][6] + temps[3][6]) /4);
            int averageTempSunday = ((temps[0][0] + temps[1][0] + temps[2][0] + temps[3][0]) / 4);

            System.out.println();
            System.out.println("Based on that data, the following are the average temperatures for the week:");
            System.out.println("Sun: " + averageTempSunday);
            System.out.println("Mon: " + averageTempMonday);
            System.out.println("Tue: " + averageTempTuesday);
            System.out.println("Wed: " + averageTempWednesday);
            System.out.println("Thu: " + averageTempThursday);
            System.out.println("Fri: " + averageTempFriday);
            System.out.println("Sat: " + averageTempSaturday);


            int averageTempSevenAm = ((temps[0][0] + temps[0][1] + temps[0][2] + temps[0][3] + temps[0][4] + temps[0][5] + temps[0][6]) / 7);
            int averageTempThreePm = ((temps[1][0] + temps[1][1] + temps[1][2] + temps[1][3] + temps[1][4] + temps[1][5] + temps[1][6]) / 7);
            int averageTempSevenPm = ((temps[2][0] + temps[2][1] + temps[2][2] + temps[2][3] + temps[2][4] + temps[2][5] + temps[2][6]) / 7);
            int averageTempThreeAm = ((temps[3][0] + temps[3][1] + temps[3][2] + temps[3][3] + temps[3][4] + temps[3][5] + temps[3][6]) / 7);

            System.out.println();
            System.out.println("7 AM: " + averageTempSevenAm);
            System.out.println("3 PM: " + averageTempThreePm);
            System.out.println("7 PM: " + averageTempSevenPm);
            System.out.println("3 AM: " + averageTempThreeAm);

            int averageTempOverall = ((averageTempMonday + averageTempTuesday + averageTempWednesday + averageTempThursday + averageTempFriday + averageTempSaturday + averageTempSunday) / 7);

            System.out.println();
            System.out.println("The final average temperature for the week was: ");
            System.out.println();
            System.out.println("Overall " + averageTempOverall);

        }
    }
}