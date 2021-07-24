package dip;

import java.util.Random;

public class GeneratIdSrvice {
    public String getId(){
        Random random = new Random();
        int number = random.nextInt(10);
        return "XYZ"+ number;

    }
}
