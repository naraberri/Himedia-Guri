package emp;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import comm.DbConnect;

public class EmpSearchListTeacher extends DbConnect {

       public static void main(String[] args) throws Exception {

              System.out.println("[ 사원검색 시스템 ]");

              System.out.println(" 1.사원명\n 2.부서별\n 3.업무별\n 4.매니저별\n 5.급여별 ");

              Scanner scn = new Scanner(System.in);

              System.out.print("메뉴번호>>");

              int menu = scn.nextInt();

 

              System.out.println();

 

              switch(menu) {

                      case 1 : empNameSearch();

                      break;

                      case 2 : empDeptSearch();

                      break;

                      case 3 : empJobSearch();

                      break;

                      case 4 : empMgrSearch();

                      break;

                      case 5 : empSalSearch();

                      break;

                      default : System.out.println("없는번호입니다.");

              }

        }

        public static void empNameSearch() throws Exception { 

              Statement stmt = Connection().createStatement();

              Scanner scn = new Scanner(System.in);

              System.out.print("사원명>>");

              String ename = scn.next();

              String sql = " select empno \n"
                         + "        ,job \n"
                         + "        ,sal \n"
                         + "        ,mgr \n"
                         + "        ,deptno \n"
                         + "        ,(select ename from emp where empno=e.mgr) mgr_name \n"
                         + "        ,(select dname from dept where deptno=e.deptno) dname \n"
                         + " from emp e \n"
                         + " where \n"
                         + "          e.ename=UPPER('"+ename+"') ";

              ResultSet rs = stmt.executeQuery(sql);

              int cnt = 0;

              while( rs.next() ) {

                      cnt++;

                      String empno = rs.getString("empno");
                      String job = rs.getString("job");
                      String sal = rs.getString("sal");
                      String mgr = rs.getString("mgr");
                      String deptno = rs.getString("deptno");
                      String mgr_name = rs.getString("mgr_name");
                      String dname = rs.getString("dname");
                      
                      System.out.println("1.사원명 : "+ename+"("+empno+")");
                      System.out.println("2.업무 : "+job);
                      System.out.println("3.급여 : "+sal);
                      System.out.println("4.매니저 : "+mgr_name);
                      System.out.println("5.부서 : "+dname);

              }

              if( cnt == 0 ) {
                       System.out.println(" *** 검색 결과가 없습니다. *** ");
              }

        }

        public static void empDeptSearch() throws Exception {

            Statement stmt = Connection().createStatement();

            Scanner scn = new Scanner(System.in);

            System.out.print("사원명>>");

            String dname = scn.next();
            
            String sql = " select e.empno as empno"
					+ "		  ,e.ename as ename"
					+ "		  ,e.job   as job"
					+ "		  ,d.dname as dname"
					+ " from emp e,dept d "
					+ " where e.deptno = d.deptno "
					+ " and d.dname = upper('"+dname+"')";
            
            ResultSet rs = stmt.executeQuery(sql);
            
            int number = 0;
            while(rs.next()) {
    			String empno = rs.getString("empno");
    			String ename = rs.getString("ename");
    			String job   = rs.getString("job");
    			dname 		 = rs.getString("dname");
    			
    			number++;
    			
    			System.out.println( number+"\t"+ename+"("+empno+")\t"+job+"\t"+dname);
    		}
 

        }

        public static void empJobSearch() throws Exception {

 

        }

        public static void empMgrSearch() throws Exception {

 

        }

        public static void empSalSearch() throws Exception {

 

        }

}
