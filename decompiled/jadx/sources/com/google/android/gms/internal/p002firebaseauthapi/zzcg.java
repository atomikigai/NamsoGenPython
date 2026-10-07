package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcg {
    private final Class zza;
    private zzch zzd;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private final List zzc = new ArrayList();
    private zzro zze = zzro.zza;

    public /* synthetic */ zzcg(Class cls, zzcf zzcfVar) {
        this.zza = cls;
    }

    private final zzcg zze(Object obj, Object obj2, zzwu zzwuVar, boolean z4) throws GeneralSecurityException {
        byte[] bArrArray;
        if (this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (zzwuVar.zzk() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        Integer numValueOf = Integer.valueOf(zzwuVar.zza());
        if (zzwuVar.zze() == zzxo.RAW) {
            numValueOf = null;
        }
        zzbn zzbnVarZza = zznt.zzc().zza(zzoo.zza(zzwuVar.zzb().zzf(), zzwuVar.zzb().zze(), zzwuVar.zzb().zzb(), zzwuVar.zze(), numValueOf), zzcr.zza());
        int iOrdinal = zzwuVar.zze().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(zzwuVar.zza()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzwuVar.zza()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzwuVar.zza()).array();
        } else {
            bArrArray = zzbi.zza;
        }
        zzch zzchVar = new zzch(obj, obj2, bArrArray, zzwuVar.zzk(), zzwuVar.zze(), zzwuVar.zza(), zzwuVar.zzb().zzf(), zzbnVarZza);
        ConcurrentMap concurrentMap = this.zzb;
        List list = this.zzc;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzchVar);
        zzcj zzcjVar = new zzcj(zzchVar.zzg(), null);
        List list2 = (List) concurrentMap.put(zzcjVar, Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(zzchVar);
            concurrentMap.put(zzcjVar, Collections.unmodifiableList(arrayList2));
        }
        list.add(zzchVar);
        if (!z4) {
            return this;
        }
        if (this.zzd != null) {
            throw new IllegalStateException("you cannot set two primary primitives");
        }
        this.zzd = zzchVar;
        return this;
    }

    public final zzcg zza(Object obj, Object obj2, zzwu zzwuVar) throws GeneralSecurityException {
        zze(obj, obj2, zzwuVar, false);
        return this;
    }

    public final zzcg zzb(Object obj, Object obj2, zzwu zzwuVar) throws GeneralSecurityException {
        zze(obj, obj2, zzwuVar, true);
        return this;
    }

    public final zzcg zzc(zzro zzroVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzroVar;
        return this;
    }

    public final zzcl zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzcl zzclVar = new zzcl(concurrentMap, this.zzc, this.zzd, this.zze, this.zza, null);
        this.zzb = null;
        return zzclVar;
    }
}
