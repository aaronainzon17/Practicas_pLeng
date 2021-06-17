%%
Programa de prueba 3 para el analizador sintactico 
Creado por: Aaron y Pablo
Se produce un error sintactico ya que falla un ent en la
sentencia si
%%
programa prueba3_s;
	entero numero1,numero2;
	booleano estaBien;
	
	principio;
		estaBien:=false;
		
		si (numero1 = numero2)
			estaBien := true;
		fsi
		
		si (estaBien = true) ent
			escribir("Son iguales");
		fsi
	fin