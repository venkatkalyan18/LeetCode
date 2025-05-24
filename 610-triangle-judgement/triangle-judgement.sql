(SELECT *, 'Yes' AS triangle
FROM Triangle
WHERE (x + y > z) AND (y + z > x) AND (z + x > y))

UNION

(SELECT *, 'No' AS triangle
FROM Triangle
WHERE (x + y <= z) OR (y + z <= x) OR (z + x <= y));