package com.google.android.recaptcha.internal;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import k3.p;
import rc.a0;
import rc.b0;
import rc.k0;
import rc.r1;
import rc.w0;
import wc.e;
import wc.o;
import yc.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzt {
    public static final zzr zza = new zzr(null);
    private final a0 zzb;
    private final a0 zzc;
    private final a0 zzd;

    public zzt() {
        r1 r1VarC = b0.c();
        d dVar = k0.f8292a;
        this.zzb = new e(com.bumptech.glide.d.x(r1VarC, o.f9950a));
        e eVarB = b0.b(new w0(Executors.newScheduledThreadPool(1, new p(new AtomicInteger()))));
        b0.q(eVarB, null, new zzs(null), 3);
        this.zzc = eVarB;
        this.zzd = b0.b(k0.f8293b);
    }

    public final a0 zza() {
        return this.zzd;
    }

    public final a0 zzb() {
        return this.zzb;
    }

    public final a0 zzc() {
        return this.zzc;
    }
}
