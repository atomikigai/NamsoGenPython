package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import vb.h;
import vb.i;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzef {
    private List zza = q.f9297a;

    public final long zza(long[] jArr) {
        Iterator it = i.f0(this.zza, h.S(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = h.S(jArr);
    }
}
