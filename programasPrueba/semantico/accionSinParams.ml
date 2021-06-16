%%
Programa de prueba 2 para el analizador semantico 
Creado por: Aaron y Pablo
En la accion se llama a parametros que no se han pasado por valor o referencia,
por lo que no son accesibles para esa accion
%%

programa restar;
	entero sumando1, sumando2;
	
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

	principio

		 escribir("Escribe el primer numero ");
		 leer(sumando1);
		 escribir("Escribe el segundo numero ");
		 leer(sumando2);
		 esPositiva;
	fin
	