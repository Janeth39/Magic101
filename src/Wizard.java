public class Wizard
{
    //variables
    int speed;
    int power;


    //constructors
    public Wizard(int speed, int power)
    {
        this.speed = speed;
        this.power = power;
    }//end of Wizard method


    //Getters
    public int getPower() {
        return power;
    }//end of get power

    public int getSpeed() {
        return speed;
    }//end of get speed


    //Setters
    public void setPower(int power) {
        this.power = power;
    }//end of setPower
    public void setSpeed(int speed) {
        this.speed = speed;
    }//end of setSpeed


    //toString

    @Override
    public String toString() {
        return "Wizard{" +
                "speed=" + speed +
                ", power=" + power +
                '}';
    }
}//end of wizard class
