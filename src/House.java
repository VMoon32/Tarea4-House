public class House {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom []restRooms = new RestRoom[5];
    private BedRoom []bedRooms = new BedRoom[5];
    private Yard yard;

    private int nBedRooms = 0;
    private int nRestRooms = 0;

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public void setRestRooms(RestRoom[] restRooms) {
        this.restRooms = restRooms;
    }

    public void setBedRooms(BedRoom[] bedRooms) {
        this.bedRooms = bedRooms;
    }

    public void setYard(Yard yard) {
        this.yard = yard;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public RestRoom[] getRestRooms() {
        return restRooms;
    }

    public BedRoom[] getBedRooms() {
        return bedRooms;
    }

    public Yard getYard() {
        return yard;
    }
    //SE PUEDE HACER UNO? ->
    public void addRoom(BedRoom bedRoom){
        if(this.nBedRooms<5){
            this.bedRooms[this.nBedRooms++] = bedRoom;
        }
        else{
            throw new RuntimeException("Can not manage any more bedrooms");
        }
    }

    public void addRoom(RestRoom restRoom){
        if(this.nRestRooms<5){
            this.restRooms[this.nRestRooms++] = restRoom;
        }
        else{
            throw new RuntimeException("Can not manage any more restrooms");
        }
    }
    //ESTE <-
}


