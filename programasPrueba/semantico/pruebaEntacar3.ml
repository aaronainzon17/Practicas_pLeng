%%
Programa de prueba pruebaEntacar3.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se produce un error sintactico en complicaion al haber desbordamiento de enteros 
y otro debido a que el numero que se pasa como paramtro es superior a 255 por lo que no representa 
ningun caracter de la tamba ASCII
%%
programa entacar3;
	entero sum,max;
	caracter a,b;
	principio
		a := entacar(32768);
		b := entacar(327);
		escribir("El caracter es: ", a);
	fin