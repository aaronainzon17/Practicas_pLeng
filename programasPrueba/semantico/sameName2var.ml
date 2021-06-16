 %%
Programa de prueba 7 para el analizador semantico 
Creado por: Aaron y Pablo
Se prueba a asignar el mismo nombre a dos variables del mismo nivel
%%
programa sameName;
	entero arg1,arg2;
	caracter arg2,arg3;
	principio
		arg1 := 3;
		arg2 := "a";
		mq (arg1 <> arg2)
			escribir("Introduce un numero: ");
			leer(arg2);
		fmq
	fin