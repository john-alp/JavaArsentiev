

public class Clients {
    private String clientIdName;
    private Pets pets;

    public Clients (String clientIdName, Pets pets){
        this.clientIdName = clientIdName;
        this.pets = pets;
    }
    public void setClientIdName(String clientIdName){
        this.clientIdName = clientIdName;
    }
    public void setPets(String setPetName){
        this.pets.setPetName(setPetName);
    }
    public String getClientIdName(){
        return clientIdName;
    }
    public String getPets(){
        return pets.getPetName();
    }
    public String getPetType(){
        return pets.getPetType();
    }

    @Override
    public String toString() {
        return "Client: " + clientIdName + '\'' +  ", petName: " + pets.getPetName() + ", petType: " + pets.getPetType();
    }

}
