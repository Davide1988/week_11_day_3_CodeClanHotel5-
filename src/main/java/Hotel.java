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




}
