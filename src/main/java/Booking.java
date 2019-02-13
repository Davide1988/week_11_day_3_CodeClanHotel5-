public class Booking {

    private BedRoom bedRoom;
    private int noOfNights;
    private int noOfClients;

    public Booking(BedRoom bedRoom, int noOfNights, int noOfClients){
        this.bedRoom = bedRoom;
        this.noOfNights = noOfNights;
        this.noOfClients = noOfClients;
    }


    public BedRoom getBedroom(){
        return this.bedRoom;
    }

    public int getNoOfNights(){
        return this.noOfNights;
    }

    public int getNoOfClients(){
        return this.noOfClients;
    }

    public void bookRoom(BedRoom bedRoom){
        bedRoom.setAvailability(false);
    }



}
