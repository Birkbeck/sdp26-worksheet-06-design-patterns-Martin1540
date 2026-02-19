package builder;

public class SportsCarBuilder implements CarBuilder{

    @Override
    public void buildBodyStyle() {
        String bodyStyle = "External dimensions: overall length (inches): 192.3, overall width (inches): 75.5, overall height (inches): 54.2, wheelbase (inches): 112.3, front track (inches): 63.7, rear track (inches): 64.1 and curb to curb turning circle (feet): 37.7";
    }

    @Override
    public void buildPower(){
        String power = "323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm";
    }

    @Override
    public void buildEngine() {
        String engine = "3.6L V 6 DOHC and variable valve timing";
    }

    @Override
    public void buildBreaks() {
        // TODO: implement
    }

    @Override
    public void buildSeats() {
        // TODO: implement
    }

    @Override
    public void buildWindows() {
        // TODO: implement
    }

    @Override
    public void buildFuelType() {
        // TODO: implement
    }

    @Override
    public Car getCar(){
        // TODO: implement
        return null;
    }
}