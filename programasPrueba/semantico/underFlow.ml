%%
Programa de prueba underFlow.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se produce un error de underflow al intentar acceder a la 
posicion -2 del vector vec en tiempo de compilacion
%%
programa underflow;
	entero vec[3],comp;
	
	principio
		comp := vec[-2];
		si (comp = 2) ent
			escribir("El modulo de -2 es: ", comp);
		fsi
	fin