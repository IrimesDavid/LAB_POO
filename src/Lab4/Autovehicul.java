package Lab4;

import java.awt.*;

public class Autovehicul {
   String marca;
   Color culoare;
   float vitezaCurenta;
   int treaptaDeVitezaCurenta;
   int vitezaMaxima;
   int nrTrepte;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getCuloare() {
        return culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public float getVitezaCurenta() {
        return vitezaCurenta;
    }

    public void setVitezaCurenta(float vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

    public int getTreaptaDeVitezaCurenta() {
        return treaptaDeVitezaCurenta;
    }

    public void setTreaptaDeVitezaCurenta(int treaptaDeVitezaCurenta) {
        this.treaptaDeVitezaCurenta = treaptaDeVitezaCurenta;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public int getNrTrepte() {
        return nrTrepte;
    }

    public void setNrTrepte(int nrTrepte) {
        this.nrTrepte = nrTrepte;
    }

    public Autovehicul(String marca, Color culoare, float vitezaCurenta, int treaptaDeVitezaCurenta, int vitezaMaxima, int nrTrepte) {
        this.marca = marca;
        this.culoare = culoare;
        this.vitezaCurenta = vitezaCurenta;
        this.treaptaDeVitezaCurenta = treaptaDeVitezaCurenta;
        this.vitezaMaxima = vitezaMaxima;
        this.nrTrepte = nrTrepte;
    }
    //   public void accelerare(float nrKm)
//   {
//       this.vitezaCurenta +=nrKm;
//
//   }
}
