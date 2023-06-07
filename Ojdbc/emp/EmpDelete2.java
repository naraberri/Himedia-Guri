package emp;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

import comm.DbConnect;

public class EmpDelete2 extends DbConnect {
   public static void main(String[] args) throws Exception{
      Scanner scanner = new Scanner(System.in);
      Statement stmt = Connection().createStatement();
      
      String sql = "select * from emp order by empno asc";
      ResultSet rs = stmt.executeQuery(sql);

      ResultSetMetaData Data = rs.getMetaData();
       int clcnt = Data.getColumnCount();
       System.out.println("직원 검색 ");
       String clsearch = scanner.next();
       while (rs.next()) {
          for (int i = 1; i <= clcnt; i++) {
             String value = rs.getString(i);
             String data = Data.getColumnName(i);
             String sql2 = "select count(*) cnt from emp where "+data+" = '"+clsearch+"' ";
             System.out.println(sql2);
             Statement stmt2 = Connection().createStatement();
             ResultSet rs2 = stmt2.executeQuery(sql2);
             rs2.next();
             int cnt = rs2.getInt("cnt");                   
             if (cnt > 0 ) {          
                String sql3 = "delete from emp where "+data+"  = '"+clsearch+"'";
                  System.out.println(sql3);
                  int result = stmt.executeUpdate(sql3);
              
                  if(result > 0) {
                     System.out.println("삭제완료");
                     break;
                  } else {
                     System.out.println("삭제실패");
                  }
             } else {
                System.out.println(" '"+clsearch+"' 는 없는 직원입니다.");
             }
          }
   }      
   }
}