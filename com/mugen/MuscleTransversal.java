package com.mugen;

public class MuscleTransversal extends DecoratorMuscle{

    private Boolean muscleContracter;

    public MuscleTransversal() {
        this.muscleContracter = false;
    }




    @Override
    public String nomMuscle() {
        return "Transversaux";
    }

    @Override
    public String etatMuscle() {
        if(muscleContracter.equals(true)){
            return "contracter";
        }
        return "relacher";
    }

    @Override
    public void contracterMuscle() {
        this.muscleContracter = true;
        System.out.println(nomMuscle() + " est " + etatMuscle());
    }

    @Override
    public void relacherMuscle() {
        this.muscleContracter = false;
        System.out.println(nomMuscle() + " est " + etatMuscle());
    }


}
