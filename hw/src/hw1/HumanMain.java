package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanMain {

    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите фамилию");
        String surname = READER.readLine();

        System.out.println("Введите имя");
        String name = READER.readLine();

        System.out.println("Хоитет ввести отчество: 1-да, 2-нет");
        int choice = Integer.parseInt(READER.readLine());
        String thirdName = null;
        switch (choice) {
            case 1:
                System.out.println("Введите отчество");
                thirdName = READER.readLine();
            case 2:
                break;
        }


        Human human = new Human(surname, name, thirdName);
        System.out.println(human.getFullName());
        System.out.println(human.getShortName());

    }

}
