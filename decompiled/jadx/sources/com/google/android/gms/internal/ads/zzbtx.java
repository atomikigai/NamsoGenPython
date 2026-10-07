package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import e6.e;
import e6.o2;
import e6.o3;
import e6.p3;
import e6.q;
import e6.s;
import java.util.ArrayList;
import w5.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbtx {
    private static zzbzh zza;
    private final Context zzb;
    private final b zzc;
    private final o2 zzd;
    private final String zze;

    public zzbtx(Context context, b bVar, o2 o2Var, String str) {
        this.zzb = context;
        this.zzc = bVar;
        this.zzd = o2Var;
        this.zze = str;
    }

    public static zzbzh zza(Context context) {
        zzbzh zzbzhVar;
        synchronized (zzbtx.class) {
            try {
                if (zza == null) {
                    q qVar = s.f3427f.f3429b;
                    zzbpc zzbpcVar = new zzbpc();
                    qVar.getClass();
                    zza = (zzbzh) new e(context, zzbpcVar).d(context, false);
                }
                zzbzhVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbzhVar;
    }

    public final void zzb(q6.b bVar) {
        zzbzh zzbzhVar;
        q7.b bVar2;
        o3 o3VarA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzbzh zzbzhVarZza = zza(this.zzb);
        if (zzbzhVarZza == null) {
            bVar.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.zzb;
        o2 o2Var = this.zzd;
        q7.b bVar3 = new q7.b(context);
        if (o2Var == null) {
            zzbzhVar = zzbzhVarZza;
            bVar2 = bVar3;
            o3VarA = new o3(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, jCurrentTimeMillis);
        } else {
            zzbzhVar = zzbzhVarZza;
            bVar2 = bVar3;
            o2Var.f3370j = jCurrentTimeMillis;
            o3VarA = p3.a(this.zzb, this.zzd);
        }
        try {
            zzbzhVar.zzf(bVar2, new zzbzl(this.zze, this.zzc.name(), null, o3VarA), new zzbtw(this, bVar));
        } catch (RemoteException unused) {
            bVar.onFailure("Internal Error.");
        }
    }
}
