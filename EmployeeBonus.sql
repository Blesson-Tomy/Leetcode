SELECT e.name,b.bonus FROM Employee e LEFT OUTER JOIN Bonus b ON b.empId = e.empId WHERE b.bonus < 1000 OR b.bonus IS NULL ;
