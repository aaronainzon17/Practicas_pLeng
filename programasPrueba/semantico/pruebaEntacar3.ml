%%
Programa de prueba pruebaEntacar3.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se produce un error en complicaion al haber desbordamiento de enteros
%%
programa entacar3;
	entero sum,max;
	caracter a,b;
	principio
		a := entacar(32768);
		b := entacar(327);
		escribir("El caracter es: ", a);
	fin