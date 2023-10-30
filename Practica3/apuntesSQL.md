order by sueldo desc
order by sueldo 

select *
select salario, apellido   // pone las columnas en el orden ese

where apellidos like "%algo%"

sum(salario) suma todos los salrios

count(*)  cuenta cantidad de filas

select sum(salario) / count(*) as promedio
from empleados

select avg(salario)  // promedio de salarios

group by sexo   // agrupa por sexo

distinct  // hace que no se repitan

select * from cursos c, profesores p
where p.id_profe = c.id_profe