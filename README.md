

## EMPRESA CONSTRUCTORA SAS.

El cordinador stevend ps del area de contruccion, solicita el desarrollo de una aplicación que demuestre la cantidad de planos elaborados por cada trabajador en el área de construcción en la empresa por semana.

se desea calcular el promedio de planos elaborados por cada trabajador y el promedio de todos los trabajadores en el área de construcción.

cada trabajador se debe registrar con su nombre, el área y cantidad de planos elaborados.

#### respuesta:

Cada trabajador ingresa su nombre y digita la cantidad de planos desarrollados en la semana, el programa deve regresar el promedio de planos del area y el promedio de todos los trabajadores.

## Plantilla historia de usuarios:
![image](https://github.com/Stivendps/Planosarq/assets/121703665/73147a07-fd94-41c7-aa65-634db6132c35)

## Aproximacion de caso de uso:
![4a62fcc7-dc4d-484d-aacb-278f5a46edb7](https://github.com/Stivendps/Planosarq/assets/121703665/58116ea2-9183-43ab-89d8-8ee96941f056)

 nombre: calcular promedio notas estudiantes
 actores: coordinador de area de construccion
 proposito: guardar identificacion, nombre area, y cantidad de planos terminados.
 curso normal de eventos:
 1. Coordinardor ingresa la cantidad de trabajadores.
 2. El coordinador ingresa la identificacion, el area y  cantidad de planos elaborados por el trabajador.
 3. se calcula el promedio de planos terminados a partir de :
   ((semana1,semana2,semana3,semana4)/semanas trabajadas)/cantidad trabajadores)
 4. se demuestra el promedio de planos de los trabajadores.

## Diagrama de flujo:

![image](https://github.com/Stivendps/Planosarq/assets/121703665/2df65dd2-0fd3-4754-95b1-94975608bf27)

## Aproximacion seudocodigo:

inicio
    Caracteres: identificaciones [50], nombres [50], area [50]
    Real: semanauno [50], semanados [50], semanatres [50], semanacuatro [50]
    Caracteres: identificacion, nombre, area
    Entero: numeroTrabajadores, i
    Real: semana1, semana2, semana3, semana4, promedio <- 0
    Imprimir: ‘Digite el número de Trabajadores:’
    Asignar: numeroTrabajadores
    Para i=0 hasta numeroTrabajadores - 1, 1
    Imprimir: ‘Digite la identificación del estudiante:’
    Asignar: identificacion
    Imprimir: ‘Digite el nombre del trabajador:’
    Asignar: nombre
    Imprimir: ‘Digite el area del trabajador:’
    Asignar:  area
    Imprimir: ‘Digite la semana 1 del trabajador:’
    Asignar: semana1
    Imprimir: ‘Digite la semana 2 del trabajador:’
    Asignar: semana2
    Imprimir: ‘Digite la semana 3 del trabajador:’
    Asignar: semana3
    Imprimir: ‘Digite la semana 4 del trabajador:’
    Asignar: semana4
    identificaciones[i] <- identificacion
    nombres [i] <- nombre
    area [i] <- area
    semanauno[i] <- semana1
    semanados[i] <- semana2
    semanatres[i] <- semana3
    semanacuatro[i] <- semana4
    finPara
    Para i=0 hasta numeroTrabajadores -1, 1
    promedio <-
    promedio +((semanauno[i]+semanados[i]+semanatres[i])/3)numeroTrabajadores
    finPara
    Imprimir: ‘El promedio es:’ + promedio
Fin

