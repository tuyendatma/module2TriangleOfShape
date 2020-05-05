import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double size1;
        double size2;
        double size3;
        String color;
       // String color = "";
        System.out.println(" please, input three edge of triangle");
        size1 = scanner.nextDouble();
        System.out.println("side2: ");
        size2 = scanner.nextDouble();
        System.out.println("side3: ");
        size3 = scanner.nextDouble();
       // Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("please, input color of triangle");
        color = scanner.nextLine();

        System.out.println("do you want to fill the triangle?(yes or no)");
        String fill = scanner.nextLine();
        System.out.println("fill: "+fill);
        boolean filled =false;
        if(fill.equals("yes")){
            filled =true;
        }
        Triangle triangle1 = new Triangle(size1,size2,size3,"red",filled);
        System.out.println(triangle1);
    }
}
