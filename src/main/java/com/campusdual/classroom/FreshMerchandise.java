package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    //atributos
    protected Date expirationDate;
    protected SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    //constructores
    public FreshMerchandise(String name, String uniqueId, String responsibleId, Date expirationDate) {
        super(name, uniqueId, responsibleId);
        this.expirationDate = expirationDate;
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    //getters y setters de los atributos
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }
    //resto de metodos
    @Override
    public Object getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Localización: ");
        builder.append(getLocation());
        builder.append("\n");
        builder.append("Caducidad: ");
        builder.append(sdf.format(this.getExpirationDate()));
        return builder.toString();
    }

    public String getFormattedDate(Date expirationDate) {
        SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
        String formatteDate =dateFormat.format(expirationDate);
        return formatteDate;
    }

}





