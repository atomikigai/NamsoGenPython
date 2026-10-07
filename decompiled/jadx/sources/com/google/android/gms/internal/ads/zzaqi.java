package com.google.android.gms.internal.ads;

import da.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaqi {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public zzaqi(String str, zzaoy zzaoyVar) {
        String str2 = zzaoyVar.zzb;
        long j4 = zzaoyVar.zzc;
        long j10 = zzaoyVar.zzd;
        long j11 = zzaoyVar.zze;
        long j12 = zzaoyVar.zzf;
        ?? arrayList = zzaoyVar.zzh;
        if (arrayList == 0) {
            Map map = zzaoyVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzaph((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j4, j10, j11, j12, arrayList);
    }

    public static zzaqi zza(zzaqj zzaqjVar) throws IOException {
        if (zzaql.zze(zzaqjVar) != 538247942) {
            throw new IOException();
        }
        String strZzh = zzaql.zzh(zzaqjVar);
        String strZzh2 = zzaql.zzh(zzaqjVar);
        long jZzf = zzaql.zzf(zzaqjVar);
        long jZzf2 = zzaql.zzf(zzaqjVar);
        long jZzf3 = zzaql.zzf(zzaqjVar);
        long jZzf4 = zzaql.zzf(zzaqjVar);
        int iZze = zzaql.zze(zzaqjVar);
        if (iZze < 0) {
            throw new IOException(v.f(iZze, "readHeaderList size="));
        }
        List arrayList = iZze == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iZze; i++) {
            arrayList.add(new zzaph(zzaql.zzh(zzaqjVar).intern(), zzaql.zzh(zzaqjVar).intern()));
        }
        return new zzaqi(strZzh, strZzh2, jZzf, jZzf2, jZzf3, jZzf4, arrayList);
    }

    private zzaqi(String str, String str2, long j4, long j10, long j11, long j12, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j4;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = j12;
        this.zzh = list;
    }
}
