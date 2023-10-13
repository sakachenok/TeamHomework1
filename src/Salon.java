public class Salon {
    public String SeatUpholstery;
    public String SeatAdjustment;
    public String SteeringWheelAdjustment;
    public String InteriorMaterial;
    public String TrunkVolume;

    public Salon(String seatUpholstery, String seatAdjustment, String steeringWheelAdjustment, String interiorMaterial, String trunkVolume) {
        SeatUpholstery = seatUpholstery;
        SeatAdjustment = seatAdjustment;
        SteeringWheelAdjustment = steeringWheelAdjustment;
        InteriorMaterial = interiorMaterial;
        TrunkVolume = trunkVolume;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "SeatUpholstery='" + SeatUpholstery + '\'' +
                ", SeatAdjustment='" + SeatAdjustment + '\'' +
                ", SteeringWheelAdjustment='" + SteeringWheelAdjustment + '\'' +
                ", InteriorMaterial='" + InteriorMaterial + '\'' +
                ", TrunkVolume='" + TrunkVolume + '\'' +
                '}';
    }
}
