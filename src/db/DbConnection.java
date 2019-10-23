package db;

import java.sql.*;


public class DbConnection {
    private String dbURL = "jdbc:mysql://localhost:3306/practise";
    private String username = "root";
    private String password = "";
    private Connection connection;
    public DbConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL,username,password);
            if(connection!=null){
                System.out.println("Success");
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertData(String user_name,String pass_word,String first_name,String last_name,String dob ,String Ema_il){
        try {
            String sqlQuery = "INSERT INTO reg (Username,Password,Firstname,Lastname,DateofBirth,Email) VALUES(?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, user_name);
            preparedStatement.setString(2, pass_word);
            preparedStatement.setString(3, first_name);
            preparedStatement.setString(4, last_name);
            preparedStatement.setString(5, dob);
            preparedStatement.setString(6, Ema_il);

            int noOfRowsInserted = preparedStatement.executeUpdate();
            if(noOfRowsInserted>0){
                System.out.println(noOfRowsInserted + " rows inserted!");
            }
            else
            {
                System.out.println("hii");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    public void displayRecords(){
        try {
            String sqlQuery = "SELECT * FROM reg";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlQuery);
            while (result.next()){

                System.out.println("Username is "+result.getString("User_name"));
                System.out.println("email is "+result.getString("Email"));
                System.out.println("Password is "+result.getString("Password"));

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
