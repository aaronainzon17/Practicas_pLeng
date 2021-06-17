%%
Programa de prueba overFlow.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se produce un error de overflow al intentar acceder a la 
posicion 5 del vector vec en tiempo de compilacion
%%
programa overflow;
	entero vec[3],comp;
	
	principio
		comp := vec[5];
		si (comp = 5) ent
			escribir("El modulo de 5 es: ", comp);
		fsi
	fin