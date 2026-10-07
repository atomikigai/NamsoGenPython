package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgor {
    private final Class zza;
    private zzgos zzd;
    private Map zzb = new HashMap();
    private final List zzc = new ArrayList();
    private zzgnd zze = zzgnd.zza;

    public /* synthetic */ zzgor(Class cls, zzgot zzgotVar) {
        this.zza = cls;
    }

    private final zzgor zze(Object obj, zzgfw zzgfwVar, zzguk zzgukVar, boolean z4) throws GeneralSecurityException {
        byte[] bArrZzc;
        if (this.zzb == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (obj == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if (zzgukVar.zzk() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int iOrdinal = zzgukVar.zzf().ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzgoa.zzb(zzgukVar.zza()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzgoa.zza(zzgukVar.zza()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = zzgoa.zza(zzgukVar.zza()).zzc();
        } else {
            bArrZzc = zzgfr.zza;
        }
        zzgos zzgosVar = new zzgos(obj, zzgwu.zzb(bArrZzc), zzgukVar.zzk(), zzgukVar.zzf(), zzgukVar.zza(), zzgukVar.zzb().zzg(), zzgfwVar, null);
        Map map = this.zzb;
        List list = this.zzc;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzgosVar);
        List list2 = (List) map.put(zzgosVar.zzb, Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(zzgosVar);
            map.put(zzgosVar.zzb, Collections.unmodifiableList(arrayList2));
        }
        list.add(zzgosVar);
        if (!z4) {
            return this;
        }
        if (this.zzd != null) {
            throw new IllegalStateException("you cannot set two primary primitives");
        }
        this.zzd = zzgosVar;
        return this;
    }

    public final zzgor zza(Object obj, zzgfw zzgfwVar, zzguk zzgukVar) throws GeneralSecurityException {
        zze(obj, zzgfwVar, zzgukVar, false);
        return this;
    }

    public final zzgor zzb(Object obj, zzgfw zzgfwVar, zzguk zzgukVar) throws GeneralSecurityException {
        zze(obj, zzgfwVar, zzgukVar, true);
        return this;
    }

    public final zzgor zzc(zzgnd zzgndVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzgndVar;
        return this;
    }

    public final zzgou zzd() throws GeneralSecurityException {
        Map map = this.zzb;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzgou zzgouVar = new zzgou(map, this.zzc, this.zzd, this.zze, this.zza, null);
        this.zzb = null;
        return zzgouVar;
    }
}
