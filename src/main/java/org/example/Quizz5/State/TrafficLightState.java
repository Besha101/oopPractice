package org.example.Quizz5.State;

public interface TrafficLightState {



    public void transitionToRed(TrafficLightContext context);
    public void transitionToYellow(TrafficLightContext context);
    public void transitionToGreen(TrafficLightContext context);
}
