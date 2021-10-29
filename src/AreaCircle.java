
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        double radius, area_of_circle;

        System.out.println("Input the given radius of circle");
        Scanner rd = new Scanner(System.in);
        radius = rd.nextDouble();

        area_of_circle = (22 * radius * radius)/7;

        System.out.printf("The area of circle is %f", area_of_circle);
    }
}

