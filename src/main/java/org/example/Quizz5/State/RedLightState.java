package org.example.Quizz5.State;

public class RedLightState implements TrafficLightState {

    @Override
    public void transitionToRed(TrafficLightContext context) {
        System.out.println("Already Red");
    }

    @Override
    public void transitionToYellow(TrafficLightContext context) {
        System.out.println("Switching to Yellow");
        context.setState(new YellowLightState());
    }

    @Override
    public void transitionToGreen(TrafficLightContext context) {
        System.out.println("Switching to Green");
        context.setState(new GreenLightState());
    }
}
