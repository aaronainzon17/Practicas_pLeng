%%
Programa de prueba 2 para el analizador sintactico 
Creado por: Aaron y Pablo
Se produce un error sintactico en el if de la linea 19 ya que falta ent 
tras la condicion. Tambien estan invertidas las sentecnias de fmq y fin.

%%

programa contar;

	caracter palabra, word;
	booleano headivinado;
	entero i, j;
	
%-----------------------------------------------------------
accion es_palabra;

principio
	si (palabra = "casa")
		escribir("La palabra es casa");
	si_no	
		escribir("No es casa");
	fsi
fin

%-------------------------------------------------------------------
	principio
	
		 escribir("Que palabra quieres que adivine? ");
		 leer(word);
		 mq (word <> "casa")
			escribir("La palabra no es casa");
			i := 32;
			
	fin
	fmq