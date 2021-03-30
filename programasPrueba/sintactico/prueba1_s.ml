%%
Programa de prueba 1 para el analizador sintactico 
Creado por: Aaron y Pablo
Se produce un error sintactico tras declarar la variable 
entero c, ya que despues se declara d sin especificar ningun tipo
%%

PROGRAMA contarLetras;


 caracter respuesta, letra;
 entero n, c; d;
 booleano a;
%-------------------------------------------------------------------
principio
%-------------------------------------------------------------------
 escribir("Que palabra quieres que cuente ? ", 
          entacar(13),entacar(10));
 leer(palabra);
 escribir("La palabra tiene", n , "letras")
fin