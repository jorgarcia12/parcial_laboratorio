import java.util.Scanner;
public class Calculadora_JorgeGarcia {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char op = 'p';
    int salir = 5;
    int resultado = 0;

    System.out.print("CALCULADORA");
    do {
        /* Solicitamos al usuario la operacion a realizar*/
        System.out.println("Ingrese la operacion que quiere hacer: ");
        System.out.println("(S) SUMA");
        System.out.println("(R) RESTA");
        System.out.println("(M) MULTIPLICACION");
        System.out.println("(D) DIVISION");
        op = scanner.next().charAt(0);
        /*Solicitamos los numeros a operar*/
        System.out.println("Ingrese el primer numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int n2 = scanner.nextInt();
        /*Una vez seleccionada la operacion, a traves de condicionales elegimos la operacion*/
        if (op=='s'){
            resultado = n1+n2;
            System.out.println("La suma entre "+n1+" y "+n2+" = "+resultado);
        } else if (op=='r') {
            resultado = n1-n2;
            System.out.println("La resta de "+n1+"-"+n2+" = "+resultado);
        } else if (op=='m') {
            resultado = n1*n2;
            System.out.println("La multiplicacion entre "+n1+" y "+n2+" = "+resultado);
        } else if (op=='d') {

            if (n2==0){
                System.out.println("El divisor no puede ser cero!");
            }else {
                resultado=n1/n2;
                System.out.println("La division entre "+n1+" y "+n2+" = "+resultado);
            }
            /*En caso de no haber elegido un operador valido, mostramos un mensaje por pantalla*/
        }else {
            System.out.println("Ingrese un operador valido!");
        }
        /*Preguntamos al usuario si quiere realizar otra operacion, par poder reiniciar el ciclo*/
        System.out.println("Desea continuar? (1) si  (2) no");
        salir = scanner.nextInt();
    }while (salir != 2);
        System.out.println("Usted salio del programa, hasta pronto!");
    }
}