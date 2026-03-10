public class problem7 {
    public static void main(String[] args) {
        
        double radiusKm = 6378;   // radius of Earth in kilometers
        double pi = Math.PI;
        
        // Volume formula: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        
        // 1 km = 0.621371 miles
        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);
        
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}