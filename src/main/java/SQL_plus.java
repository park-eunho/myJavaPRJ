public class SQL_plus {
    select ename,dname
    from emp,dept
    where emp.deptno=dept.deptno
    and ename='SCOTT';
}

/
  select emp.ename, dept.dname, emp.deptno
  from emp.dept
  where emp.deptno=dept.depttno
  and ename='SCOTT'