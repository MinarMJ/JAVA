import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/anudip","root","neel");  
Statement stmt = con.createStatement();  
stmt.executeUpdate("CREATE TABLE emp " +"(emp_id INT NULL," +  "first_name VARCHAR(45) NULL," 
+ "last_Name VARCHAR(45) NULL," + "salary VARCHAR(45) NULL," + "joining_date VARCHAR(45) NULL," + "department VARCHAR(45) NULL);");  

String sq = "insert into emp value (1,'neel','mj',300000,'13/2/2001','Finance');" ;
stmt.executeUpdate( sq);

sq = "insert into emp value (2,'min','cj',300000,'13/2/2001','Finance');" ;
stmt.executeUpdate(sq);

sq = "insert into emp value (3,'aniket','sahu',300000,'12/2/2001','Tech_Team');" ;
stmt.executeUpdate(sq);

sq = "insert into emp value (4,'omkar','bhi',100000,'12/2/2001','Tech_Team');" ;
stmt.executeUpdate(sq);

sq = "insert into emp value (5,'tajes','tale',400000,'24/6/2001','Finance');" ;
stmt.executeUpdate(sq);

sq = "insert into emp value (6,'sid','gude',600000,'31/5/2001','Finance');" ;
stmt.executeUpdate(sq);

sq = "select * from emp where department = 'Tech_Team' ;";
ResultSet rs = stmt.executeQuery(sq);
System.out.println("////////////////////// name of the emp in the tech department ////////////////////////////////");

while (rs.next()) {
    System.out.println(rs.getString("emp_id") + " " + rs.getString("first_name") + " "
     + rs.getString("last_Name") + " " + rs.getString("salary")+ " " 
    + rs.getString("joining_date")+ " " + rs.getString("department"));
}
System.out.println("////////////////// name of the emp whos salary is grater then 300000 ////////////////////////////////");

sq = "select * from emp where salary > 300000 ;";
ResultSet rs2 = stmt.executeQuery(sq);


while (rs2.next()) {
    System.out.println( rs2.getString("first_name") + " " + rs2.getString("last_Name") );
}

System.out.println("////////////// first names in upper case  ////////////////////");
sq = "select first_name from emp;";
ResultSet rs3 = stmt.executeQuery(sq);

while(rs3.next()){
    String upper = rs3.getString("first_name");
    String res = upper.toUpperCase();
    System.out.println(res);
}
System.out.println("////////////// first names in upper case  ////////////////////");
ResultSet rs4 = stmt.executeQuery(sq);
while(rs4.next()){
    String tochr = rs4.getString("first_name");
    
    System.out.println(tochr.substring(0, 2));
}

con.close();

}

catch(Exception e){ 
    System.out.println(e);
}  
}  
}  