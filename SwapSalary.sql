UPDATE Salary 
SET 
sex= CASE sex
 WHEN 'm' then 'f' 
 when 'f' then 'm'
 else 'm'
 END;