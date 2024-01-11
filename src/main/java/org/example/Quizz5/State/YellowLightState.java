package org.example.Quizz5.State;

public class YellowLightState implements TrafficLightState{

    @Override
    public void transitionToRed(TrafficLightContext context) {
        System.out.println("Switching to Red");
        context.setState(new RedLightState());
    }

    @Override
    public void transitionToYellow(TrafficLightContext context) {
        System.out.println("Already Yellow");
    }

    @Override
    public void transitionToGreen(TrafficLightContext context) {
        System.out.println("Switching to Green");
        context.setState(new GreenLightState());
    }

}
