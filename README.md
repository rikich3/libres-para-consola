# libres-para-consola

Clases de Java para aplicaciones de consola que tienen la funcion de forzar un input compatible con el tipo de dato
que se requiere y en los límites que coloca el programador.

documentacion:
-------------------------------------------------------------
Checker (super class)
------------------------
proporciona miembros comunes entre los checkers de diferente tipo, así como un metodo abstracto
y otro heredado.
abstract methods: protected boolean check()

iChecker
---------
Clase que necesita ser instanciada para ser usada, el único método público(aparte del constructor) que tiene 
es el get() el cual esta overloaded de las siguientes 4 formas:

int get(int l1, int l2, String prompt, String missD) 
----------------
"Pide al usuario (a travez del prompt) que introduzca un entero entre el l1 y l2 [cerrado] hasta que tenga un valor válido"
"Si es que se sale de los limites imprimira "missD""

int get(int l1, int l2, String prompt)
----------------
"Similar, como no esta definido un msj para "missD" se usará el default"

int get(int lim, String prompt, String missD)  &  int get(int lim, String prompt)
----------------
"Estos métodos solo tienen un límite, por lo que se sobreentiende que el otro límite es 0"

dChecker (class)
-----------------------------------------------
double get() :similar al iChecker, pero los parámetros para los límites deben ser de tipo double

sChecker (class)
------------------------------------------------
String get(): similar al ichecker en cuanto los limites se refieren a la cantidad de caracteres que se le pide al string
Sin embargo sChecker tiene un metodo get que devuelve un int:

int get(String[] lista, String prompt)
-----------------
"Pide al usuario por el prompt que ingrese un string, si el input es IGUAL a un elemento de la lista, entonces
devolverá el indice de aquel elemento en el arreglo (los indices empiezan en 0)"

El constructor xChecker(String warning)
-----------------
al crear el objeto en memoria, el constructor debe recibir como argumento un string, este aparece en caso de que el usuario no
coloque un argumento valido para el tipo de variable que se necesita






