package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.modeloTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class modeloDao extends AppCrud {
    LeerArchivo leerA;
    LeerTeclado leerT=new LeerTeclado();
    UtilsX util=new UtilsX();
    modeloTO cTo;
    final static String TABLA_MODELO="modelo.txt";

    public void crearmodelo() {
      cTo=new modeloTO();
      leerA=new LeerArchivo(TABLA_MODELO);
      String idC=generarId(leerA, 0, "C", 1);
      cTo.setIdCate(idC);
      cTo.setNombre(leerT.leer("", "Ingrese nombre modelo"));
      leerA=new LeerArchivo(TABLA_MODELO);
      agregarContenido(leerA, cTo);
    }