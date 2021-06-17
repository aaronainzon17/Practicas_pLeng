%%
Programa de prueba pruebaOverflowInt.ml para el analizador semantico 
Creado por: Aaron y Pablo

%%

programa pruebaOverflowInt;
	entero sum,max,i,j;

	principio
		sum := 30000;
		max := 10000;
		sum := 30000 + 10000;
		i := 32768;
		j := 32768;
	fin