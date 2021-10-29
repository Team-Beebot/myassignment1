
import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[] args){
        double breadth, height, area_of_triangle;

        System.out.println("Input given breadth of triangle:");
        Scanner bd = new Scanner(System.in);
        breadth = bd.nextDouble();

        System.out.println("Input given height of triangle:");
        Scanner ht = new Scanner(System.in);
        height = ht.nextDouble();

        area_of_triangle = (breadth * height)/2;

        System.out.printf("The area of given triangle is %f", area_of_triangle);


    }
}
