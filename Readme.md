# Practicando con IntelliJ

## Extract
### Extract Method
Extraer a un método toda la parte del switch
llamarlo _updateWithWeather_

MacOS: ALT + CMD + M

### Extract Constant
Extraer a una constante los días del año para la tierra
llamarla _NUMBER_OF_DAYS_IN_A_YEAR_

MacOS: ALT + CMD + C

### Extract Field
Extraer de la función _updateWithWeather_ toda la parte que se repite _The weather is_

Sólo seleccionar la primera frase, aparece una nueva ventana:

seleccionar _Initialize in Current method_

llamarla _theWeatherIs_

seleccionar _Replace all occurrences_

Nota, me crea un atributo en la clase, quiero el scope en la función (gente java qué opina?)

MacOS: ALT + CMD + F

### Extract Variable
De la función _printPlanetFacts_
Línea 16, _planet.getName().length()_ vamos a dar semántica
Extraer a una variable, llamarla _planetNameLength_

MacOS: ALT + CMD + V

Extra, mover la sentencia de la nueva variable al comienzo de la función

### Extract Parameter
De la funcion _updateWithWeather_ vamos a extraer _UK_ como parámetro de la función

MacOS: ALT + CMD + P

## Make Inline
Vamos ha hacer _inline_ la función _updateWithWeather_

MacOS: ALT + CMD + N


## Change signature
Ir a la clase _Planeta_ al constructor

Nuevo parámetro _String realSeason_
Seleccionar _Default value: "Summer"_

Cambiar public String getCountryWeather() {
```java
public String getCountryWeather() {
        return realSeason;
    }
```
Ver que me cambia los tests al meter un nuevo parámetro

OJO que ahora están en rojo salvo 1, cambiar en los test el valor de _realSeason_




MacOS: CMD + F6