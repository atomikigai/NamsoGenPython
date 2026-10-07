package com.google.android.gms.ads.nativead;

import android.os.Bundle;
import w5.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class NativeAd {
    public abstract String getBody();

    public abstract String getHeadline();

    public abstract t getResponseInfo();

    public abstract void recordEvent(Bundle bundle);

    public abstract Object zza();
}
