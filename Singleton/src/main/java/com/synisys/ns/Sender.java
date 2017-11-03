package com.synisys.ns;

public interface Sender {

    /**
     *
     * @param notification
     *            Notification
     */
    boolean send(final Notification notification);
}
