import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class bhaskara {
    public static void main(String[] args) {

        double x1, x2, b, a, c, raiz, delta, divisao;

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        System.out.println("Escreva o coeficiente A: ");
        a= scan.nextDouble();
        System.out.println("Escreva o coeficiente B: ");
        b= scan.nextDouble();
        System.out.println("Escreva o coeficiente C: ");
        c= scan.nextDouble();

        delta= (Math.pow(b,2))-4*a*c;
        raiz= Math.sqrt(delta);
        divisao = 2*a;

        x1= (-b + raiz)/divisao;
        x2= (-b - raiz)/divisao;

        if (delta>0){
            System.out.println("Os valores das raízes são: X1= " + formatador.format(x1) + " e X2= " + formatador.format(x2));
        }
        else if (delta<0){
            System.out.println("O valor do delta é negativo: " + formatador.format(delta) + " A equação não possui raízes reais.");
        }
        else {
            System.out.println("Os dados inseridos não são válidos, por favor repita a operação.");
        }
    }
}


