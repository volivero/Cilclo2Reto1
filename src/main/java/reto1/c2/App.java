package reto1.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        ProyectoInversion proyInver = new ProyectoInversion();

        System.out.println(proyInver.calcularInteresSimple());
        System.out.println(proyInver.calcuarInteresCompuesto());
        System.out.println("Caso 1: verificarInversion con parametros");
        System.out.println(proyInver.verificarInversion(7,5000000,5));
        System.out.println("Caso 2: verificarInversion con el constructor");
        System.out.println(proyInver.verificarInversion());
        
    }
}
