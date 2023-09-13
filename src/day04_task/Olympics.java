public class Olympics {

    public static void main(String [] args) {


        /*
        Create a main method
            create a variable for the year
            print the country and year for next couple events reassigning year value each time.

            Country name is hard coded
            Info:
                China 2022
                France 2024
                Italy 2026

            Example Output
                Look forward to the year 2002 for the Olympics to be in China
         */

        long year = 2022;
        System.out.println("Look forward to the year " + year + " for the Olympics to be in China");
        year = 2024;
        System.out.println("Look forward to the year " + year + " for the Olympics to be in France");
        year = 2026;
        System.out.println("Look forward to the year " + year + " for the Olympics to be in Italy");

        System.out.println("\n");

        // Example 2
        String olympics = "Look forward to the year";
        short year1 = 2022;
        String olimpics = "for the Olympics to be in China";

        System.out.println(olympics + " " + year1 + " " + olimpics);

        String olympics1 = "Look forward to the year";
        long year2 = 2024;
        String olimpics1 = "for the Olympics to be in France";

        System.out.println(olympics1 + " " + year2 + " " + olimpics1);

        String olympics3 = "Look forward to the year";
        int year3 = 2026;
        String olimpics3 = "for the Olympics to be in italy";

        System.out.println(olympics3 + " " + year3 + " " + olimpics3);

    }
}