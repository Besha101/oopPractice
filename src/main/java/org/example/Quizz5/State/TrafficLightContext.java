package org.example.Quizz5.State;

public class TrafficLightContext {

    private TrafficLightState state;

    public TrafficLightContext() {
        this.state = new RedLightState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void transitionToRed(){
        state.transitionToRed(this);
    }

    public void transitionToYellow(){
        state.transitionToYellow(this);
    }

    public void transitionToGreen(){
        state.transitionToGreen(this);
    }
}
