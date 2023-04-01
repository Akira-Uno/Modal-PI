package DAO;

import model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CarDAO {
    public void createCar(Car car){
        String SQL = "INSERT INTO CAR (NAME) VALUES (?)";
        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("success in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, car.getNome());
            preparedStatement.execute();

            preparedStatement.close();
        }catch(Exception e){
            System.out.println("fail in connection");
        }

    }

}
