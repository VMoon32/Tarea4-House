import java.util.List; //Aquí no marca problema porque no tiene new List<>()

public class Neighborhood {
    public List<Street> streets;
    public int gardens;
    public boolean basketballCourt;
    public boolean footballCourt;
    public boolean swimmingPool;

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    public int getGardens() {
        return gardens;
    }

    public void setGardens(int gardens) {
        this.gardens = gardens;
    }

    public boolean isBasketballCourt() {
        return basketballCourt;
    }

    public void setBasketballCourt(boolean basketballCourt) {
        this.basketballCourt = basketballCourt;
    }

    public boolean isFootballCourt() {
        return footballCourt;
    }

    public void setFootballCourt(boolean footballCourt) {
        this.footballCourt = footballCourt;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }
}
