%%
Programa de prueba 9 para el analizador semantico 
Creado por: Aaron y Pablo
Se prueba un valor constante para detectar warnings
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