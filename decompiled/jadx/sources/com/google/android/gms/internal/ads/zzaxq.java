package com.google.android.gms.internal.ads;

import android.view.View;
import e6.t;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaxq extends zzaxt {
    private final View zzh;

    public zzaxq(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10, View view) {
        super(zzawfVar, "gU8TtHMsoUkPWKRp4pchlMiybbWQk/XZmErfUYdY8xYZMhv+DT5EJrcXuMdR9TAB", "MCymTm++OZPusG19DHbi/CZ9AvqE5ZBPeRnjpDHc8+4=", zzasfVar, i, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            zzbce zzbceVar = zzbcn.zzdx;
            t tVar = t.f3437d;
            Boolean bool = (Boolean) tVar.f3440c.zza(zzbceVar);
            Boolean bool2 = (Boolean) tVar.f3440c.zza(zzbcn.zzkE);
            zzawj zzawjVar = new zzawj((String) this.zze.invoke(null, this.zzh, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzasy zzasyVarZza = zzasz.zza();
            zzasyVarZza.zzb(zzawjVar.zza.longValue());
            zzasyVarZza.zzd(zzawjVar.zzb.longValue());
            zzasyVarZza.zze(zzawjVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzasyVarZza.zzc(zzawjVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzasyVarZza.zza(zzawjVar.zzd.longValue());
            }
            this.zzd.zzY((zzasz) zzasyVarZza.zzbr());
        }
    }
}
