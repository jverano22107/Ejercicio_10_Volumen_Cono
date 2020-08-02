import java.util.Scanner;
import java.util.*;
public class Ejercicio_10_Volumen_Cono
    {
        public static void main(String[] args)
        {
        double h1,h2,r1,r2,π,Volumen;
        Scanner Tecl = new Scanner(System.in);
        System.out.print("valor altura (h1) cono completo = ");
        h1 = Tecl.nextDouble();
        System.out.print("valor radio (R1) cono completo = ");
        r1 = Tecl.nextDouble();
        System.out.print("valor altura (h2) cono deficiente = ");
        h2 = Tecl.nextDouble();
        System.out.print("valor radio (R2) cono deficiente = ");
        r2 = Tecl.nextDouble();
        π=  Math.PI;
        Volumen= ((h1-h2)*π)/3*(Math.pow(r1,2) + Math.pow(r2,2)+(r1*r2));
        System.out.println("Volumen del tronco del cono es = "+Volumen);
    }
    }
