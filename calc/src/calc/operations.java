
package calc;
import java.util.Scanner;
/**
 *
 * @author Armtage
 */
public class operations {
     public double soma(){
        operations calc = new operations();
        Scanner number = new Scanner(System.in);
        double resultado;
        System.out.println("esolha o primeiro numero:");
        double num1 = number.nextDouble();
        System.out.println("esolha o segundo numero:");
        double num2 = number.nextDouble();
        resultado = num1+num2;
        return resultado;
    }
    public double div(){
        operations calc = new operations();
        Scanner number = new Scanner(System.in);
        double resultado;
        System.out.println("esolha o primeiro numero:");
        double num1 = number.nextDouble();
        System.out.println("esolha o segundo numero:");
        double num2 = number.nextDouble();
        resultado = num1/num2;
        return resultado;
    }
    public double mult(){
        operations calc = new operations();
        Scanner number = new Scanner(System.in);
        double resultado;
        System.out.println("esolha o primeiro numero:");
        double num1 = number.nextDouble();
        System.out.println("esolha o segundo numero:");
        double num2 = number.nextDouble();
        resultado = num1*num2;
        return resultado;
    }
    public double sub(){
        operations calc = new operations();
        Scanner number = new Scanner(System.in);
        double resultado;
        System.out.println("esolha o primeiro numero:");
        double num1 = number.nextDouble();
        System.out.println("esolha o segundo numero:");
        double num2 = number.nextDouble();
        resultado = num1-num2;
        return resultado;
    }
    public double quadrado(){
        operations calc = new operations();
        Scanner number = new Scanner(System.in);
        double resultado;
        System.out.println("esolha o primeiro numero:");
        double num1 = number.nextDouble();
        resultado = num1*num1;
        return resultado;
    }
}
