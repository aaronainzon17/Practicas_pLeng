programa prueba_acciones;

entero n, r;

%-----------------------------------------------------------
accion cambiar_de_linea ;
%-----------------------------------------------------------
entero correcto;
Principio
  escribir (entacar (13), entacar (10));
Fin

%-----------------------------------------------------------
accion dato (ref entero dato);
%-----------------------------------------------------------
booleano correcto;

  %-----------------------------------------------------------
  accion pedir_dato ;
  %-----------------------------------------------------------
  Principio
     escribir ("Escribe un numero: ");
     leer (dato);
  Fin
    
Principio
  dato := 0;
  correcto := FALSE;
  Mq not correcto
     pedir_dato ;
     correcto := dato > 0;
     Si not correcto ent
        escribir ("El numero debe ser postivo.");
	cambiar_de_linea;
     FSi
  FMq
Fin

%-----------------------------------------------------------
accion fib (Val entero n; ref entero r);
%-----------------------------------------------------------
entero r1, r2;

Principio
  Si n > 1 ent
     fib (n - 1, r1);
     fib (n - 2, r2);
     r := r1 + r2;
  Si_no
     r := n;
  Fsi
Fin

%-----------------------------------------------------------
Principio
  dato (n);
  fib (n, r);
  escribir ("Fibbonaci(", n,") es: ", r);
  cambiar_de_linea;
Fin
