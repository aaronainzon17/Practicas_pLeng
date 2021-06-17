%%
Programa de prueba pruebaEntacar.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se comprueba el correcto funcionamiento de la función entacar.
%%
programa entacar1;
	entero sum,max;
	caracter a,b;
	
	%-----------------------------------------------------------
	accion cambiar_de_linea;
	%-----------------------------------------------------------
	Principio
	  escribir (entacar (13), entacar (10));
	Fin
	
	principio
		sum := 30;
		max := 5;
		sum := sum + max;
		escribir("La suma es de: ", sum);
		cambiar_de_linea;
		a := entacar(sum);
		escribir("El caracter es: ", a);
	fin