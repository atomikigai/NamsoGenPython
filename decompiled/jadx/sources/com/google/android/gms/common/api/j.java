package com.google.android.gms.common.api;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class j extends Exception {

    @Deprecated
    protected final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    public j(Status status) {
        int i = status.f2045a;
        String str = status.f2046b;
        super(i + ": " + (str == null ? "" : str));
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.f2045a;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.f2046b;
    }
}
