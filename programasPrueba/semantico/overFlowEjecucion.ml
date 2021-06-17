%%
Programa de prueba overFlowEjecucion.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se intenta acceder a indices superiores al tamaño del vector en tiempo de ejecución. 
Se da un error semántico debido a que el índice no está en el rango del vector.
%%

programa overFlowEjec;

	entero tablaDelDos[5],i;

	principio
		i := 0;
		mq (i < 7)
			tablaDelDos[i] := 2*i;
			i := i + 1;
		fmq
	fin