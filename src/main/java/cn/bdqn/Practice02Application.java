package cn.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.bdqn.mapper")
public class Practice02Application {

	public static void main(String[] args) {
		SpringApplication.run(Practice02Application.class, args);
	}

}
