package hw1;

public class Human {

    String name;
    String surname;
    String thirdName;

    public Human(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Human(String surname, String name, String thirdName) {
        this.surname = surname;
        this.name = name;
        this.thirdName = thirdName;
    }

    public String getFullName() {
        if (this.thirdName == null) {
            return this.surname + " " + this.name;
        } else {
            return this.surname + " " + this.name + " " + this.thirdName;
        }
    }

    public String getShortName() {
        if (this.thirdName == null) {
            return this.surname + " " + this.surname.charAt(0) + ".";
        } else {
            return this.surname + " " + this.surname.charAt(0) + ". " + this.thirdName.charAt(0) + ".";
        }
    }
}
