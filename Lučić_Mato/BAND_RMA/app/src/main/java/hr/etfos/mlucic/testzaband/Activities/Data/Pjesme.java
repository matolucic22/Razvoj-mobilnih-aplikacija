package hr.etfos.mlucic.testzaband.Activities.Data;

/**
 * Created by Home on 15.12.2016..
 */

public class Pjesme {
    private int id;
    private String ime, tekst;

    public Pjesme() {

    }

    public Pjesme(int id, String ime, String tekst) {
        this.id = id;
        this.ime = ime;
        this.tekst = tekst;
    }

    public Pjesme(String ime) {
        this.ime = ime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
}

