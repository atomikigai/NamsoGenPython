package com.google.android.recaptcha.internal;

import ac.i;
import android.app.Application;
import ic.p;
import r7.g;
import rc.a0;
import ub.k;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzah extends i implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(Application application, String str, long j4, zzbq zzbqVar, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j4;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        return new zzah(this.zzb, this.zzc, this.zzd, null, dVar);
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzah) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f11555a;
        int i = this.zza;
        g.G(obj);
        if (i != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        long j4 = this.zzd;
        zzam zzamVar = zzam.zza;
        this.zza = 1;
        Object objZza = zzamVar.zza(application, str, j4, new zzab("https://www.recaptcha.net/recaptcha/api3"), null, null, zzam.zze, this);
        return objZza == aVar ? aVar : objZza;
    }
}
