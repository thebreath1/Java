public class Recursion {
    public static void main(String[] args) {
     
            int hasil = sum(20);
            System.out.println(hasil);
      }
      public static int sum(int k){
        if (k > 0) {
            return k + sum(k - 1);
        }
        else {
            return 0;
        }
      }
}