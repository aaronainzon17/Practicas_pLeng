%%
    Prueba 4
    Creada por: Aaron Ibañez y Pablo Garcia
%%

PROGRAMA Prueba4;

booleano bool1, bool2;
entero int1, int2;

PRINCIPIO
    escribir("Introduzca el valor de int1: ");
    leer(int1);
    si (int1 < 12) ent
        escribir("El valor de int1 es menor de 12:");
    si_no   
		%Se produce un error lexico debido a que la ñ no esta en el lenguaje
        escribir("Reseñar que el valor es mayor que 12");
    fsi
FIN