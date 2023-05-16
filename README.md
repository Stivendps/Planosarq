

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
    caracteres: identificaciones [50], nombres[50], area [50]  
    real: semanauno [50], semanados [50], semanatres [50], semanacuatro [50]  
    caracteres: identificacion, Nombre, Area  
    Entero: Numero de trabajadores, i  
    Real: semana1,semana2, semana3,semana4, periodo <- 0  
    Imprimir: "digite el numero de trabajadores: "  
    asignar: numerotrabajadores  
    para i=0 hasta numero detrabajadores -1, 1  
    imprimir: "digite la identificacion del estudiante"  
    asignar: identificacion
    imprimir: "digite el nombre del trabajador"  
    asignar : nombre  
    imprimir: "digite el nombre del trabajador"  
    asignar : "nombre"  
    imprimir: "digite el area del trabajador"  
    asignar: "area"  
    imprimir: "digite planos hehcos en la semana 1: "  
    asignar: semana1  
    imprimir: "digite planos hehcos en la semana 2: "  
    asignar: semana2  
    imprimir: "digite planos hehcos en la semana 3: "  
    asignar: semana3  
    imprimir: "digite planos hehcos en la semana 4: "  
    asignar: semana4  
    identificaciones[i]<- identificacion  
    nombres [i] <- nombre  
    area [i]<- area  
    semanauno[i]<- semana1  
    semanados[i]<- semana2  
    semanatres[i]<- semana3  
    semanacuatro[i]<- semana4
    finpara  
    para i=0 hasta numerotrabajadores -1, 1  
    promedio <-  
    promedio +((semanauno[i] + semanados[i] + semanatres[i] + semanacuatro[i]/4)numerotrabajadores)  
    finpara  
    imprimir "el promedio de planos hechos por el trabajador es de : "+ promedio  

![image](https://github.com/Stivendps/Planosarq/assets/121703665/4bfeb0b6-1868-4e32-93dc-85f87e2159a1)

## CODIGO EN JAVA
codigo de plantilla objeto:
![image](https://github.com/Stivendps/Planosarq/assets/121703665/cd60ec2e-619d-47cf-89b0-1374a45cd0d0)

![image](https://github.com/Stivendps/Planosarq/assets/121703665/fc1dcd76-56e6-4fde-a357-ba992fe61ade)
![image](https://github.com/Stivendps/Planosarq/assets/121703665/284c5e7e-b6d3-4e0a-8a43-5a72d9b3d461)


## resultado final

![image](https://github.com/Stivendps/Planosarq/assets/121703665/3df98e36-9647-42f7-a88d-8c7d671037d8)



