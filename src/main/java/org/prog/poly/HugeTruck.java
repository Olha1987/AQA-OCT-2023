package org.prog.poly;

public class HugeTruck extends GasTruck {

    //TODO: override accelerate and stop methods
    @Override
    public void accelerate () {System.out.println("HugeTruck accelerating");}

    @Override
    public void stop () {System.out.println("HugeTruck stop");}
}