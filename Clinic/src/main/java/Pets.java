import java.io.Serializable;

public class Pets implements Serializable {
    public Pets(){}
    public String petName;
    public String petType;

    public Pets(String petName, String petType){
        this.petName = petName;
        this.petType = petType;
    }

    public void setPetName(String petName){
        this.petName = petName;
    }
    public String getPetName(){
        return petName;
    }
    public void setPetType(String petType){
        this.petType = petType;
    }
    public String getPetType(){
        return petType;
    }

    @Override
    public String toString() {
        return ", pet nameP: " + petName + ", pet typeP: " + petType ;
    }

//    @Override
//    public String toString() {
//        return "Pet{" +
//                "petName='" + petName + '\'' +
//                ", petType='" + petType + '\'' +
//                '}';
}

