package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzavx {
    private List zza = Collections.EMPTY_LIST;

    public final List zza() {
        List list = this.zza;
        this.zza = Collections.EMPTY_LIST;
        return list;
    }

    public final void zzb(List list) {
        this.zza = new ArrayList(list);
    }
}
