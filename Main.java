public class Main 
{
    public static void main(String args[])
    {
        System.out.println("**********NOMBRE DEL RESTAURANTE********");

        Restaurante restaurante = new Restaurante("**EL BUEN PALADAR***");
        System.out.println(restaurante.getNombre());

        System.out.println("**********DATOS DE LOS EMPLEADOS********");

        Empleado empleado = new Empleado("Jose Nieto",456213);
        Empleado empleado02 = new Empleado("Carlos Mendosa",587913);
        Empleado empleado03 = new Empleado("Mayli Espinoza",5462313);

        System.out.println("NOMBRE DEL EMPLEADO: "+empleado.getNombre()+" DNI DEL EMPLEADO: "+empleado.getDni());
        System.out.println("NOMBRE DEL EMPLEADO: "+empleado02.getNombre()+" DNI DEL EMPLEADO: "+empleado02.getDni());
        System.out.println("NOMBRE DEL EMPLEADO: "+empleado03.getNombre()+"  DNI DEL EMPLEADO: "+empleado03.getDni());


        System.out.println("**********ORDEN DEL CLIENTE********");

        Clientes clientes = new Clientes("CLIENTE 02 ", 2);
        Clientes clientes2 = new Clientes("CLIENTE 05 ", 8);
        Clientes clientes3 = new Clientes("CLIENTE 07 ", 10);

        System.out.println("NOMBRE DEL CLIENTE: "+clientes.getNombre()+" NUMERO DE MESA: "+clientes.getNumeroDeMesa());
        clientes.agregarClientes(new Empleado("JOSE NIETO", 456213));
        System.out.println("NOMBRE DEL CLIENTE: "+clientes2.getNombre()+" NUMERO DE MESA: "+clientes2.getNumeroDeMesa());
        clientes.agregarClientes(new Empleado("CARLOS MENDOSA", 587913));
        System.out.println("NOMBRE DEL CLIENTE: "+clientes3.getNombre()+"  NUMERO DE MESA: "+clientes3.getNumeroDeMesa());
        clientes.agregarClientes(new Empleado("MAYLI ESPINOZA", 5462313));
        
        /*clientes.agregarClientes(new Empleado("JOSE NIETO", 456213));
        clientes.agregarClientes(new Empleado("CARLOS MENDOSA", 587913));
        clientes.agregarClientes(new Empleado("MAYLI ESPINOZA", 5462313));*/

        for(Empleado e: clientes.listarClientes())
        {
            System.out.println("EMPLEADO: "+e.getNombre()+e.getDni());
            
        }

        System.out.println("**********ORDEN DEL MENU********");

        Menu menu = new Menu("CHIFA ", "NORTEÑO");

        System.out.println("clase de menu: "+menu.getClase());
        System.out.println("clase de menu: "+menu.getTipo());

        menu.agregarMenu(new Clientes("CLIENTE 02", 2));
        System.out.println("NOMBRE DEL CLIENTE: "+menu.mostrarClientes().getNombre());
        System.out.println("NUMERO DE MESA: "+menu.mostrarClientes().getNumeroDeMesa());

        System.out.println("**********ORDEN DE PLATOS********");

        Platos platos = new Platos("Arroz Chaufa");
        Platos platos1 = new Platos("Aeropuerto");

        System.out.println(platos.getNombres());
        System.out.println(platos1.getNombres());
        platos.agregarPlatos(new Menu("CHIFA", "NORTEÑO"));
        platos.agregarPlatos(new Menu("CHIFA", "NORTEÑO"));
        
        for(Menu m: platos.mostrarMenu())
        {
            System.out.println("MENU : "+m.getClase()+m.getTipo());

        }

        System.out.println("**********INGREDIENTES PUESTOS********");

        Ingredientes ingredientes = new Ingredientes("CEBOLLA CHINA", "GUSTO");
        Ingredientes ingredientes1 = new Ingredientes("ACEITE DE AJONJOLI", "SABOR");

        System.out.println(ingredientes.getNombres()+ingredientes.getTipos());
        System.out.println(ingredientes1.getNombres()+ingredientes1.getTipos());
        ingredientes.agregarIngredientes(new Platos("Arroz Chaufa"));
        ingredientes.agregarIngredientes(new Platos("Aeropuerto"));












        













    }
    
}
