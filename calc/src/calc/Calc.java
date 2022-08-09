package calc;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author joao vitor carioca de albuquerque
 */
public class Calc {

    public static void main(String args[]){
     operations calc = new operations();
     Scanner number = new Scanner(System.in);
     int menu = 0;
     do{menu = Integer.parseInt(JOptionPane.showInputDialog("OPERACOES \n"
     + "1-SOMA\n"
     + "2-MULTIPLICACAO\n"
     + "3-DIVISAO\n"
     + "4-QUADRADO\n"
     + "5-SUBTRACAO\n"
     + "0-SAIR"));

         switch (menu){
             case 1:
                 JOptionPane.showMessageDialog(null,"O resultado da soma e: " + calc.soma());
                 break;
             case 2:
                 JOptionPane.showMessageDialog(null,"O resultado da multiplacacao e: " + calc.mult());
                 break;
             case 3:
                 JOptionPane.showMessageDialog(null,"O resultado da divisao e: " + calc.div());
                 break;
             case 4:
                 JOptionPane.showMessageDialog(null,"O resultado do numero ao quadrado e: " + calc.quadrado());
                 break;
             case 5:
                 JOptionPane.showMessageDialog(null,"O resultado da subtracao e: " + calc.sub());
                 break;
             case 0:
                 JOptionPane.showMessageDialog(null,"finalizando caluladora");
                 break;


         }

     }while(menu != 0 );


    }
    
}
