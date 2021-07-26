package reto1.c2;

public class ProyectoInversion {
    

     //Atributos
     private int tiempo;
     private double capital;
     private double interes;
 
     //Constructores
     ProyectoInversion(){
         this.tiempo = 7;
         this.capital = 5000000.0;
         this.interes = 5.0;
     }
 
     ProyectoInversion(int pTiempo, double pCapital, double pInteres){
         this.tiempo = pTiempo;
         this.capital = pCapital;
         this.interes = pInteres;
     }
 
     //Comportamiento
 
     //calcularInteresSimple
     public double calcularInteresSimple(){
        double interesSimple;
        interesSimple = capital * (interes/100) * tiempo;
        interesSimple = Math.round(interesSimple);
        return interesSimple;
    }
 
     //calcularInteresCompuesto
     public double calcuarInteresCompuesto(){
         double interesCompuesto;
         double a = 1 + (interes/100);
         double b = tiempo;
         interesCompuesto = capital * (Math.pow(a, b) - 1);
         interesCompuesto = Math.round(interesCompuesto);
         return interesCompuesto;
     }
 
     public double verificarInversion(int pTiempo, double pCapital, double pInteres){
        this.tiempo = pTiempo;
        this.capital = pCapital;
        this.interes = pInteres;
        double diferencia = 0;
        diferencia = this.calcuarInteresCompuesto() - this.calcularInteresSimple();
        return diferencia;
    }

    public double verificarInversion(){
        double diferencia = 0;
        diferencia = this.calcuarInteresCompuesto() - this.calcularInteresSimple();
        return diferencia;
    }
}

