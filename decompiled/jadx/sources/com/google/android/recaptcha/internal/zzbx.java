package com.google.android.recaptcha.internal;

import ac.i;
import ic.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import r7.g;
import rc.a0;
import rc.b1;
import rc.y;
import ub.k;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbx extends i implements p {
    int zza;
    final /* synthetic */ zzcj zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzca zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbx(zzcj zzcjVar, List list, zzca zzcaVar, d dVar) {
        super(2, dVar);
        this.zzb = zzcjVar;
        this.zzc = list;
        this.zzd = zzcaVar;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        zzbx zzbxVar = new zzbx(this.zzb, this.zzc, this.zzd, dVar);
        zzbxVar.zze = obj;
        return zzbxVar;
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbx) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11555a;
        int i = this.zza;
        k kVar = k.f9073a;
        g.G(obj);
        if (i != 0) {
            return kVar;
        }
        a0 a0Var = (a0) this.zze;
        zzfh zzfhVarZzb = zzfh.zzb();
        while (true) {
            zzcj zzcjVar = this.zzb;
            if (zzcjVar.zza() < 0) {
                break;
            }
            if (zzcjVar.zza() < this.zzc.size()) {
                b1 b1Var = (b1) a0Var.b().H(y.f8337b);
                if (!(b1Var != null ? b1Var.c() : true)) {
                    break;
                }
                try {
                    this.zzd.zzi((zzpr) this.zzc.get(this.zzb.zza()), this.zzb);
                } catch (Exception e) {
                    zzca zzcaVar = this.zzd;
                    zzcj zzcjVar2 = this.zzb;
                    this.zza = 1;
                    return zzcaVar.zzh(e, zzcjVar2, this) == aVar ? aVar : kVar;
                }
            } else {
                break;
            }
        }
        zzfhVarZzb.zzf();
        new Long(zzfhVarZzb.zza(TimeUnit.MICROSECONDS));
        return kVar;
    }
}
