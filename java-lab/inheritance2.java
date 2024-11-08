//2.	Create a base class Distance which stores the distance between two locations in miles and a method travelTime(). The method prints the time taken to cover the distance when the speed is 60 miles per hour. Now in a derived class DistanceKMH, override travelTime() so that it prints the time assuming the distance is in kilometers and the speed is 100 km per hour. Demonstrate the working of the classes.

import java.util.Scanner;

class Distance {
    protected double dismile; 

    public Distance(double dismile) {
        this.dismile = dismile;
    }

    void travelTime() {
        double time = dismile / 60.0;
        System.out.println("Travel time in miles at 60 miles per hour: " + time + " hours");
    }
}

class DistanceKMH extends Distance {
    private double diskm;

    public DistanceKMH(double dismile) {
        super(dismile);
        this.diskm = dismile * 1.60934; 
    }

    @Override
    void travelTime() {
        double time = diskm / 100.0;
        System.out.println("Travel time in kilometers at 100 km per hour: " + time + " hours");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in miles: ");
        double distanceInMiles = sc.nextDouble();

        Distance distanceMiles = new Distance(distanceInMiles);
        DistanceKMH distanceKM = new DistanceKMH(distanceInMiles);

        distanceMiles.travelTime();
        distanceKM.travelTime();
    }
}
