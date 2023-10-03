import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
public class Townchallenge {

    public static void main(String[] args) throws Exception{

        String[] towns = { "Coleraine", "Belfast", "Banbridge", "Ballymoney",
                "Nerwy", "Enniskillen", "Portadown", "Bangor"};
        Random random = new Random();
        int homeScore, awayScore;
        int homes = 0, draws = 0, aways = 0;
        Scanner keyboard = new Scanner(System.in);

        File file = new File("src/textfile.txt");
        Scanner fileInput = new Scanner(file);

        while (fileInput.hasNextLine()){
            System.out.println("Reading... " + fileInput.nextLine());
        }

        FileWriter outputfile = new FileWriter("src/outputfile.txt", true);

        outputfile.write("Line 1 written to the file\n");
        outputfile.write("line 2 written to the file\n");
        outputfile.close();

        for (int i = 0; i <= 7; i++) {
            System.out.printf("Enter town %d > ", i+1);
            towns[i] = keyboard.nextLine();
        }

         for (int i = 0; i <4; i++){
            homeScore = random.nextInt(10);
            awayScore = random.nextInt(10);
            System.out.printf("%-12s %3d %-12s %3d \n", towns[i*2], homeScore, towns[i*2 +1], awayScore);

            if (homeScore > awayScore) {
                homes++;
            } else if (homeScore < awayScore) {
                aways++;
            } else {
                draws++;
            }


        }

         System.out.printf("Homes %d, Draws %d, Aways %d \n", homes, draws, aways );

    }


}
