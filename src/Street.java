import java.util.HashMap; //No me deja usar import java.util.List; busqué otra manera

public class Street {
    private String name;
    private HashMap<Integer, House> houses;

    public Street(){
        this.houses = new HashMap<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public House getHouse(int number){
        House house = this.houses.get(number);
        return house;
    }

    public void addHouse(int number, House house){
        this.houses.put(number, house);
    }

}
