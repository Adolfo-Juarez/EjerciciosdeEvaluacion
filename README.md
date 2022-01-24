# Ejercicios de evaluación
Los siguientes programas forman parte de una evalución de la materia de POO. Cada ejercicio solicitado se encuentra en un paquete diferente.

Ir a: [[Índice]](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#%C3%ADndice)[[Versiones]](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#versiones)

### Índice
+ [Ejercicio 1](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#ejercicio-1-es-primo): ¿Es primo? | Consola
+ [Ejercicio 2](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#ejercicio-2-saludos): ¡Saludos! | Consola
+ [Ejercicio 3](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#ejercicio-3-circunferencias): Circuferencias | Consola
+ [Ejercicio 4](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#ejercicio-4-de-kilometros-a-metros): De Kilometros a Metros | Consola
+ [Ejercicio 5](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#ejercicio-5-pir%C3%A1mides-de-n%C3%BAmeros): Pirámides de Números | Consola
+ [Ejercicio 6](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#ejercicio-6-descubre-hipotenusa): Descubre Hipotenusa | Cuadros de Diálogo
+ [Ejercicio 7](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#ejercicio-7-calcula-tri%C3%A1ngulos): Calcula Triángulos | Cuadros de Diálogo
+ [Ejercicio 8](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#ejercicio-8-de-a-tres): De a Tres | Cuadros de Diálogo
+ [Ejercicio 9](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#ejercicio-9-n%C3%BAmero-de-la-suerte): Número de la Suerte| Cuadros de Diálogo
+ [Ejercicio 10](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion#ejercicio-10-verificador-de-hora): Verificador de Hora | Cuadros de Diálogo

## Versiones

### [1.0.0](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/commit/30cfa9bf70d700e759c0f44d8b428c510a71366a)

+ Se incluyen los todos los ejercicios
+ Siete de los ejercicios presentan en dos clases
+ Del ejercicio seis al diez se muestran en cuadros de diálogos

## [Ejercicio 1](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/tree/main/src/Ejercicio1): ¿Es primo?

### Problema

Escriba una aplicación que lea un número y verifique que se es un número primo o no. La salida será por consola.

### Solución

Los números primos son números naturales **mayor que 1** que tiene únicamente **dos divisores positivos distintos**: él mismo y el 1.​​ 

Creamos dos clases: una que almacena la función principal, dónde unicamente pedirá los datos e imprimirá el resultado.

La otra nos servirá para verificar si el número **es primo** o no. Para esto creamos una clase y un `if (Num>0){}` para verificar si se introdujo un número positivo.

De ser así, un bucle `for` evaluará si la variable `Num` (donde guardamos la entrada de usuario) es divisible entre `x` que incrementa de 0 a `< Num`, en caso de ser así, se retorna un string que indica que es primo:
` return " es primo";`

Si el bucle `if (Num>0){}` no se cumple, se retorna `return " no es un número natural positivo";` 

Si no entra a ninguno de estas setencias, se retorna ` return " no es primo";`, ya que comprobamos que el número sí es positivo natural y que no es divisible por nungún otro número que no sea el mismo y 1.

## [Ejercicio 2](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/tree/main/src/Ejercicio2): ¡Saludos!

### Problema

Escriba una aplicación que lea su nombre y aparezca en la pantalla la frase: **Buenos días** `nombre_introducido`. La salida por **consola**.

### Solución

La solución es bastante sencilla, importamos la clase scanner de `java.util.Scanner`, mostramos una instrucción por consola con la instrucción `System.out.print();` para que ingrese su nombre. Este nombre será guardado en una variable `String name` y al final se imprimirá en pantalla el saludo concatenando el nombre: `System.out.println("Buenos días "+name+" :)");`.

## [Ejercicio 3](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/tree/main/src/Ejercicio3): Circunferencias

### Problema

Escriba una aplicación que lea por teclado el valor del radio de una circunferencia y muestre por pantalla la longitud y el área de la circunferencia. La salida será por consola. Longitud de la circunferencia = 2*PI*Radio, Área de la circunferencia = PI * Radio^2.

### Solución

La solución incluye la importación de 3 métodos: `Scanner`, `DecimalFormat`, `Math`.

He creado dos clases: la clase **Principal3**, donde se piden a medidad del radio y se imprime el resultado usando `FormatDecimal` para colocar los puntos decimales y comas. Y **LongArea** para calcular el área y longitud de la circinferencia, con el método `Math` para realizar las potencias (que bien se pudo hacer desde la clase con unos ciclos for, pero traté de usar la menor cantidad de líneas posibles).

## [Ejercicio 4](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/tree/main/src/Ejercicio4): De Kilometros a Metros

### Problema

Escriba una aplicación que convierta una velocidad de Km/h a m/s. La velocidad se lee por teclado y la salida será por consola.

### Solución

Creamos 2 clases (aunque realmente no eran necesarias para este caso, pero si en un futuro queremos realizar otra conversiones serán útiles). En la clase principal solicitamos los datos a convertir y el la clase `Conversor` creamos un método `ms` que divide a la variable `kmh` (la entrada del usuario) entre 3.6 e imprime la cantidad en terminal.

## [Ejercicio 5](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/tree/main/src/Ejercicio5): Pirámides de Números

### Problema

Escriba un problema que lea un número entero de **5 cifras** y muestra sus cifras igual que en el ejemplo.
Para un número `N`=12345. La salida por consola debe ser:
> 1
> 
> 12
> 
> 123
> 
> 1234
> 
> 12345
> 

### Solución

Para este problema, le pedimos al usuario que ingrese una cifra que será tratada como `int`, y lo pasaremos al método `largo` de la clase local `Piramide` que convierte la variable a `String` con el método `Integer.toString(int Num)`y verifica que tenga 5 dígitos de largo con la función `numCadena.lenght();`.

Si cumple con lo solicitado, regresa `true` y pasa la variable `int` que ingreso el usuario al método `construir` el cual transforma la variable de `int` a `String` y contiene dos ciclos `for` que concatena cada carácter del `String`.

## [Ejercicio 6](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/tree/main/src/Ejercicio6): Descubre Hipotenusa

### Problema

Escriba una aplicación que lea la longitud de los catetos de un triángulo rectángulo y **calcule la hipotenusa** según el teorema de Pitágoras. La entrada y salida será por medio de **cuadros de diálogos**.

### Solución

Importamos las clases `javax.swing.JOptionPane` para poder mostrar los cuadros de dialogos.
Creamos dos clases, en una estaba el método principal y en `Hipotenusa` se encuentra los cuadros de dialogos que permite introducir datos para pasarlos a `double` con el método `Double.parseDouble(String Num);` y realizar el cálculo de la hipotenusa con el método `Math`: `Math.sqrt(Math.pow(ca, 2)+Math.pow(co, 2))`

## [Ejercicio 7](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/tree/main/src/Ejercicio7): Calcula Triángulos

### Problema

Escriba una aplicación que calcule el área de un triángulo en función de las longitudes de sus lados (a, b, c), según la siguiente fórmula: 
**Área**=**RaízCuadrada(p*(p-a)*(p-b)*(p-c))**

Donde **p**=**(a+b+c)/2**

La entrada y salida será por medio de Cuadros de Diálogo.

### Solución

Se muestra cuadro de texto solicitando cada requisito y en una segunda clase se realiza las operaciones indicadas y se muestra un siguiente cuadro de dialogo que muestra la solución.

## [Ejercicio 8](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/tree/main/src/Ejercicio8): De a Tres

### Problema

Escriba una aplicación que lea un número entero de 3 cifras y muestre por separado las cifras del número. La entrada y salida será por medio de Cuadros de Diálogo.

### Solución

Se pide un número de tres cifras a través de un `JOptionPane.showInputDialog` que se tratará como un dato `String` y se verificará que el largo de carácteres sea 3, de ser así entrará a un bucle `for` que mostrará por cuadro de diálogo cada uno de los carácteres de los valores asignados.

## [Ejercicio 9](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/tree/main/src/Ejercicio9): Número de la suerte

### Problema

Escriba una aplicación que pida por Cuadro de Diálogo la fecha de nacimiento de una persona (día, mes, año) y calcule su número de la suerte.

El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación se suman las cifras obtenidas en la suma.

Por ejemplo:
Si la fecha de nacimiento es 12/07/1980
Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 = 28 
**Número de la suerte: 28.**

La salida se muestra por **Cuadro de Diálogo Personalizado**.

### Solución

Esta aplicación fue realizada en una sóla clase (que planeo corregir) y lee los datos desde un `JOptionPane.showInputDialog` y se verifica que sean datos coherentes, [Día(1-31); Mes (1-12); Año (1900-2021]. Posterior mente se convierte a `String` y se suma, el resultado se transforma a `String` nuevamente y se extrae carácter por carácter para después transformarlo a `int` por última vez y sumarlos para almacenarlo en una variable que será impresa en un cuadro de diálogo nuevo.

## [Ejercicio 10](https://github.com/Adolfo-Juarez/EjerciciosdeEvaluacion/tree/main/src/Ejercicio10): Verificador de hora

### Problema

Escriba una aplicación que lea por **Cuadro de Diálogo tres números enteros** H, M, S correspondientes a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.

Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será mayor o igual que cero y menor que 24.

El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos. La salida se muestra por **Cuadro de Diálogo Personalizado**.

### Solución

Se introdcue los dígitos y se verifica que sean datos coherentes, [Hora (0-23); Minuto (0-59); Segundo (0-59)], si cumple con estos requisitos, se imprimirá en un cuadro de diálogo nuevo.

