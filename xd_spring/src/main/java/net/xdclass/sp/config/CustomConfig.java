package net.xdclass.sp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/* @
 * @ClassName CustomConfig
 * @Description
 * @Author cy
 * @Date 2020-07-23 16:28
 * Version 1.0
 **/
@Configuration
@PropertySource("classpath:config.properties")
public class CustomConfig {
    @Value("${server.host}")
    private String host;

    @Value("${server.port}")
    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "CustomConfig{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}
