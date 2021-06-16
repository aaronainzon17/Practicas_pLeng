%%
Programa de prueba pruebaVec2.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se comprueba que la asignacion entre vectores del mismo tamanio es correcta
%%

programa pruebaVec2;

	entero v1[5],v2[5],i;

	%-----------------------------------------------------------
	accion cambiar_de_linea ;
	%-----------------------------------------------------------
	Principio
	  escribir (entacar (13), entacar (10));
	Fin

	principio
		i := 0;
		mq (i < 5)
			v1[i] := i;
			v2[i] := 2*i;
			i := i + 1;
		fmq
		escribir("El vector v1 vale: ", v1);
		cambiar_de_linea;
		escribir("El vector v2 vale: ", v2);
		cambiar_de_linea;
		escribir("Se asigna v1 a v2");
		cambiar_de_linea;
		v2 := v1;
		escribir("El nuevo valor de v2 es: ", v2);
		
	fin