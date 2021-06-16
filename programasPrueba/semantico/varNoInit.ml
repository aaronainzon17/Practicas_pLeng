%%
Programa de prueba 7 para el analizador semantico 
Creado por: Aaron y Pablo
Se produce un error al comparar con una variable no incializada
%%
programa noInitialized;
	entero sum,max;
	principio
		sum := 0;
		mq (sum < max)
			sum := max + 1;
		fmq
	fin