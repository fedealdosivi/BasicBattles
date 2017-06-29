package View;
import Controller.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ControlCharacters controlCharacters=new ControlCharacters();
        Scanner teclado = new Scanner(System.in);

        int rta=0;



        while (rta!=5) {

            System.out.println("Elija una opcion:");
            System.out.println("1-Cargar un Personaje");
            System.out.println("2-Mostrar Personajes");
            System.out.println("3-Pelear");
            System.out.println("4-Eliminar un Personaje");
            System.out.println("5-Salir");
            rta=teclado.nextInt();

            switch (rta){

                case 1:
                    controlCharacters.loadCharacters();
                    break;

                case 2:
                    controlCharacters.printCharacters();
                    break;

                case 3:
                    controlCharacters.singleBattle();
                    break;

                case  4:
                    System.out.println("4-Ingrese el ID");
                    long idDelete=teclado.nextLong();
                    controlCharacters.deleteCharacter(idDelete);
                    break;
            }

        }

    }
}
