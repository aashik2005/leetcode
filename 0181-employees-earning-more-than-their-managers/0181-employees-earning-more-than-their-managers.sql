SELECT name as Employee from Employee emp where salary>(SELECT salary from EMPLOYEE e where e.id=emp.managerId)
