%%
Programa de prueba pruebaOverflowInt.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se producen varios errores semánticos al tratar de asignar valores fuera de rango a variables de tipo entero. 
Además, se produce un error semántico de desbordamiento en la operación de suma.
%%

programa pruebaOverflowInt;
	entero sum,max,i,j;

	principio
		sum := 30000 + 10000;
		i := 32768;
		j := 32768;
	fin