    import org.apache.log4j.Logger;
    import org.apache.log4j.BasicConfigurator;

    public class Hello {

      static Logger logger = Logger.getLogger(Hello.class);

      public void fala(){
        System.out.println("falei inicio");
    	//BasicConfigurator.configure();
    	logger.debug("Log to falando classe hello");
        System.out.println("falei fim");
        logger.debug("DEBGU");
        logger.info("INFO");
      }

      public void divide(){
          int valor = 5;
          int div = 5;
          int fim = valor / div;
          logger.fatal("erro na divisao");
          System.out.println(fim);
          
      }
    }
