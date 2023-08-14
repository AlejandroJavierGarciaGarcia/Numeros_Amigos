import java.util.Random;
import java.util.Scanner;
public class DriverProgram {
    Scanner in = new Scanner(System.in);
    Random r = new Random();
    public void createArray(){
        int sizeArrays = in.nextInt();
        Integer[] arrayA = new Integer[sizeArrays];
        System.out.println("\nARREGLO A");
        for(int i = 0; i < arrayA.length; i++){
            arrayA[i] = r.nextInt(5001);

            System.out.println(i+" -"+ arrayA[i]);
        }

        System.out.println("\nARREGLO B");
        Integer[] arrayB = new Integer[sizeArrays];
        for(int i = 0; i < arrayB.length; i++){
            arrayB[i] = r.nextInt(5001);
            System.out.println(i+" -"+ arrayB[i]);
        }
        //PRUEBA DE FUNCIONALIDAD VERIFICADA
        //Integer[] arrayC = {520,220,100};
        //Integer[] arrayD = {284,60,2589};
        //compare(arrayC, arrayD);
        compare(arrayA, arrayB);
    }

    public void compare(Integer[] a, Integer[] b){
        int countFriendlyNumbers = 0;
        for(int i = 0;i < a.length;i++){
            for(int j = 0; j < b.length; j++){
                System.out.println("\n----------------------------\nNúmeros en comparacion: "+a[i]+" y "+b[j]);
                boolean compare = perfectNumber(a[i], b[j]);
                if(compare){
                    countFriendlyNumbers++;
                    System.out.println("La posición"+i+" - "+a[i]+" del Areglo A y la " +
                            "posición "+j+" - "+b[j]+" del Arrglo B son numeros amigos");
                }
            }
        }
        System.out.println("\nLa cantidad de números amigos de los areglos es de "+countFriendlyNumbers);
    }

    public boolean perfectNumber(int num, int num2){
        boolean isFriend = false;
        int divisor=2;
        int perfecto=0;
        while (divisor<=num) {
            if (num%divisor==0) {
                perfecto=perfecto+(num/divisor);
            }
            divisor=divisor+1;
        }
        if (perfecto==num2) {
            isFriend = true;
        }
        return isFriend;
    }
}