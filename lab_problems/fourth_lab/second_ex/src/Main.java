public class Main {
    public static void main(String[] args){
        try{
        House house = new House(4, "Vasko", 4, 15.5, "Vasil Levski");
        }catch (NegativeHeightExceptions e){
//            throw new NegativeHeightExceptions();
            System.err.println(e.getMessage());
        }catch(NegativeSurface e){
            System.err.println(e.getMessage());
        }
        try{
            House secondHouse = House.createHouse();
        }catch (NegativeHeightExceptions e){
            System.err.println(e.getMessage());
        }catch(NegativeSurface e){
            System.err.println(e.getMessage());
        }

        House[] buildings = {};
        try{
        House biggestHouse = Extras.getBiggestHouse(buildings);
        }catch (EmptyArrayException e){
            System.err.println(e.getMessage());
        }

    }


}