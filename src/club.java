import java.util.ArrayList;
import java.util.List;
public class club {
    private String nombre;
    private List<socio> socios;
    public club(String nombre) {
        this.nombre = nombre;
        this.socios = new ArrayList<>();
    }
    public void registrar(socio s){
        socios.add(s);
        System.out.println(s.nombre + " se unio al club "+ nombre );
    }
}