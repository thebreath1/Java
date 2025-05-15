public class param {
    public static void main(String[] args) {

        String[] bounty ={"1.Luffy","2.Ichigo","3.Naruto","4.Goku","5.Asta"};
        char cur = '$';
        float fee = 602.1f;
        fee*=20;

            System.out.println("DICARI 5 BOUNTY BERIKUT :");
            for (String i : bounty){
                System.out.println(i);
            }


            System.out.println(" ");

            System.out.print("JIKA KALIAN MENDAPATKAN SALAH SATU DARI MEREKA,");
            System.out.println("MAKA BERHAK MENDAPATKAN KOMPENSANSI SEBESAR : " + fee + cur);


    }
}
