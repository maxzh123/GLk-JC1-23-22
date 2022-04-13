package by.itAcademy.database;

import java.math.BigDecimal;
import java.sql.*;

public class DbExample {

    //  Database credentials
    static final String DB_URL = "jdbc:postgresql://194.195.241.62:5432/example_db";
    static final String USER = "example";
    static final String PASS = "z@e3duaf";

    public static void main(String[] argv) {

        System.out.println("Testing connection to PostgreSQL JDBC");

//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
//            e.printStackTrace();
//            return;
//        }
//        System.out.println("PostgreSQL JDBC Driver successfully connected");

        try (Connection connection =DriverManager.getConnection(DB_URL, USER, PASS);){
            connection.setAutoCommit(false);
            //"insert into table_name (поле1,поле2) values (?,?)";
            PreparedStatement ps=
                    connection.prepareStatement("select r.id,\n" +
                            "       p.name as \"Кто\",\n" +
                            "       p.birthday as \"Родился\",\n" +
                            "       c.title as \"Потратил в городе\",\n" +
                            "       s.title as \"Потратил в магазине\",\n" +
                            "       r.processed_at as \"Когда\",\n" +
                            "       r.amount  as \"Сколько\"\n" +
                            "from\n" +
                            "    receipt r\n" +
                            "        join people p on r.people_id = p.id\n" +
                            "        join shop s on r.shop_id = s.id\n" +
                            "        join city c on s.city_id = c.id\n" +
                            "where\n" +
                            "        c.title = ? \n" +
                            "  and r.amount >?");
            ps.setString(1,"Минск");
            ps.setBigDecimal(2,new BigDecimal("80"));
            ResultSet rs=ps.executeQuery();

            long count=0;
            while (rs.next()){
                BigDecimal amount=rs.getBigDecimal("Сколько");
                String val=rs.getString("Кто");
                System.out.println(val+"\t"+amount);
                count++;
            }
            System.out.println("Всего:"+count);


        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }

    }
}
