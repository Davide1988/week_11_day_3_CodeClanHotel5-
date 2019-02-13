import java.util.ArrayList;

public class Hotel {


    private String name;
    private int rating;
    private ArrayList<BedRoom> bedRooms;

    public Hotel(String name, int rating){
        this.name = name;
        this.rating = rating;
        this.bedRooms = new ArrayList<>();
    }

    public void addBedroom(BedRoom bedRoom){
        this.bedRooms.add(bedRoom);
    }

    public int numberOfBedrooms(){
        return this.bedRooms.size();
    }

    public void addClient(Client client, BedRoom bedRoom){
       bedRoom.letClientIn(client);
    }

    public void getCustomerOut(BedRoom bedRoom){
        bedRoom.clearRoom();
    }

    public Booking bookRoom(BedRoom bedRoom, int number, int number_of_night){
        bedRoom.setAvailability(false);
        Booking booking = new Booking(bedRoom, number, number_of_night);
        return booking;
    }

    public double getBill(Booking booking){
        BedRoom bedRoom = booking.getBedroom();
        int non = booking.getNoOfNights();
        double rate = bedRoom.getRate();
        double total = non * rate;
        return total;


    }

}
