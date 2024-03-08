package U7;
import java.util.Scanner;

public class Task7 {

    int magazine;
    Scanner input = new Scanner(System.in);

    public void mbushjaMagazines() {
        if (magazine <= 0) {
            System.out.println("Magazina ska me plumba");
            System.out.println("Deshironi ta mbushni magazinen?");
            System.out.println("Enter y - yes dhe n-no");
            char choice = input.next().charAt(0);
            if (choice == 'y' || choice == 'Y') {
                System.out.println("Kujdes magazina ka vend vetem per 5 plumba \n" + "Sa plumba deshironi te mbushni ne magazine: ");
                int plumbaToAdd = input.nextInt(); // Read the number of bullets to add
                switch (plumbaToAdd) {
                    // Switch on the number of bullets to add
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        magazine += plumbaToAdd;
                        System.out.println("Magazina u mbush me: " + magazine + " plumba");
                        break;
                    default:
                        System.out.println("Magazina ka sasi te limituar deri ne 5 plumba");
                        break;
                }
            } else if (choice == 'n' || choice == 'N') {
                System.out.println("Ju nuk mund te gjuani me!");
            }

        }

    }

    public void Gjuajtje() {
        if (magazine >= 0) {
            System.out.println("Gjuajte " + magazine);
            magazine--;
        } else {
            System.out.println("Magazina bosh");
        }
    }


    public void MagazinaeArmes() {
        if (magazine <= 0) {
            System.out.println("Magazina eshte bosh");
        } else {
            System.out.println("Magazina ka ende plumba " + magazine);
        }
    }


    public Task7(int magazine) {
        this.magazine = magazine;
    }

    public static void main(String[] args) {
        Task7 gun = new Task7(5);
        System.out.println("Sa plumba ka magazina \n" + "Magazina ka: " + gun.magazine + " plumba!");
        gun.Gjuajtje();
        gun.Gjuajtje();
        gun.Gjuajtje();
        gun.Gjuajtje();
        gun.Gjuajtje();
        gun.mbushjaMagazines();

        gun.Gjuajtje();
        System.out.println(gun.magazine);
    }
}