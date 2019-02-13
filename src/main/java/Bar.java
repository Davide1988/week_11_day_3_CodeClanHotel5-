import java.util.ArrayList;

public class Bar {

    private String name;
    private int capacity;
    private ArrayList<Client> members;

    public Bar(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.members = new ArrayList<>();
    }


    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int clientCount(){
        return this.members.size();
    }

    public void addClient(Client client){
        if ((client.getAge() >= 18) && (clientCount() < getCapacity())) {
            this.members.add(client);
        }
    }

    public void removeClient(Client client){
        this.members.remove(client);
    }

}
