%%
Programa de prueba 4 para el analizador semantico 
Creado por: Aaron y Pablo
Se da un error de overflow en tiempo de ejecucion al intentar acceder a 
la posicion 6 y 7 del vector tablaDelDos
%%

programa comprobar_palabras;

	entero tablaDelDos[5],i;

	principio
		i := 0;
		mq (i < 7)
			tablaDelDos[i] := 2*i;
			i := i + 1;
		fmq
	fin