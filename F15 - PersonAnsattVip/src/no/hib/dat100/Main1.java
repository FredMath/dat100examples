package no.hib.dat100;

public class Main1 {

    public static void main(String[] args) {

        Person per  = new Person("Per", 1950);
        Person paal = new Person("P�l", 1960);
        
        Person per2 = new Person("Per", 1950);
        
        System.out.println(per); // underforst�tt per.toString()
        System.out.println(paal);// underforst�tt paal.toString()

        System.out.println("per.equals(per): " + per.equals(per));
        System.out.println("paal.equals(paal): " + paal.equals(paal));
        System.out.println("per.equals(paal): " + per.equals(paal));
        System.out.println("per.equals(per2): " + per.equals(per2));
    }
}