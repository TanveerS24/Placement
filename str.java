import java.util.Scanner;
class str{
    static boolean checker(String s,String goal){
        return (s+s).contains(goal) && s.length()==goal.length();
    }
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter s: ");
        String s=sc.next();
        System.out.print("Enter Goal: ");
        String goal=sc.next();
        if(checker(s,goal)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}