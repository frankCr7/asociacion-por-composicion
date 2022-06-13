public class Platos 
{
    private String nombres;

    private Menu[] menu;

    private int contador;

    public Platos(String nombres)
    {
        this.nombres = nombres;

        this.menu = new Menu[2];
        

    }

    public String getNombres()
    {
        return nombres;
    }

    public void agregarPlatos(Menu menu)
    {
         this.menu[this.contador] = menu;
         this.contador++;

    }

    public Menu[] mostrarMenu()
    {
        return this.menu;
    }
    
}
