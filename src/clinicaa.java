import java.util.Scanner;
public class clinicaa {
    private String nombre;
    private int edad;
    private double peso;
    private double presionart;
    private boolean estable;

    {public clinicaa ( String nombre ,int edad , double peso , double presion art ,boolean estable,)
    this.nombre = nombre;
    this.edad = edad;
    this.peso = peso;
    this.presionart = presionart;
    this.estable = true;}

    public void cumpliraños() {
        edad++;
    }
    public boolean aumentarpeso(double cantidad){
        if(cantidad > 0){
            peso += cantidad;
            return true;
        }
        return false;
    }
    public boolean subirpresion(double valor) {
        if (valor > 0) {
            presionart += valor;
            return true;
        }
        return false;

    }
    public boolean bajarpresion(double valor){
        if(valor > 0 && presionart - valor >= 0){
            presionart-=valor;
            return true;
        }
        return false;
    }
    public void empeorarestado() {
        estable = false;
    }
    public void mejorarestado(){
        estable = true;
    }
    public void mostrarhc(){
        System.out.println("HISTORIA CLINICA");
        System.out.println( "nombre: " + nombre );
        System.out.println( "edad: " + edad );
        System.out.println( "peso " + peso);
        System.out.println( "presion: " + presionart);
        System.out.println( "Estable: "+ estable);
    }
}

