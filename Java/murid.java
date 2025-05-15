public class murid {
    public static void main(String[] args) {
        
        int muridID1=(int)(Math.random()*36);
        int muridID2=(int)(Math.random()*36);
        int muridID3=(int)(Math.random()*36);
        String[] muridNama ={"Asep","Maman","Ujang"};
        char[] kelas ={'A','B','C'};

            
        
            System.out.println("Nama Murid = "+ muridNama[0] + " ");
            System.out.println("ID "+ muridNama[0] + " = " + muridID1 + " ");
            System.out.println("Kelas = "+ kelas[0]);

            System.out.println("Nama Murid = "+ muridNama[1] + " ");
            System.out.println("ID "+ muridNama[1] + " = " + muridID2 + " ");
            System.out.println("Kelas = "+ kelas[1]);


            System.out.println("Nama Murid = "+ muridNama[2] + " ");
            System.out.println("ID "+ muridNama[2] + " = " + muridID3 + " ");
            System.out.println("Kelas = "+ kelas[2]);




    }
}
