package utils;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private JDBCUtils() {}

    private static String url = null;
    private static String name = null;
    private static String pwd = null;

    static {
        try {
            Properties properties = new Properties();
            InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(in);
            Class.forName(properties.getProperty("driverClass"));
            url = properties.getProperty("url");
            name = properties.getProperty("name");
            pwd = properties.getProperty("pwd");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, name, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void close(Connection connection, Statement statement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
