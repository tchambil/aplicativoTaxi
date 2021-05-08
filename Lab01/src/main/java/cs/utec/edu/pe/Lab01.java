package cs.utec.edu.pe;

import java.util.Scanner;
import java.util.logging.Logger;

public class Lab01 {
    static final Logger logger = Logger.getLogger(Lab01.class.getName());
    public static double precio(String serviceName, double distance, double time)
    {
        double finalPrice = 0;
        switch (serviceName)
        {
            case("UBER"):
                finalPrice = (1.2 * distance) + (0.1*time);
                break;
            case("Cabify"):
                if (distance > 20) finalPrice = 20*1.65 + 1.10*(distance-20);
                else finalPrice = distance*1.65;
                break;
            case("TaxiBeat"):
                finalPrice = 2.4 + (1.05*distance) + (0.34*time);
                break;
            default:
                logger.info(("Servicio no encontrado"));
        }
        return finalPrice;
    }
    public static void main(String[] args){
        logger.info("CS-UTEC Software Engineering I");
        logger.info("CS-UTEC Software Engineering I");
        var input = new Scanner(System.in);
        logger.info("distancia = ");
        var distance = input.nextDouble();
        logger.info("tiempo = ");
        var time = input.nextDouble();

        var company = new String[]{"UBER", "Cabify", "TaxiBeat"};
        double price = 0;

        logger.info("--------Output------");
        for (var i = 0; i < 3; i++) {
            price = precio(company[i], distance, time);
            var message = String.format("%S : %.2f%n", company[i], price);
            logger.info(message);
        }
    }
}
