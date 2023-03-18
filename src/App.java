import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
         Scanner input = new Scanner(System.in);
        System.out.println("inserisci il primo numero");
        int numero1= input.nextInt();
        System.out.println("inserisci il secondo numero");
        int numero2= input.nextInt();
        System.out.println("inserisci il terzo numero");
        int numero3= input.nextInt();

        System.out.println("Verificare in senso stretto? (Y/N)");
        String decisione= input.next();
        if (decisione.equals("Y")){
            if (numero1 <= numero2 && numero2<=numero3){
                System.out.println("La sequenza è crescente");
            }
            else if (numero3<=numero2&&numero2<=numero1){
                System.out.println("La sequenza è decrescente");
            }
            else if (numero1<numero2&&numero2>numero3 ||numero1>numero2&&numero2<numero3){
                System.out.println("neither");}
        }
        else if(decisione.equals("N")){
            if (numero1 < numero2 && numero2<numero3){
            System.out.println("La sequenza è crescente");
        }
        else if (numero3<numero2&&numero2<numero1){
            System.out.println("La sequenza è decrescente");
        }
        else if (numero1<=numero2&&numero2>=numero3 ||numero1>=numero2&&numero2<=numero3){
            System.out.println("neither");}

        
    }
}
    }
