package br.com.liol.data;

import br.com.liol.utils.ConfigLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoMySQL {

    private static Connection conexao;

    private ConexaoMySQL() {}

    public static Connection getConexao() throws SQLException {
        if (conexao == null || conexao.isClosed()) {
            Properties props = ConfigLoader.carregar("config/db.properties");

            String driver = props.getProperty("db.driver", "com.mysql.cj.jdbc.Driver");
            String url = props.getProperty("db.url");
            String usuario = props.getProperty("db.user");
            String senha = props.getProperty("db.password");

            try {
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, usuario, senha);
            } catch (ClassNotFoundException e) {
                throw new SQLException("Driver JDBC do MySQL não encontrado nas dependências Maven.", e);
            }
        }
        return conexao;
    }

    public static void fecharConexao() {
        if (conexao != null) {
            try {
                if (!conexao.isClosed()) {
                    conexao.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}