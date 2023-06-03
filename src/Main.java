import java.util.Scanner;

public class Main {

    public Main() {
        System.out.print("Vo = ");
        Scanner sc = new Scanner(System.in);
        float Vo = sc.nextFloat();
        System.out.print("Angle = ");
        float angle = sc.nextFloat();
        float angle1 =(float) Math.toRadians(angle);
        result r = new result(Vo,angle1);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}