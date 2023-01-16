package com.mugen;

public  abstract class DecoratorMuscle implements Muscle{

    protected Muscle muscle;

    public DecoratorMuscle() {
    }

    @Override
    public String nomMuscle() {
        return muscle.nomMuscle();
    }

    @Override
    public String etatMuscle() {
        return muscle.etatMuscle();
    }

    @Override
    public void contracterMuscle() {
        muscle.contracterMuscle();
    }

    @Override
    public void relacherMuscle() {
        muscle.relacherMuscle();
    }
}
