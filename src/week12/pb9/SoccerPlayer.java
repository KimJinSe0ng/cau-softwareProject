package week12.pb9;

import java.util.Arrays;

public class SoccerPlayer implements Player {

    private String name;
    private double speed;
    private String[] tools;
    private double kickSpeed;

    public SoccerPlayer(String name, double kickSpeed) {
        this.name = name;
        this.kickSpeed = kickSpeed;
    }

    public void setKickSpeed(double KickSpeed) {
        kickSpeed = KickSpeed;
    }

    @Override
    public void showDetails() {
        if (speed != 0.0 && kickSpeed != 0.0 && tools != null) {
            System.out.println("name: " + name + ", speed: " + speed + ", tools: " + Arrays.toString(tools) + ", kickSpeed: " + kickSpeed);
        } else {
            System.out.println("No information");
        }
    }

    @Override
    public void setSpeed(double Speed) {
        speed = Speed;
    }

    @Override
    public void setTools(String[] Tools) {
        tools = Tools;
    }

    @Override
    public String getName() {
        return name;
    }

}
