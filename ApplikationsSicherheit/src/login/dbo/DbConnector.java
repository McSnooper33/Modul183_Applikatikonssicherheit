package login.dbo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DbConnector {
	

	public boolean validate(LoginBean loginBean) throws ClassNotFoundException {
		boolean status = false;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/login?useSSL=false", "root", "Gg24682468");
				PreparedStatement preparedStatement = connection.prepareStatement("SELECT userName, password FROM users where userName = ? and password = ?")) {
			
			  	preparedStatement.setString(1, loginBean.getUsername());
	            preparedStatement.setString(2, loginBean.getPassword());

	            System.out.println("User authentifizieren");
	            ResultSet rs = preparedStatement.executeQuery();
	            status = rs.next();
		} catch (SQLException e) {
			System.out.println("Autentifizierungsfehler");
            printSQLException(e);
        }
		if(status) {
			System.out.println("erfolgreich Daten geholt: " + loginBean.getUsername() + " " + loginBean.getPassword());
		}
        return status;
    }

	
	public boolean insertNewUser(NewUserBean newUserBean) throws ClassNotFoundException {
		boolean status = false;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/login?useSSL=false", "root", "Gg24682468");
				PreparedStatement preparedStatement = connection.prepareStatement("INSERT into users(vorname, nachname, geschlecht, telefon, geburtsdatum, email, username, password)"
						+ "values(?,?,?,?,?,?,?,?)")) {
			
			  	preparedStatement.setString(1, newUserBean.getVorname());
			  	preparedStatement.setString(2, newUserBean.getNachname());
			  	preparedStatement.setString(3, newUserBean.getGeschlecht());
			  	preparedStatement.setString(4, newUserBean.getTelefon());
			  	preparedStatement.setString(5, newUserBean.getGeburtsdatum());
			  	preparedStatement.setString(6, newUserBean.getEmail());
			  	preparedStatement.setString(7, newUserBean.getUsername());
			  	preparedStatement.setString(8, newUserBean.getPassword());

			  	System.out.println("Daten werden eingesetzt");
	            preparedStatement.executeUpdate();
	            status = true;
		} catch (SQLException e) {
				System.out.println("Daten konnten nicht hinzugefügt werden");
			printSQLException(e);
        }
		if(status) {
			System.out.println("erfolgreich Daten hinzugefügt");
		}
        return status;
    }
	
	
    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
