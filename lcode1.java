package mini;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class lcode1 {
	 public static Connection con;
	    public lcode1()throws Exception
	    {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root", "");
	    }
	    public boolean login(String user,String pass)throws Exception
	    {
	        boolean b=false;
	        String q="select * from login";
	        PreparedStatement ps=con.prepareStatement(q);
	        ResultSet rs=ps.executeQuery();
	        while(rs.next())
	        {
	            if(rs.getString("user").equals(user)&&rs.getString("pass").equals(pass))
	            {
	                b=true;
	            }
	        }
	        return b;
	    }
	    public int insert(int bid,String bname,String aname)
	            throws Exception
	    {
	        PreparedStatement ps=con.prepareStatement("insert into book(bid,bname,aname) values(?,?,?)");
	       
	        ps.setInt(1, bid);
	        ps.setString(2, bname);
	        ps.setString(3, aname);
	        return ps.executeUpdate();
	    }
	    public boolean search(String bname)throws Exception
	    {
	        PreparedStatement ps=con.prepareStatement("select * from book where bname=?");
	        ps.setString(1, bname);
	        ResultSet rs=ps.executeQuery();
	        while(rs.next())
	        {
	        	System.out.println("bid             bname                   aname                                          sname");
	        	System.out.println(rs.getInt("bid") + "\t" + rs.getString("bname") + "\t" + rs.getString("aname") + "\t" +rs.getString("sname"));
	        	}
			return false;
	    }
	    public int update(String bname,String sname)throws Exception
	    {
	        PreparedStatement ps=con.prepareStatement("update book set sname=? where bname=?");
	    
	        ps.setString(1,sname);
	        ps.setString(2,bname);
	        return ps.executeUpdate();
	    }
	    public int delete(int bid) throws Exception
	    {
	        PreparedStatement ps=con.prepareStatement("delete from book where bid=?");
	        ps.setInt(1, bid);
	        return ps.executeUpdate();
	    }
		    public  void view()throws SQLException
		    {
		    	String q="select * from book";
		        PreparedStatement ps=con.prepareStatement(q);
		        ResultSet rs=ps.executeQuery();
		        ArrayList<Book> a=new ArrayList<Book>();
		        while(rs.next())
		        {      
		            System.out.println(rs.getInt("bid")+"\t"+
		        rs.getString("bname")+"\t"+rs.getString("aname")+"\t"+
		                    rs.getString("sname"));
		        }
		    }
		}
	 

