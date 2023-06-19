package lecture9;

public class Audio implements RemoteControl, NoiseCancel {

    @Override
    public void turnOn() {
        System.out.println("Turn on Audio");
    }

    @Override
    public void cancelNoise() {
        System.out.println("Audio noise cancelled");
    }
}
