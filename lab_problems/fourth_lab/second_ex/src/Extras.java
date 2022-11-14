public class Extras {
    public static House getBiggestHouse(House[] houses) throws EmptyArrayException {
        if(houses.length == 0){
            throw new EmptyArrayException();
        }
        double biggestFloors = 0;
        House biggestHouse = null;
        for(House curr_house: houses){
            double currFloor = curr_house.getSurface() / curr_house.getFloors();
            if(currFloor > biggestFloors){
                biggestFloors = currFloor;
                biggestHouse = curr_house;
            }
        }
        return biggestHouse;
    }
}
