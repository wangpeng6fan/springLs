package demoannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");//加载配置文件
		ReportService reportService = (ReportService)ctx.getBean("reportService");
		reportService.generateReport();
	}
}
