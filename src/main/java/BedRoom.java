import java.util.ArrayList;

public class BedRoom {

    private int roomNumber;
    private int capacity;
    private String type;
    private double rate;
    private boolean availability;
    private ArrayList<Client> clients;

    public BedRoom(int roomNumber, int capacity, String type, double rate, boolean availability) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.rate = rate;
        this.availability = availability;
        this.clients = new ArrayList<>();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getType(){
        return this.type;
    }

    public double getRate(){
        return this.rate;
    }

    public boolean getAvailability(){
        return this.availability;
    }

    public int clientCount(){
        return this.clients.size();
    }

    public void letClientIn(Client client){
        if (this.availability == false) {
            return;
        }
        this.clients.add(client);

    }

    public void clearRoom(){
        this.clients.clear();
    }

    public void setAvailability(boolean status){
        this.availability = status;
    }


//    public void addClient(Client client){
//        if (this.availability){
//            this.clients.add(client);
//            this.availability = false;
//        }
//    }
//
//    public void checkOut(){
//        this.clients.;
//        this.availability = true;
//    }


}
