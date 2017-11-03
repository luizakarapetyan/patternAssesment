package com.synisys.ns;
public class SystemSender implements Sender {


    private static Sender systemSender = null;
    private SystemSender(){}

    public static synchronized Sender getInstance() {
        if (systemSender == null) {
            systemSender = new SystemSender();
        }
        return systemSender;
    }

    @Override
    public boolean send(Notification notification) {
        System.out.println("save notification in DB");
        return true;
    }
}
