man(abraham).
man(clancy).
man(homero).
man(bart).
woman(mona).
woman(jackie).
woman(marge).
woman(lisa).
woman(maggie).
dog(huesos).
cat(bola_de_nieve).

es_hijo(bart, homero).
es_hijo(lisa, homero).
es_hijo(maggie, homero).
es_hijo(bart, marge).
es_hijo(lisa, marge).
es_hijo(maggie, marge).
es_hijo(homero, abraham).
es_hijo(homero, mona).
es_hijo(marge, jackie).
es_hijo(marge, clancy).

estacasado(abraham, mona).
estacasado(mona, abraham).
estacasado(jackie, clancy).
estacasado(clancy, jackie).
estacasado(homero, marge).
estacasado(marge, homero).

eshermano(bart, lisa).
eshermano(bart, maggie).
eshermano(lisa, bart).
eshermano(lisa, maggie).
eshermano(maggie, bart).
eshermano(maggie, lisa).

es_nieto(X, Z):-
	es_hijo(X, Y),
	es_hijo(Y, Z).

es_suegro(X, Z):-
    estacasado(Z, Y),
    es_hijo(Y, X).