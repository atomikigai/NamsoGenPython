package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzazx implements Comparator {
    public zzazx(zzazy zzazyVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazm zzazmVar = (zzazm) obj;
        zzazm zzazmVar2 = (zzazm) obj2;
        if (zzazmVar.zzd() < zzazmVar2.zzd()) {
            return -1;
        }
        if (zzazmVar.zzd() > zzazmVar2.zzd()) {
            return 1;
        }
        if (zzazmVar.zzb() < zzazmVar2.zzb()) {
            return -1;
        }
        if (zzazmVar.zzb() > zzazmVar2.zzb()) {
            return 1;
        }
        float fZza = (zzazmVar.zza() - zzazmVar.zzd()) * (zzazmVar.zzc() - zzazmVar.zzb());
        float fZza2 = (zzazmVar2.zza() - zzazmVar2.zzd()) * (zzazmVar2.zzc() - zzazmVar2.zzb());
        if (fZza > fZza2) {
            return -1;
        }
        return fZza < fZza2 ? 1 : 0;
    }
}
