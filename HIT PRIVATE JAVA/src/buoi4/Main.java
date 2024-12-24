package buoi4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] person = new Person[5];
        person[0] = new Person("2023600784","Keo",19,"PHU THO","0376616774");
        person[1] = new Person("2023600785","Thanh",20,"PHU THO","0376616774");
        person[2] = new Person("2023600786","Gloucester",21,"PHU THO","0376616774");
        person[3] = new Person("2023600787","Dirty Mouse",22,"PHU THO","0376616774");
        person[4] = new Person("2023600788","T",23,"PHU THO","0376616774");

        String name = sc.next();
        for(Person p : person){
            if(p.getTen().equals(name)){
                p.display();
            }
        }

        String id = sc.next();
        for (Person p : person) {
            if (p.getMaCanCuocCongDan().equals(id)) {
                p.display();
            }
        }
        Arrays.sort(person, Comparator.comparingInt(Person::getTuoi));
        for(Person p : person){
            p.display();
        }

    }
}

