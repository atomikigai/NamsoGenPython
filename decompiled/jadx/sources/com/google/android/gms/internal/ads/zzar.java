package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzar {
    public final Uri zza;
    public final String zzb;
    public final zzao zzc;
    public final zzaj zzd;
    public final List zze;
    public final String zzf;
    public final zzfzo zzg;
    public final Object zzh;
    public final long zzi;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzar(Uri uri, String str, zzao zzaoVar, zzaj zzajVar, List list, String str2, zzfzo zzfzoVar, Object obj, long j4, zzav zzavVar) {
        this.zza = uri;
        int i = zzbg.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzfzoVar;
        zzfzl zzfzlVar = new zzfzl();
        if (zzfzoVar.size() > 0) {
            throw null;
        }
        zzfzlVar.zzi();
        this.zzh = null;
        this.zzi = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzar)) {
            return false;
        }
        zzar zzarVar = (zzar) obj;
        if (this.zza.equals(zzarVar.zza) && this.zze.equals(zzarVar.zze) && this.zzg.equals(zzarVar.zzg)) {
            Object obj2 = -9223372036854775807L;
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) ((((long) ((this.zzg.hashCode() + ((this.zze.hashCode() + (this.zza.hashCode() * 923521)) * 961)) * 31)) * 31) - Long.MAX_VALUE);
    }
}
