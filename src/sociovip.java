public class sociovip extends socio {
    private String beneficio;

    public sociovip(String nombre, int id, String beneficio){
        super(nombre, id);
        this.beneficio = beneficio;
    }
    @Override
    public void ingresaralclub(){
        System.out.println(nombre + " (VIP) ingreso con beneficio: " + beneficio );
    }
}
