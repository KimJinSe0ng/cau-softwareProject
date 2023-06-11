package week12.pb9;

import java.util.Arrays;

public class BasketBallPlayer implements Player{

    private String name;
    private double speed;
    private String[] tools;
    private double jump;

    public BasketBallPlayer(String name) {
        this.name = name;
    }


    public void setJump(double Jump) {
        jump = Jump;
    }

    @Override
    public void showDetails() {
        if (speed != 0.0 && jump != 0.0 && tools != null) {
            System.out.println("name: " + name + ", speed: " + speed + ", tools: " + Arrays.toString(tools) + ", jump: " + jump);
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
