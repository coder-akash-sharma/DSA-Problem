# Write your MySQL query statement below
Select d.name AS Department, 
        e.name AS Employee,
        e.salary AS Salary
        From Employee e
        JOin Department d ON e.departmentId = d.id
        where e.salary = (
            select MAX(salary)
            from Employee
            where departmentId = e.departmentId
        );

