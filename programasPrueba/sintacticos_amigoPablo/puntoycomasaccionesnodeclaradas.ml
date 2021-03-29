%-------------------------------------------------------------------
programa adivinar;
%-------------------------------------------------------------------

 caracter respuesta, letra, min, max;
 booleano headivinado;
 caracter c, d;

%-------------------------------------------------------------------
principio
%-------------------------------------------------------------------
 escribir("Piensa en una letra e intentare adivinarla.", 
          entacar(13),entacar(10));
 escribir(siluros)
 siono := 2
 min := "A";
 max := "Z";
 headivinado := false;
 mq (min <> max) and not headivinado
   letra := entacar((caraent(min) + caraent(max)) div 2);
   escribir("(", min, ",", max, ")",": has pensado en la letra ", letra, "?");
   siono;
   si (respuesta = "N") ent
     escribir("La letra que has pensado es mayor?");
     siono;
     si respuesta = "S" ent
      min := entacar(caraent(letra) + 1);
     si_no
      max := entacar(caraent(letra) - 1)
    fsi
   si_no
    headivinado := true
   fsi
 
 si not headivinado ent
  escribir("La letra es la ", min, entacar(13), entacar (10));
 fsi
fin
