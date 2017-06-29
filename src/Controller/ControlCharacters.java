package Controller;

import java.util.Scanner;

import Data.ListCharacters;
import Model.*;

public class ControlCharacters {

    ListCharacters lista = new ListCharacters();

    public void loadCharacters() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String name = teclado.nextLine();


        System.out.println("Elija una clase:");
        System.out.println("1-Wizzard");
        System.out.println("2-Warrior");
        System.out.println("3-Elf");


        int rta = teclado.nextInt();

        if (rta == 1) {

            Wizzard w = new Wizzard();
            w.setName(name);
            w.setCantLifes(3);
            lista.addCharacter(w);

        } else if (rta == 2) {


            Warrior wa = new Warrior();
            wa.setName(name);
            wa.setCantLifes(3);
            lista.addCharacter(wa);

        } else if (rta == 3) {

            Elf El = new Elf();
            El.setName(name);
            El.setCantLifes(3);
            lista.addCharacter(El);
        }
    }


    public void deleteCharacter(long id) {
        lista.deleteCharacter(id);
    }

    public void printCharacters() {
        System.out.print(lista.printCharacters());
    }

    public void singleBattle() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el id del primer pj");
        long id1 = teclado.nextLong();

        System.out.println("Ingrese el id del segundo pj");
        long id2 = teclado.nextLong();

        boolean rta = lista.singleBattle(id1, id2);

        if (rta == false) {
            System.out.println("La pelea no se pudo realizar");
        } else {
            System.out.println("Pelea exitosa");
        }
    }

    public void battleUntilDead() {

    }
}
