# Ejercicios de evaluación
Los siguientes programas forman parte de una evalución de la materia de POO. Cada ejercicio solicitado se encuentra en un paquete diferente.
## Ejercicio 1

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

