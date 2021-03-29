%%
    Prueba 5
    Creada por: Aaron Ibañez y Pablo Garcia
%%


PROGRAMA Prueba5;

caracter malo, bueno;

PRINCIPIO
    malo := "Se ha portado mal";
    bueno := "Se ha portado bien";
    escribir("Como te has portado ?");
    leer(caracter_de_hoy);
    si (caracter_de_hoy = malo) ent
        escribir("Tienes que mejorar");
    si_no   
    %Se ha introducido el caracter ~ no reconocido por el lenguaje
        escribir("Te has portado muy bien :~)");
    fsi
FIN