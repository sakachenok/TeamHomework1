public class ElectricalEquipment {
    public String HeadlightType;
    public String HeatedSteeringWheel;
    public String HeatedWindshield;
    public String AdjustingTheMirrors;

    public ElectricalEquipment(String headlightType, String heatedSteeringWheel, String heatedWindshield, String adjustingTheMirrors) {
        HeadlightType = headlightType;
        HeatedSteeringWheel = heatedSteeringWheel;
        HeatedWindshield = heatedWindshield;
        AdjustingTheMirrors = adjustingTheMirrors;
    }

    @Override
    public String toString() {
        return "ElectricalEquipment{" +
                "HeadlightType='" + HeadlightType + '\'' +
                ", HeatedSteeringWheel='" + HeatedSteeringWheel + '\'' +
                ", HeatedWindshield='" + HeatedWindshield + '\'' +
                ", AdjustingTheMirrors='" + AdjustingTheMirrors + '\'' +
                '}';
    }
}
