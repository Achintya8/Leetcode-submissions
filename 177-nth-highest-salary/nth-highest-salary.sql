CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      SELECT DISTINCT salary FROM (
          SELECT salary, 
                 DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk 
          FROM Employee
      ) AS ranked_table
      WHERE rnk = N
  );
END
