import java.util.Scanner;

public class compuesto {
    public static void main(String[] args) {
        double years;
        double amount;
        double interest;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Buenos dias usuario, ingrese la cantidad que deseas almacenar:");
        amount =scanner.nextDouble();
        System.out.println("Perfecto, ahora ingrese el numero de años que almacenara su dinero");
        years=scanner.nextDouble();
        System.out.println("Y por ultimo el interes prometido");
        interest=scanner.nextDouble();

        for (int i=1;i<=years;i++){
            double calculator=(amount*Math.pow(1+interest,i));
            System.out.println(i+"  "+calculator);
        }

    }
}