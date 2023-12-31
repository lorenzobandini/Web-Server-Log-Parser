public class Web_Server_Log {
    public static void main(String[] args) throws Exception {
        final String logFile = "./web_log.txt";

        Thread SingleT = new Thread(new Single_Translator(logFile));
        SingleT.start();
        SingleT.join();

        System.out.println("=======================================================");

        Thread MultiT = new Thread(new Multi_Translator(logFile));
        MultiT.start();
        MultiT.join();
        
    }
}
