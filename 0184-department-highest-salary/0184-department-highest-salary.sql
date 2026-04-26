select d.name as Department,e.name as Employee,e.salary as Salary from employee e left join department d on e.departmentId=d.id 
where (e.salary, e.departmentId) IN (
        SELECT 
            MAX(salary), 
            departmentId 
        FROM 
            employee 
        GROUP BY 
            departmentId
    );

