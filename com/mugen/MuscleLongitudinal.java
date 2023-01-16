package com.mugen;

public class MuscleLongitudinal extends DecoratorMuscle{


    private  Boolean muscleContracter ;

    public MuscleLongitudinal() {
        this.muscleContracter = false;
    }



    @Override
    public String nomMuscle() {
        return "Longitudinal";
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
