package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import jc.i;
import vb.h;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzch extends zzce {
    private final zzcg zza;
    private final String zzb;

    public zzch(zzcg zzcgVar, String str, Object obj) {
        super(obj);
        this.zza = zzcgVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzce
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        if (!i.a(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? h.H(objArr) : q.f9297a);
        return true;
    }
}
