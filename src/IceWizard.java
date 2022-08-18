public class IceWizard extends Wizard
{
    int snowball;
    boolean iceSpear;
    String gollumName;

    public IceWizard(int speed, int power, int snowball, boolean iceSpear, String gollumName)
    {
        super(speed, power);
        this.snowball = snowball;
        this.iceSpear = iceSpear;
        this.gollumName = gollumName;
    }//end of IceWizard

    @Override
    public String toString() {
        return "IceWizard{" +
                "snowball=" + snowball +
                ", iceSpear=" + iceSpear +
                ", gollumName='" + gollumName + '\'' +
                '}';
    }// end of toString
}
