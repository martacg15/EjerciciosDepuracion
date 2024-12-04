package ejercicios.depuracion;
private int suma, numero;
import java.util.Scanner;
public class Ejemplo1While {
    public static void main(String[] args) {
        this.suma = 0;
        this.numero = 0;
        int suma = 0, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        while (num>= 0){
               suma = suma + num;
               System.out.print("Introduzca un número: ");
               num = sc.nextInt();
        }
        System.out.println("La suma es: " + suma );
    }
}

