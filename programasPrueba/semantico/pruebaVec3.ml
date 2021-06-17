%%
Programa de prueba pruebaVec3.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se prueba que el paso por valor de vectores funciona correctamente.
%%

programa pruebaVec3;

	entero v1[5],res,i;

accion cambiar_de_linea;

	Principio
	  escribir (entacar (13), entacar (10));
	Fin
	
accion sumarVec(val entero v1[5]; ref entero suma);
	entero i;
	principio
		i := 0;
		suma := 0;
		mq (i < 5)
			suma := suma + v1[i];
			i := i + 1;
		fmq
	fin
	principio
		i := 0;
		mq (i < 5)
			v1[i] := i;
			i := i + 1;
		fmq
		escribir("El vector v1 vale: ", v1);
		cambiar_de_linea;
		sumarVec(v1,res);
		escribir("La suma del vector es: ", res);
	fin