public class Ingredientes 
{
    private String nombres;

    private String tipos;

    private Platos[] platos;

    private int contador;

    public Ingredientes(String nombres, String tipos)
    {
        this.nombres = nombres;

        this.tipos = tipos;

        this.platos = new Platos[2];
        

    }

    public String getNombres()
    {
        return nombres;
    }

    public String getTipos()
    {
        return tipos;
    }

    public void agregarIngredientes(Platos platos)
    {
         this.platos[this.contador] = platos;
         this.contador++;

    }

    public Platos[] mostrarIngredientes()
    {
        return this.platos;
    }
    
}
