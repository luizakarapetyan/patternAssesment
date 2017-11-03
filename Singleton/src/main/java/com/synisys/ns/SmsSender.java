package com.synisys.ns;

public class SmsSender implements Sender {

    private static Sender smsSender = null;
    private SmsSender(){}

    public static synchronized Sender getInstance() {
        if (smsSender == null) {
            smsSender = new SmsSender();
        }
        return smsSender;
    }

    @Override
    public boolean send(Notification notification) {
        System.out.println("send notification via email");
        return true;
    }
}
