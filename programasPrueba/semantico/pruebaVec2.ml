%%
Programa de prueba pruebaVec2.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se comprueba que la asignacion entre vectores del mismo tamanio es correcta
%%

programa pruebaVec2;

	entero v1[5], v2[5], i;


	principio
		i := 0;
		mq (i < 5)
			v1[i] := i;
			i := i + 1;
		fmq
		escribir("El vector v1 vale: ", v1);
		i := 0;
		mq (i < 5)
			v2[i] := 2*i;
			i := i + 1;
		fmq
		escribir("El vector v2 vale: ", v2);
		escribir("Se asigna v2 a v1");
		v2 := v1;
		escribir("El nuevo valor de v1 es: ", v1);
		
	fin