%-------------------------------------------------------------------
programa adivinar;
%-------------------------------------------------------------------

 caracter respuesta, letra, min, max;
 booleano headivinado;
 caracter c, d;

accion matar(val entero e,ref caracter c);
principio
matar(caraent(c),c);
escribir("Hola");
fin
%-------------------------------------------------------------------
principio
%-------------------------------------------------------------------
 escribir("Piensa en una letra e intentare adivinarla.", 
          c,entacar(10));
si_no 
	escribir("jajajaj");
fsi
 matar(1,c);
fin