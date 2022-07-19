package pe.edu.upeu.ventas;

public class MenuOpciones {
    public void menuprincipal() {
        Sring msgOpciones="1=crear modelo\n2listar modelo\n"
        +"3=Editar modelo\n4=eliminar modelo ";

        int opcion=0;
        do {
            switch (opciones) {
                case 1: new modeloDao().crearmodelo();  break;
                case 2: new modeloDao().listarmodelo();  break;
                case 3: new modeloDao().modificarmodelo();  break;
                case 4: new modeloDao().eliminarmodelo();  break;
                default:break;
            }
            opcion=LeerT.leer(valor:0,msgOpciones);
        }while (opcion1=0);   
    }
    
}