%%
Programa de prueba varNoInit.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se produce un error en tiempo de ejecución al comparar con una variable que no 
ha sido inicializada anteriormente.
%%
programa noInitialized;
	entero sum,max;
	principio
		sum := 0;
		mq (sum < max)
			sum := max + 1;
		fmq
	fin