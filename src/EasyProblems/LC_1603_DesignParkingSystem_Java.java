package EasyProblems;

public class LC_1603_DesignParkingSystem_Java {
    private int[] places;

    public LC_1603_DesignParkingSystem_Java(int big, int medium, int small) {
        places = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if(places[carType -1] > 0){
            places[carType -1]--;
            return true;
        }
        return false;
    }
}

