public class FuelSystem {
    double tankVolume;
    String tankLocation;

    public FuelSystem(double tankVolume, String tankLocation) {
        this.tankVolume = tankVolume;
        this.tankLocation = tankLocation;
    }

    @Override
    public String toString() {
        return "FuelSystem{" +
                "tankVolume=" + tankVolume +
                ", tankLocation='" + tankLocation + '\'' +
                '}';
    }
}
