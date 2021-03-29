%%
Programa de prueba 4 para el analizador sintactico 
Creado por: Aaron y Pablo
%%

programa comprobar_palabras;

cadena frase;
caracter char1, char2;
%-------------------------------------------------------------------
accion es_palabra(ref palabra1; var);

principio
	si (palabra1 = "casa") ent
		escribir("La palabra es casa");
	si_no	
		escribir("No es casa");
	fsi
fin
%-------------------------------------------------------------------
principio

	mq (char1 <> palabra1)
		escribir("Escribe una palabra");
		leer(char2);
		es_palabra(char1);
		si (char2 = char1) ent
		 escribir("Bien has acertado");
		si_no
	fmq
fin