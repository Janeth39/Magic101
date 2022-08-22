public class Dragon
{
    String name;
    int firePower;
    public Dragon(String name, int firePower)
    {
        this.name = name;
        this.firePower = firePower;
    }

    public String getName() {
        return name;
    }

    public int getFirePower() {
        return firePower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", firePower=" + firePower +
                '}';
    }
}
