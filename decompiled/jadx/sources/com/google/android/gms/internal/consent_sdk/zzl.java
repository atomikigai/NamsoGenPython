package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import h6.o0;
import java.util.ArrayList;
import l9.a;
import l9.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzl {
    private final Application zza;
    private final zzam zzb;

    public zzl(Application application, zzam zzamVar) {
        this.zza = application;
        this.zzb = zzamVar;
    }

    public final zzcf zzc(Activity activity, g gVar) throws zzg {
        gVar.getClass();
        o0 o0Var = new o0(this.zza);
        boolean z4 = true;
        if (!zzcq.zza(true) && !((ArrayList) o0Var.f5062c).contains(zzci.zza((Context) o0Var.f5061b))) {
            z4 = false;
        }
        return zzn.zza(new zzn(this, activity, new a(z4, o0Var), gVar, null));
    }
}
