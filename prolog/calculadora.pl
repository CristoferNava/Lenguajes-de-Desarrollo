:-dynamic valor/1.

valor(3).

sumar(X):-
    valor(Y),
    Res is X + Y,
    write('Resultado: '),
    write(Res),
    retract(valor(Y)),
    asserta(valor(Res)),
    nl.

restar(X):-
    valor(Y),
    Res is Y - X,
    write('Resultado: '),  
    write(Res), 
    retract(valor(Y)),
    asserta(valor(Res)), 
    nl.

multiplicar(X):-
    valor(Y),
    Res is X * Y, 
    write('Resultado: '),
    write(Res),
    retract(valor(Y)),
    asserta(valor(Res)),
    nl.