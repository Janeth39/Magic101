public class ElectricWizard extends Wizard
{
    //variables
    int zappiesNum;
    String electricGiantName;
    int cloudsNum;

    public ElectricWizard( int speed, int power, int zappiesNum, String electricGiantName, int cloudsNum )
    {
        super(speed, power);
        this.zappiesNum = zappiesNum;
        this.electricGiantName = electricGiantName;
        this.cloudsNum =cloudsNum;
    }//end of electricWizard method

    @Override
    public String toString() {
        return "ElectricWizard{" +
                "zappiesNum=" + zappiesNum +
                ", electricGiantName='" + electricGiantName + '\'' +
                ", cloudsNum=" + cloudsNum +
                '}';
    }//end of toString

}//end of ElectricWizard class
