/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Fitahiana
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Etudiant {
    private int numEt;
    private String nom;
    private double noteMath;
    private double notePhys;
    private double moyenne;

    // Constructeur par défaut
    public Etudiant() {
    }

    // Constructeur avec tous les champs
    public Etudiant(int numEt, String nom, double noteMath, double notePhys) {
        this.numEt = numEt;
        this.nom = nom;
        this.noteMath = noteMath;
        this.notePhys = notePhys;
    }

    // Getters et Setters
    public int getNumEt() {
        return numEt;
    }

    public void setNumEt(int numEt) {
        this.numEt = numEt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getNoteMath() {
        return noteMath;
    }

    public void setNoteMath(double noteMath) {
        this.noteMath = noteMath;
    }

    public double getNotePhys() {
        return notePhys;
    }

    public void setNotePhys(double notePhys) {
        this.notePhys = notePhys;
    }

    // Méthode pour calculer la moyenne
    public double getMoyenne() {
        moyenne = (noteMath + notePhys) / 2;
        return moyenne;
    }
}