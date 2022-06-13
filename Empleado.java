public class Empleado 
{
    private String nombre;

    private int dni;

    private Restaurante[] restaurante;

    private int contador;

    public Empleado(String nombre, int dni)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.restaurante = new Restaurante[3];
        

    }

    public String getNombre()
    {
        return nombre;
    }

    public int getDni()
    {
        return dni;
    }

    public void agregarRestaurante(Restaurante restaurante)
    {
         this.restaurante[this.contador] = restaurante;
         this.contador++;

    }

    public Restaurante[] mostrarRestaurante()
    {
        return this.restaurante;
    }
    
}
