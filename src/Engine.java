public class Engine {
    public String type;
    public int power;
    public int volume;

    public Engine(String type, int power, int volume) {
        this.type = type;
        this.power = power;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                '}';
    }
}
