public class GearBox {
    public String type;
    public int numberOfGears;

    public GearBox(String type, int numberOfGears) {
        this.type = type;
        this.numberOfGears = numberOfGears;
    }

    @Override
    public String toString() {
        return "GearBox{" +
                "type='" + type + '\'' +
                ", numberOfGears=" + numberOfGears +
                '}';
    }
}
