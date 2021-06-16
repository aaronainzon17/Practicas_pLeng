%%
Programa de prueba pruebaVec3.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se comprueba que la asignacion entre vectores del mismo tamanio es correcta
%%

programa comprobar_palabras;

	entero v1[5],res,i;

accion sumarVec(val entero v1[5]; ref entero suma);
	entero i;
	principio
		i := 0;
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
		sumarVec(v1,res);
		escribir("La suma del vector es: ", res);
	fin