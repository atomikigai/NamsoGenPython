package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import e6.i;
import e6.m0;
import e6.o2;
import e6.p3;
import e6.q;
import e6.q3;
import e6.s;
import e6.u3;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzban {
    private m0 zza;
    private final Context zzb;
    private final String zzc;
    private final o2 zzd;
    private final int zze;
    private final y5.a zzf;
    private final zzbpc zzg = new zzbpc();
    private final p3 zzh = p3.f3389a;

    public zzban(Context context, String str, o2 o2Var, int i, y5.a aVar) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = o2Var;
        this.zze = i;
        this.zzf = aVar;
    }

    public final void zza() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            q3 q3VarG = q3.g();
            q qVar = s.f3427f.f3429b;
            Context context = this.zzb;
            String str = this.zzc;
            zzbpc zzbpcVar = this.zzg;
            qVar.getClass();
            m0 m0Var = (m0) new i(qVar, context, q3VarG, str, zzbpcVar).d(context, false);
            this.zza = m0Var;
            if (m0Var != null) {
                int i = this.zze;
                if (i != 3) {
                    m0Var.zzI(new u3(i));
                }
                this.zzd.f3370j = jCurrentTimeMillis;
                this.zza.zzH(new zzbaa(this.zzf, this.zzc));
                m0 m0Var2 = this.zza;
                p3 p3Var = this.zzh;
                Context context2 = this.zzb;
                o2 o2Var = this.zzd;
                p3Var.getClass();
                m0Var2.zzab(p3.a(context2, o2Var));
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }
}
