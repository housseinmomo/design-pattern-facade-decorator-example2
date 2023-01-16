package com.mugen;

public class Main {

    public static void main(String[] args) {

        Oiseau mugen = new Oiseau("mugen");

        EnvoleProcess process = new EnvoleProcess();

        process.voler(mugen);

    }
}
