package Uebung1.Ubeung2;

public abstract class GeoObjekt  implements Verschiebbar{
    String farbe;

    public String farbe(){
        return farbe;
    };
    public void setFarbe(String f) {
        this.farbe = f;
    }
}
