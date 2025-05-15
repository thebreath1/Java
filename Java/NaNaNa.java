import java.util.Scanner;

public class NaNaNa {
    
    public static void main(String[] args) {
        String Rstr = "";
        int Param[]={9410,2021,9900,5671,0011};

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter password : ");
            String passwd = myObj.nextLine();
            if (passwd == null) {
                System.out.println("Access denied");
            } 
            else {
                System.out.println("Access granted");   
            }
           
                for(int i = 0; i < passwd.length(); i++) {
                    Rstr = passwd.charAt(i) + Rstr;
                }

            Scanner prm = new Scanner(System.in);
            System.out.print("Enter encrypt number : ");
                int num = prm.nextInt();
            if (num != 0 ) {
                System.out.println("Access granted");
                System.out.println("");   
            } 
            else {
                System.out.println("Access denied");
            }
            for(int j = 0; j < 5; j++){
                int random = (int)(Math.random()*10000);
                System.out.println(random+Rstr+num+Param[j]);
            }
    }
}
