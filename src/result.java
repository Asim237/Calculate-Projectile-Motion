
import java.math.MathContext;
import java.util.Scanner;


public class result {

        public result(float Vo, float angle) {
            float time = (float) ((Vo * Math.sin(angle)) / 9.8);
            float Vox = (float) (Vo * Math.cos(angle));
            float Voy = (float) ((Vo * Math.sin(angle)) - (9.8));
            float max_height = (float) ((Math.pow(Vo * Math.sin(angle), 2)) / (9.8 * 2));
            float horizon = (float) (((Math.pow(Vo, 2)) * Math.sin(2 * angle)) / 9.8);
            float max_horizon = (float) ((Math.pow(Vo, 2)) / (9.8));
            float time_flight = time * 2;
            System.out.println("Vox = " + Vox);
            System.out.println("Voy = " + Voy);

            System.out.println("Time of Maximum Height = " + time);
            System.out.println("Total Time of Flight = " + time_flight);

            System.out.println("Maximum Height of the projectile = " + max_height);
            System.out.println("Horizontal Range = " + horizon);
            System.out.println("Maximum Horizontal Range = " + max_horizon);

            System.out.println("\n\n\n");
            new Main();


        }


    }
