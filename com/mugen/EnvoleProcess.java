package com.mugen;

public class EnvoleProcess {


    private Muscle longitudinal = new MuscleLongitudinal();
    private Muscle transversal = new MuscleTransversal();

    public void voler(Oiseau oiseau) {

        System.out.println("Processus d'envol " + oiseau.getNom());

        longitudinal.contracterMuscle();
        transversal.relacherMuscle();
        System.out.println("-> Les ailes de " + oiseau.getNom() + " se relevent");

        transversal.contracterMuscle();
        longitudinal.relacherMuscle();

        System.out.println("-> Les ailes de " + oiseau.getNom() + " s'abaissent");
        System.out.println("=> Fin du processus d'envole : " + oiseau.getNom() + " vole");

    }

    public void atterir() {}
}
