import java.util.StringJoiner;

public class Auto {
    ElectricalEquipment electricalEquipment;
    Engine engine;
    Exterior exterior;
    FuelSystem fuelSystem;
    GearBox gearBox;
    GeneralInformation generalInformation;
    Salon salon;

    public Auto(ElectricalEquipment electricalEquipment, Engine engine, Exterior exterior, FuelSystem fuelSystem, GearBox gearBox, GeneralInformation generalInformation, Salon salon) {
        this.electricalEquipment = electricalEquipment;
        this.engine = engine;
        this.exterior = exterior;
        this.fuelSystem = fuelSystem;
        this.gearBox = gearBox;
        this.generalInformation = generalInformation;
        this.salon = salon;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "electricalEquipment=" + electricalEquipment +
                ", engine=" + engine +
                ", exterior=" + exterior +
                ", fuelSystem=" + fuelSystem +
                ", gearBox=" + gearBox +
                ", generalInformation=" + generalInformation +
                ", salon=" + salon +
                '}';
    }
}
