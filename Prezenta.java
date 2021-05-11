package sample.Entities;

import sample.Entities.Angajat;

import java.util.*;

/**
 * @author Alexandra Tudor
 */
public class Prezenta {


    private int ora_login;
    private int ora_logout;
    private Date data;

    public Prezenta() {
        super();
    }
    public Prezenta(int ora_login, int ora_logout, Date data) {
        this.ora_login = ora_login;
        this.ora_logout = ora_logout;
        this.data = data;
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

    public int getOra_login() {
        return ora_login;
    }
    public void setOra_login(int ora_login) {
        this.ora_login = ora_login;
    }
    public int getOra_logout() {
        return ora_logout;
    }
    public void setOra_logout(int ora_logout) {
        this.ora_logout = ora_logout;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
}