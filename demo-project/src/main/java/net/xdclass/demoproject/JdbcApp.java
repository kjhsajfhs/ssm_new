package net.xdclass.demoproject;

import java.sql.*;

/* @原⽣生jdbc测试类
 * @ClassName JdbcApp
 * @Description
 * @Author cy
 * @Date 2020-07-14 09:13
 * Version 1.0
 **/
public class JdbcApp {

    /*原⽣生jdbc访问数据库步骤
        加载JDBC驱动程序
        创建数据库的连接
        创建preparedStatement
        执⾏行行SQL语句句
        处理理结果集
        关闭JDBC对象资源*/
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //连接
        String url = "jdbc:mysql://192.168.10.11:33306/xdclass?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String username = "root";
        String password = "123456";

        //获取连接对象，并连接数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        //获取语句对象
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from video");
        //遍历结果集
        while (resultSet.next()){
            System.out.println("视频标题:"+resultSet.getString("title"));
        }
        statement.close();


    }
}
