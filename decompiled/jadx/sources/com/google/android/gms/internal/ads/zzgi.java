package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgi {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzax.zzb("media3.datasource");
    }

    public final String toString() {
        StringBuilder sbN = q1.a.n("DataSpec[GET ", this.zza.toString(), ", ");
        sbN.append(this.zze);
        sbN.append(", ");
        sbN.append(this.zzf);
        sbN.append(", null, ");
        return b.c(sbN, this.zzg, "]");
    }

    public final zzgg zza() {
        return new zzgg(this, null);
    }

    public final boolean zzb(int i) {
        return (this.zzg & i) == i;
    }

    private zzgi(Uri uri, long j4, int i, byte[] bArr, Map map, long j10, long j11, String str, int i10, Object obj) {
        boolean z4 = false;
        boolean z10 = j10 >= 0;
        zzdb.zzd(z10);
        zzdb.zzd(z10);
        if (j11 > 0) {
            z4 = true;
        } else if (j11 == -1) {
            j11 = -1;
            z4 = true;
        }
        zzdb.zzd(z4);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j10;
        this.zzf = j11;
        this.zzg = i10;
    }

    @Deprecated
    public zzgi(Uri uri, long j4, long j10, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j4, j10, null, 0, null);
    }
}
