public class Main {
    public static void main(String[] args) {

        ElectricalEquipment electricalEquipment = new ElectricalEquipment("xenon","yes","yes","automated");
        Engine engine = new Engine("petrol",160,2);
        Exterior exterior = new Exterior("Sedan","Grey",18,16);
        FuelSystem fuelSystem = new FuelSystem(50,"on the left");
        GearBox gearBox = new GearBox("manual",6);
        GeneralInformation generalInformation = new GeneralInformation("Skoda","Oktavia",2015,"good",150000);
        Salon salon = new Salon("leather","manual","yes","plastic","160");

        Auto auto = new Auto(electricalEquipment, engine, exterior, fuelSystem, gearBox, generalInformation, salon);

        System.out.println(auto);

    }
}