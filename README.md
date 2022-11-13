# diagrama

```mermaid
graph TD;
A[Inicio] --> B{Cantidad que quieres retirar?}
C-->|No|A
B-->|Si|C
C[Mayor que 5]
--> D{Quieres retitar más dinero}
D-->|Si|E
D-->|No|A
E[Billetes exactos]
--> G{Quieres realizar otra operacion?}
G-->|Si|D
G-->|No|H
H[Fin] 

```
------
