# Ejercicios de evaluación
Los siguientes programas forman parte de una evalución de la materia de POO. Cada ejercicio solicitado se encuentra en un paquete diferente.

### Índice
+ [Ejercicio 1](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#ejercicio-1-es-primo): ¿Es primo?
+ [Ejercicio 2](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#ejercicio-2-saludos): ¡Saludos!
+ [Ejercicio 3](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#ejercicio-3-circuferencias): Circuferencias

## [Ejercicio 1](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/tree/main/src/Ejercicio1): ¿Es primo?

### Problema

Escriba una aplicación que lea un número y verifique que se es un número primo o no. La salida será por consola

### Solución

Los números primos son número natural **mayor que 1** que tiene únicamente **dos divisores positivos distintos**: él mismo y el 1.​​ 

Creamos dos clases: una que almacena la función principal, dónde unicamente pedirá los datos e imprimirá el resultado.

La otra nos servirá para verificar si el número **es primo** o no. Para esto creamos una clase y un `if (Num>0){}` para verificar si se introdujo un número positivo.

De ser así, un bucle `for` evaluará si la variable `Num` (donde guardamos la entrada de usuario) es divisible entre `x` que incrementa de 0 a `< Num`, en caso de ser así, se retorna un string que indica que es primo:
` return " es primo";`

Si el bucle `if (Num>0){}` no se cumple, se retorna `return " no es un número natural positivo";` 

Si no entra a ninguno de estas setencias, se retorna ` return " no es primo";`, ya que comprobamos que el número sí es positivo natural y que no es divisible por nungún otro número que no sea el mismo y 1.

## [Ejercicio 2](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/tree/main/src/Ejercicio2): ¡Saludos!

### Problema

Escriba una aplicación que lea su nombre y aparezca en la pantalla la frase: **Buenos días** `nombre_introducido`. La salida por **consola**

### Solución

La solución es bastante sencilla, importamos la clase scanner de `java.util.Scanner`, mostramos una instrucción por consola con la instrucción `System.out.print();` para que ingrese su nombre. Este nombre será guardado en una variable `String name` y al final se imprimirá en pantalla el saludo concatenando el nombre: `System.out.println("Buenos días "+name+" :)");`.

## [Ejercicio 3](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/tree/main/src/Ejercicio3): Circuferencias

### Problema

Escriba una aplicación que lea por teclado el valor del radio de una circunferencia y muestre por pantalla la longitud y el área de la circunferencia. La salida será por consola. Longitud de la circunferencia = 2*PI*Radio, Área de la circunferencia = PI * Radio^2.

### Solución

La solución incluye la importación de 3 métodos: `Scanner`, `DecimalFormat`, `Math`.

He creado dos clases: la clase **Principal3**, donde se piden a medidad del radio y se imprime el resultado usando `FormatDecimal` para colocar los puntos decimales y comas. Y **LongArea** para calcular el área y longitud de la circinferencia, con el método `Math` para realizar las potencias (que bien se pudo hacer desde la clase con unos ciclos for, pero traté de usar la menor cantidad de líneas posibles).

