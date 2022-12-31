import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class HappyOrSad {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("happyorsad.txt");
        Scanner reader = new Scanner(file);
        if (reader.hasNextLine()) {
            String emoticon = reader.nextLine();
            int sadCount = 0;
            int happyCount = 0;
            for (int i = 0; i < emoticon.length()-2;i++) {
                if (Character.toString(emoticon.charAt(i)).equals(":") && Character.toString(emoticon.charAt(i+1)).equals("-")) {
                    if (Character.toString(emoticon.charAt(i+2)).equals("(")) {
                        sadCount++;
                    } else if (Character.toString(emoticon.charAt(i+2)).equals(")")) {
                        happyCount++;
                    }
                }
            }
            if (happyCount > sadCount) {
                System.out.println("happy");
            } else if (sadCount > happyCount) {
                System.out.println("sad");
            } else if (sadCount == happyCount && sadCount > 0){
                System.out.println("unsure");
            } else {
             System.out.println("none");
            }
        } else {
            System.out.println("none");
            }
        }
    }

