package co.park.prj.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {
	// 싱글톤 클래스로 만들어주기 위해 아래의 코드를 작성
	// 싱글톤은 외부에서 자신을 마음대로 사용하지 못하게 하는 것
	private static DataSource dataSource = new DataSource();	// 자신의 인스턴스 생성
	private Connection conn;
	private String driver;
	private String url;
	private String user;
	private String password;
	
	private DataSource() {}	// 생성자 (외부에서 생성하지 못하게 한다)
	
	public static DataSource getInstance() {	// 외부에서 사용자 인스턴스를 리턴한다
		return dataSource;
	}
	
	public Connection getConnection() {
		configure();	// 외부 properties 파일을 읽어온다.
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("연결실패");
		}
		return conn;
	}
	
	private void configure() {
		Properties properties = new Properties();
		String resource = getClass().getResource("/db.properties").getPath();
		
		try {
			properties.load(new FileReader(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
