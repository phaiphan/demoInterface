import service.IEatService;
import service.impl.CatServiceImpl;
import service.impl.DogServiceImpl;
import service.impl.ElephantServiceImpl;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final CatServiceImpl ELEPHANT = new CatServiceImpl();

    private static final int RABBIT = 3;

    private static final int BIRD = 4;

    public static void main(String[] args) {
        IEatService animal;

        //ELEPHANT = new CatServiceImpl();
        ELEPHANT.setColor("yellow");

        Scanner scanner = new Scanner(System.in);
        int input;
        do{
            input = scanner.nextInt();
            switch (input){
                case DOG -> {
                    animal = new DogServiceImpl();
                }
                case CAT -> {
                    animal = new CatServiceImpl();
                }
                /*case ELEPHANT -> {
                    animal = new ElephantServiceImpl();
                }*/
                default -> {
                    animal = null;
                }
            }
            if(animal!= null){
                System.out.println(animal.eat());
            }

        } while (input != -1);




    }
}