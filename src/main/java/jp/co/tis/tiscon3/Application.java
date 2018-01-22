package jp.co.tis.tiscon3;

import enkan.system.EnkanSystem;
import jp.co.tis.tiscon3.configuration.SystemConfiguration;

public class Application {
    public static void main(String[] args) {
        EnkanSystem system = new SystemConfiguration().create();
        Runtime.getRuntime().addShutdownHook(new Thread(system::stop));
        system.start();
    }
}
