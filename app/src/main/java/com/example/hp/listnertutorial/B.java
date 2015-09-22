package com.example.hp.listnertutorial;

/**
 * Created by HP on 9/13/2015.
 */
public class B {
    private OnCustomEventListener mListener; //listener field

    //setting the listener
    public void setCustomEventListener(OnCustomEventListener eventListener) {
        this.mListener=eventListener;
        if(this.mListener!=null){
            this.mListener.onEvent(5);
        }
    }
}
