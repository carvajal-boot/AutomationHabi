package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConnectionSqlTask implements Task {
    private String query;

    public ConnectionSqlTask(String query) {
        this.query = query;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/delftstackDB","username","dbPassword");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }



    public static ConnectionSqlTask queryExecute(String query) {
        return instrumented(ConnectionSqlTask.class, query);
    }

}
