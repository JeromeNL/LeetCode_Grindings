package EasyProblems;

public class LT_1603_DesignParkingSystem_Java {
    private int big;
    private int medium;
    private int small;

    public LT_1603_DesignParkingSystem_Java(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if(carType == 1){
            if(big > 0){
                big--;
                return true;
            }
        }
        if(carType == 2){
            if(medium > 0){
                medium--;
                return true;
            }
        }
        if(carType == 3){
            if(small > 0){
                small--;
                return true;
            }
        }
        return false;

    }
}

