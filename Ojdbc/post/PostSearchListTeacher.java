package post;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import comm.DbConnect;

public class PostSearchListTeacher extends DbConnect {
   
   public static void main(String[] args) throws Exception {
      
      System.out.println("1.우편번호검색");
      System.out.println("2.시도검색");
      System.out.println("3.구군검색");
      System.out.println("4.읍면동리검색");
      System.out.println("5.건물검색");
      
      Scanner scn = new Scanner(System.in);
      System.out.println("번호선택>>");
      
      try {
         int number = scn.nextInt();
         if( number >= 1 && number <= 5) {
         addrSerch(number);
         } else {
            System.out.println("*** 잘못된 번호입니다. ***");
         }
      } catch( Exception e ) {
         System.out.println("정상적이지 않은 값입니다.");
      }
   }
   public static void addrSerch(int number) throws Exception {
      
      // DB연결
      Statement stmt = Connection().createStatement();
      String str = "";
      Scanner scn = new Scanner(System.in);
      String str1 = "";
      
      while( true ) {
      System.out.println("검색어 입력>>");
      str = scn.next();
      if( str.trim().equals("") ) {
           continue;   // 반복문 재실행      
         } else break; // 반복문 종료
      }   

      switch(number) {
         case 1 : str1 = " a1='"+str+"' ";
            break;
         case 2 : str1 = " a2 like '%"+str+"%' ";
            break;
         case 3 : str1 = " a3 like '%"+str+"%' ";
            break;
         case 4 : str1 = " a4 like '%"+str+"%' or a5 like '%"+str+"%' ";
            break;
         case 5 : str1 = " a7 like '%"+str+"%' ";
            break;
         default : str1 = " 1=1 ";
      }
       String sql = "select (a1||' '||a2||' '||a3||' '||a4 "
                  + "||' '||a5||' '||a6||' '||a7) as address "
                  + " from post1 "
                  + " where " + str1 ;
       
       ResultSet rs = stmt.executeQuery(sql);
       System.out.println("결과: ");
       int cnt = 0;
       while( rs.next()) { // 한 행씩 가져옴
          cnt++; // 증가
          String address = rs.getString("address");
          System.out.println( address );
       }   
       if(cnt==0) {
              System.out.println("잘못된 우편번호 입니다.");
       }
       System.out.println(cnt+"건");
   }
}