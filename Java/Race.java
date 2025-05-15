public class Race {
    
    public void Cars(){
        System.out.println("Cars are now getting ready!!");
    }

    public void Speed(int Maxspeed){
        System.out.println("Cars now has top speed around " + Maxspeed);
    }
    public static void main(String[] args) {

        Race Track = new Race();
        Track.Cars();
        Track.Speed(350);
        
    }
}