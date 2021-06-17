%%
Programa de prueba sameNameVarAcc.ml para el analizador semantico 
Creado por: Aaron y Pablo
Se produce un error semantico debido a que el nombre de la accion es 
el mismo que el de la variable pieza
%%

programa construir;

 caracter pieza;
 entero nPiezas;

accion pieza(val caracter newPieza; ref entero nPiezas);
principio
	si (newPieza = "v") ent
		nPiezas := nPiezas + 1;
	fsi
fin

principio
	escribir("Se anyade 1 peiza al puzle");
	pieza := "v";
	nPiezas := 0;
	pieza(pieza,nPiezas);
	escribir("Hay: ", nPiezas, " piezas en el puzle");
fin