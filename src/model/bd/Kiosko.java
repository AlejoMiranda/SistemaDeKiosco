package model.bd;

public class Kiosko {

    private int id;
    private String nombreDueño;
    private String nombreKIosko;
    private int costePatente;
    private int idLoginFK;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getNombreKIosko() {
        return nombreKIosko;
    }

    public void setNombreKIosko(String nombreKIosko) {
        this.nombreKIosko = nombreKIosko;
    }

    public int getCostePatente() {
        return costePatente;
    }

    public void setCostePatente(int costePatente) {
        this.costePatente = costePatente;
    }

    public int getIdLoginFK() {
        return idLoginFK;
    }

    public void setIdLoginFK(int idLoginFK) {
        this.idLoginFK = idLoginFK;
    }

}
