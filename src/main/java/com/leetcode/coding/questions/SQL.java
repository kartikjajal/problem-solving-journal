package com.leetcode.coding.questions;

/*
Given following single employee Table, write a SQL query to get employee name and his manager’s name.
Table : Employees
emp_id | emp_name | manager_id
⸻⸻⸻⸻⸻⸻
1  | A   | NULL
2  | B   | NULL
3 |C  |1
4 |D  |1
5 |E  |2

Expected Output:-
emp_name | manager_name
⸻⸻⸻⸻⸺
A        | NULL
B        | NULL
C      |A
D      |A
E      |B

select e.emp_name, e.manager_name from employee e join employee self where e.manager_id = self.emp_id;

 */
public class SQL {
}
