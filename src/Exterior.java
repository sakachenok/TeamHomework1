public class Exterior {
    String bodyType;
    String bodyColor;
    int groundClearance;
    int wheelSize;

    public Exterior(String bodyType, String bodyColor, int groundClearance, int wheelSize) {
        this.bodyType = bodyType;
        this.bodyColor = bodyColor;
        this.groundClearance = groundClearance;
        this.wheelSize = wheelSize;
    }

    @Override
    public String toString() {
        return "Exterior{" +
                "bodyType='" + bodyType + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", groundClearance=" + groundClearance +
                ", wheelSize=" + wheelSize +
                '}';
    }
}