%%
Programa de prueba warning1.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se evalúa una expresión constante en un bucle mq, lo que da lugar a un bucle infinito.
Se muestra un aviso de evaluación de expresión constante.
%%
programa sameName;
	entero arg1,arg2,i;
	principio
		i := 0;
		arg2 := 2;
		mq (2 < 4)
			arg1 := arg2;
			%i := i + 1;
		fmq
	fin