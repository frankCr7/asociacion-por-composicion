public class Menu 
{
    private String clase;

    private String tipo;

    private Clientes clientes;

    public Menu(String clase, String tipo)
    {
        this.clase = clase;
        this.tipo = tipo;

    }

    public String getClase()
    {
        return clase;
    }

    public String getTipo() {
        return tipo;
    }

    public void agregarMenu(Clientes clientes)
    {
         this.clientes = clientes;

    }

    public Clientes mostrarClientes()
    {
        return this.clientes;
    }
    
}
