package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.t;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzezj implements zzhfx {
    public static zzewc zza(Context context, zzbzn zzbznVar, zzbzo zzbzoVar, Object obj, zzexf zzexfVar, zzeym zzeymVar, zzhfr zzhfrVar, zzhfr zzhfrVar2, zzhfr zzhfrVar3, zzhfr zzhfrVar4, zzhfr zzhfrVar5, zzhfr zzhfrVar6, zzhfr zzhfrVar7, Executor executor, zzfkl zzfklVar, zzdsm zzdsmVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzeyf) obj);
        hashSet.add(zzexfVar);
        hashSet.add(zzeymVar);
        zzbce zzbceVar = zzbcn.zzfI;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            hashSet.add((zzevz) zzhfrVar.zzb());
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzfJ)).booleanValue()) {
            hashSet.add((zzevz) zzhfrVar2.zzb());
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzfL)).booleanValue()) {
            hashSet.add((zzevz) zzhfrVar4.zzb());
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzfM)).booleanValue()) {
            hashSet.add((zzevz) zzhfrVar5.zzb());
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzdc)).booleanValue()) {
            hashSet.add((zzevz) zzhfrVar7.zzb());
        }
        return new zzewc(context, executor, hashSet, zzfklVar, zzdsmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
