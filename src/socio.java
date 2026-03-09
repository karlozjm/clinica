public class socio implements accionsocio {
    protected String nombre;
    protected int id;

    public socio(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }
    @Override
    public void ingresaralclub(){
        System.out.println(nombre + "Ha ingresado al club con ID: " + id);
    }

}
