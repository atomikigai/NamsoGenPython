package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n7.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahz {
    private List zza;

    public zzahz() {
        this(null);
    }

    public final List zza() {
        return this.zza;
    }

    public zzahz(int i, List list) {
        if (list.isEmpty()) {
            this.zza = Collections.EMPTY_LIST;
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, g.a((String) list.get(i10)));
        }
        this.zza = Collections.unmodifiableList(list);
    }

    public zzahz(List list) {
        this.zza = new ArrayList();
    }
}
