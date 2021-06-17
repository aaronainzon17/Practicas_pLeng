%%
Programa de prueba accionSinParams.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se comprueba el correcto funcionamiento de las funciones leer y escribir.
%%

programa restar;
	entero sumando1, sumando2, varNoUsada;
	
	accion esPositiva();
			entero res;
	principio

		res := sumando1 - sumando2;
		si (res > 0) ent
			escribir("El resultado es positivo");
		si_no	
			escribir("El resultado no es positivo");
		fsi
	fin
	
	accion esPositiva1();
	principio
		escribir("a");
	fin

	principio

		 escribir("Escribe el primer numero ");
		 leer(sumando1);
		 escribir("Escribe el segundo numero ");
		 leer(sumando2);
		 esPositiva;
	fin
	