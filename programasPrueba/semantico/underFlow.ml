%%
Programa de prueba 3 para el analizador semantico 
Creado por: Aaron y Pablo
Se produce un error de underflow al intentar acceder a la 
posicion -2 del vector vec en tiempo de compilacion
%%
programa underflow;
	entero vec[3];
	
	principio
		si (vec[-2] = 2) ent
			escribir("El modulo de -2 es: ", vec[-2]);
		fsi
	fin