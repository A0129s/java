


public class demo{
    public static void main(String[] args) {

        // -------------------calculator------------------
        /* 
        calculator c=new calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.sub(10,20)); 
        */

        // -------------------adv calculator------------------
        advcalc ac=new advcalc();
        int r1 = ac.div(25, 5);
        int r2 = ac.mod(25, 5);
        int r3 = ac.power(2, 3);
        System.out.println(r1+" "+r2+" "+r3);
    

    }
}