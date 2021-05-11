package sample.Entities;

import java.util.*;

/**
 * @author Alexandra Tudor
 */
public class Angajat {

    private String nume;
    private String prenume;
    private String functie;
    private String parola;

    public Angajat(String nume, String prenume, String functie, String parola) {
        this.nume = nume;
        this.prenume = prenume;
        this.functie = functie;
        this.parola = parola;
    }

    public Angajat() {
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

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void update_status() {
        // TODO implement here
    }
    public void solicitare_update_login() {
        // TODO implement here
    }

    public void solicitare_update_logout() {
        // TODO implement here
    }

}