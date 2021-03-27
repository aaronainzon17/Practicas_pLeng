%%
    Prueba 2 
    Creada por: Aaron Ibañez y Pablo Garcia
    Genera un error lexico al intentar crear la variable 
    3var ya que el nombre de las mismas no puede comenzar por un numero.
    Se puede ver como reconoce el 3 como valor entero y la palabra var como la 
    palbra reservada para pasar parametros por valor, error que se solucionara en el
    analizador sintactico.
%%

PROGRAMA PRUEBA2;

entero var1, var2;

ACCION hacer_cuenta();
    PRINCIPIO
        3var := var1 + var2;
    FIN

PRINCIPIO
    escribir("El valor de la suma es: ", 3var);
FIN
