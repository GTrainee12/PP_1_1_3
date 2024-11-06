package util;

import lombok.NoArgsConstructor;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@NoArgsConstructor
public class Util {
    private static Connection conn = null;


    public static synchronized Connection getConnection() throws SQLException, IOException {
        if (conn == null || conn.isClosed()) {
            Properties props = getProps();
            conn = DriverManager.getConnection(
                    props.getProperty("db.url"),
                    props.getProperty("db.user"),
                    props.getProperty("db.password")
            );
        }
        return conn;
    }

    private static Properties getProps() throws IOException {
        Properties props = new Properties();
        try (InputStream in = Util.class.getClassLoader().getResourceAsStream("application.properties")) {
            props.load(in);
        } catch (IOException e) {
            throw new IOException("Database configuration file not found", e);
        }
        return props;
    }


}
