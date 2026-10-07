package com.google.android.recaptcha.internal;

import ac.i;
import ic.p;
import java.util.Timer;
import r7.g;
import rc.a0;
import ub.k;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbk extends i implements p {
    final /* synthetic */ zzbm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbk(zzbm zzbmVar, d dVar) {
        super(2, dVar);
        this.zza = zzbmVar;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        return new zzbk(this.zza, dVar);
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbk) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11555a;
        g.G(obj);
        zzbm zzbmVar = this.zza;
        synchronized (zzbh.class) {
            try {
                zzaz zzazVar = zzbmVar.zze;
                if (zzazVar != null && zzazVar.zzb() == 0) {
                    Timer timer = zzbm.zzb;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzbm.zzb = null;
                }
                zzbmVar.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
        return k.f9073a;
    }
}
