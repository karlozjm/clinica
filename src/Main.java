//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        socio s1 = new socio("Carlos", 101);
        sociovip v1 = new sociovip("Sebastian", 505, "Acceso a golf");
        carnet c1 = new carnet("ABC-123");
        club miclub = new club("Country Club");
        miclub.registrar(s1);
        System.out.println("Ejecutando pruebas de relaciones");
        s1.ingresaralclub();
        v1.ingresaralclub();
        c1.validar();
        imprimirreporte(s1);
    }
    public static void imprimirreporte(socio s){
        System.out.println(("Generando reporte pdf para: " + s.nombre));
    }
}