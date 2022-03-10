import java.util.*;
public class Code_1
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the team name:\r");
        String teamName= scanner.nextLine();
        System.out.println("Enter session:\r");
        String session=scanner.nextLine();
        String a= " to win";
        System.out.println("Enter runs:\r");
        int runs=scanner.nextInt();
        if(session.equals("TeamName") || session.equals("teamName") || session.equals("1"))
        {
            
            System.out.println("Name:" + teamName);
            System.out.println("Scored:" + runs);
            System.out.println("Need " + ++runs + a);
        }
       else if(session.equals("session") || session.equals("Session") || session.equals("2"))
       {
           System.out.println("Name:" + teamName);
           System.out.println("Scored:"+ runs);
           System.out.println("Matched Ended.");
       }
       else
       {
        System.out.println("Invalid Input.");
       }

    }

}