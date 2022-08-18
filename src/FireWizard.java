public class FireWizard extends Wizard
{
    boolean fireSlash;
    int fireball;
    String phoenixName;

    public FireWizard( int speed, int power, boolean fireSlash, int fireball, String phoenixName)
    {
        super(speed,power);
        this.fireSlash = fireSlash;
        this.fireball = fireball;
        this.phoenixName = phoenixName;
    }//end of  FireWizard method

    @Override
    public String toString() {
        return "FireWizard{" +
                "fireSlash=" + fireSlash +
                ", fireball=" + fireball +
                ", phoenixName='" + phoenixName + '\'' +
                '}';
    }//end toString

}//end of FireWizard class
