import java.util.Scanner;
public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        for(int i = 2; i<operation; i+=2){
            System.out.println(i);
        }

    }
}