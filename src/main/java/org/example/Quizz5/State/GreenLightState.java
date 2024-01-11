package org.example.Quizz5.State;

public class GreenLightState implements TrafficLightState{

    @Override
    public void transitionToRed(TrafficLightContext context) {
        System.out.println("Switching to Red");
        context.setState(new RedLightState());
    }

    @Override
    public void transitionToYellow(TrafficLightContext context) {
        System.out.println("Switching to Yellow");
        context.setState(new YellowLightState());
    }

    @Override
    public void transitionToGreen(TrafficLightContext context) {
        System.out.println("Already Green");
    }

}
