public class Clientes 
{
    private String nombre;

    private int numeroDeMesa;

    private Empleado[] empleado;

    private int contador;

    public Clientes(String nombre, int numeroDeMesa)
    {
        this.nombre = nombre;
        this.numeroDeMesa = numeroDeMesa;
        this.empleado = new Empleado[3];
        this.contador = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeMesa() {
        return numeroDeMesa;
    }

    public void setNumeroDeMesa(int numeroDeMesa) {
        this.numeroDeMesa = numeroDeMesa;
    }

    public void agregarClientes(Empleado empleado)
    {
        this.empleado[this.contador] = empleado;

        this.contador++;
    }

    public Empleado[] listarClientes()
    {
        return this.empleado;
    }
    
}
