import java.util.Scanner;
public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xInput = sc.nextLine();
        String yInput = sc.nextLine();
        double x = Double.parseDouble(xInput);
        double y = Double.parseDouble(yInput);
        if (x > 0) {
            if (y > 0) {
                System.out.println("Quadrant 1");
            } else if (y < 0 ) {
                    System.out.println("Quadrant 4");
                }
            }
        } else if (x < 0) {
            if (y > 0) {
                System.out.println("Quadrant 2");
            } else if (y < 0) {
                System.out.println("Quadrant 3");
            }
        }
        else if (x==0 || y==0) {
            System.out.println("Not in a quadrant.");
        }

    }

}
