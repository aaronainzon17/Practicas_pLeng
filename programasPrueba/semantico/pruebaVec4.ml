%%
Programa de prueba pruebaVec4.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se prueba el paso por referencia de vectores 
%%

programa pruebaVec4;

	entero v1[5],mult,i;
% La accion devuelve el vector multiplciado por el valor que se pasa
% en el atributo por
accion multiplicar(ref entero v1[5]; val entero por);
	entero i;
	principio
		i := 0;
		mq (i < 5)
			v1[i] := v1[i]*por;
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
		mult := 2;
		multiplicar(v1,mult);
		escribir("La multiplicacion de v1 por ", mult, " es: ", v1);
	fin