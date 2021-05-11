package sample.Entities;

import sample.Entities.Angajat;

import java.util.*;

/**
 * @author Alexandra Tudor
 */
public class Sef {

    private String nume;
    private String parola;

    public Sef(String nume, String parola) {
        this.nume = nume;
        this.parola = parola;
    }

    public Sef() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void aprobare_update_login() {
        // TODO implement here
    }

    public void aprobare_update_logout() {
        // TODO implement here
    }

}