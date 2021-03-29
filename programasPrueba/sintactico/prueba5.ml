%%
Programa de prueba 5 para el analizador sintactico 
Creado por: Aaron y Pablo
%%

programa hacerLaCasa;


 caracter nombre;
 booleano hecha;
 entero piezas,nLadrillos;
%-------------------------------------------------------------------
accion ponerLadrillo(val entero nLadrillos, ref booleano puestos);
principio
	i:= 0;
	mq (i < nLadrillos)
		escribir("He puesto el ladrillo numero ", i);
	fmq
	puestos := true;
fin
%-------------------------------------------------------------------
principio
	entero i;
	escribir("Cuantos ladrillos"quieres poner);
	leer(ladrillos);
	ponerLadrillo(ladrillos,hecha);
	si_no (hecha = true)
		escribir("Se ha derrumbado");
	fsi
fin