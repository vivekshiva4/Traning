package or.vivek.Day23Rest.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import or.vivek.Day23Rest.model.Books;

public class BookDaoServiceById {
	public Statement stmt;
	public ResultSet rs;

	public List<Books> getBookById(int id) {
		List<Books> list = new ArrayList<Books>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("drivers loaded");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("connection establised");

			String query = "select * from books where studentId=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();

			while (rs.next()) {
				Books book = new Books();
				book.setBookId(rs.getInt(1));
				book.setStudentId(rs.getInt(2));
				book.setBookName(rs.getString(3));
				book.setBookAuthor(rs.getString(4));
				book.setBookContent(rs.getString(5));
				list.add(book);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// list.add(book);
		return list;
	}

}
