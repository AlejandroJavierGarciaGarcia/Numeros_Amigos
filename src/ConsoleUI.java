public class ConsoleUI {
    DriverProgram driverProgram = new DriverProgram();
    public void welcome(){
        System.out.println("Bienvenido");
        System.out.println("Autor: Alejandro García");
        System.out.println("Programa de comparación de números amigos");
        userInformation();
        driverProgram.createArray();
    }

    public void userInformation() {
        System.out.println("Ingrese la cantidad de elementos para los arreglos");

    }

}
