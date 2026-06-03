import java.util.*;
class trafficSignal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String color=sc.nextLine();

        if(color.equalsIgnoreCase("red"))
            System.out.println("STOP");
        else if(color.equalsIgnoreCase("yellow"))
            System.out.println("WAIT");
        else if(color.equalsIgnoreCase("green"))
            System.out.println("GO");
        else
            System.out.println("INVALID SIGNAL");
    }
}