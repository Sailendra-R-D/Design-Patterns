package Runners;

import com.sun.istack.internal.logging.Logger;
import creational.prototype.PrototypeImpl;

public class MorphRunner {
    enum DESIGN_PATTERN {PROTOTYPE}

    private static Logger log = Logger.getLogger(MorphRunner.class);

    public static void main(String[] args) {
        invokeDesignPattern(DESIGN_PATTERN.PROTOTYPE);
    }

    private static void invokeDesignPattern(DESIGN_PATTERN designPattern) {
        switch (designPattern) {

            case PROTOTYPE:
                PrototypeImpl prototypeDesignPattern = new PrototypeImpl();
                try {
                    prototypeDesignPattern.implement();
                } catch (CloneNotSupportedException e) {
                    log.info("Clone is not supported !!!");
                }
                break;
        }
    }
}
