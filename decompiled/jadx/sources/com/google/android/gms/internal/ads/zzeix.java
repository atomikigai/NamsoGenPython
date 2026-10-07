package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeix {
    private final zzfgg zza;
    private final zzdqa zzb;
    private final zzdsm zzc;

    public zzeix(zzfgg zzfggVar, zzdqa zzdqaVar, zzdsm zzdsmVar) {
        this.zza = zzfggVar;
        this.zzb = zzdqaVar;
        this.zzc = zzdsmVar;
    }

    public final void zza(zzfew zzfewVar, zzfet zzfetVar, int i, zzeff zzeffVar, long j4) {
        zzdpz zzdpzVarZza;
        zzdsl zzdslVarZza = this.zzc.zza();
        zzdslVarZza.zzd(zzfewVar);
        zzdslVarZza.zzc(zzfetVar);
        zzdslVarZza.zzb("action", "adapter_status");
        zzdslVarZza.zzb("adapter_l", String.valueOf(j4));
        zzdslVarZza.zzb("sc", Integer.toString(i));
        if (zzeffVar != null) {
            zzdslVarZza.zzb("arec", Integer.toString(zzeffVar.zzb().f3314a));
            String strZza = this.zza.zza(zzeffVar.getMessage());
            if (strZza != null) {
                zzdslVarZza.zzb("areec", strZza);
            }
        }
        zzdqa zzdqaVar = this.zzb;
        Iterator it = zzfetVar.zzt.iterator();
        do {
            if (!it.hasNext()) {
                zzdpzVarZza = null;
                break;
            }
            zzdpzVarZza = zzdqaVar.zza((String) it.next());
        } while (zzdpzVarZza == null);
        if (zzdpzVarZza != null) {
            zzdslVarZza.zzb("ancn", zzdpzVarZza.zza);
            zzbru zzbruVar = zzdpzVarZza.zzb;
            if (zzbruVar != null) {
                zzdslVarZza.zzb("adapter_v", zzbruVar.toString());
            }
            zzbru zzbruVar2 = zzdpzVarZza.zzc;
            if (zzbruVar2 != null) {
                zzdslVarZza.zzb("adapter_sv", zzbruVar2.toString());
            }
        }
        zzdslVarZza.zzf();
    }
}
