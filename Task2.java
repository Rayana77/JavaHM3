package homework3;

public class Task2 {
    public static void main (String[] args){
        int randomNumber = (int)(Math.random()*900+100), a,b,c;
        a = randomNumber/100;
        b =(randomNumber%100) / 10;
        c = randomNumber%10;

        if(a>b&&a>c) {
            System.out.println("The largest digit in the number " +randomNumber+  " is " +a);
        } else if (b>=a&&b>=c) {
            System.out.println("The largest digit in the number " +randomNumber+  " is " +b);
        }else {
            System.out.println("The largest digit in the number " +randomNumber+  " is " +c);

        }


    }


}
