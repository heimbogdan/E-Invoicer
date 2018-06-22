package ro.helator.einvoicer;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javafx.application.Application;
import javafx.stage.Stage;
import ro.helator.einvoicer.config.AppContextConfig;
import ro.helator.einvoicer.screen.ScreensContoller;

public class Main extends Application {

	private static final Logger log = Logger.getLogger(Main.class);

	public void start(Stage stage) {
		try {
			PropertyConfigurator.configure("./config/log.properties");
			log.info("Application started!");

			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppContextConfig.class);
			ScreensContoller bean = context.getBean(ScreensContoller.class);
			bean.init(stage);
			bean.loadScreen("/fxml/E-Invoicer.fxml");
			context.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
