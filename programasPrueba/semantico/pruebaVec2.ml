%%
Programa de prueba pruebaVec1.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se comprueba que se produce un error al asignar dos vectores de distinto tamanio
%%

programa comprobar_palabras;

	entero v1[5],v2[5];

	principio
		i := 0;
		mq (i < 5)
			v1 := i;
			i := i + 1;
		fmq
		escribir("El vector v1 vale: ", v1);
		i := 0;
		mq (i < 5)
			v1 := 2*i;
			i := i + 1;
		fmq
		escribir("El vector v2 vale: ", v2);
		escribir("Se asigna v2 a v1");
		v2 := v1;
		escribir("El nuevo valor de v1 es: ", v1);
		
	fin