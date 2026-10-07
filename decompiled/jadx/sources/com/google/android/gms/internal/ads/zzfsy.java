package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfsy extends zzfsm {
    private zzfxg<Integer> zza;
    private zzfxg<Integer> zzb;
    private zzfsx zzc;
    private HttpURLConnection zzd;

    public zzfsy(zzfxg<Integer> zzfxgVar, zzfxg<Integer> zzfxgVar2, zzfsx zzfsxVar) {
        this.zza = zzfxgVar;
        this.zzb = zzfxgVar2;
        this.zzc = zzfsxVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfsn.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfsn.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfsx zzfsxVar = this.zzc;
        zzfsxVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfsxVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfsx zzfsxVar, final int i, final int i10) throws IOException {
        this.zza = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfsq
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfsr
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.zzc = zzfsxVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i, final int i10) throws IOException {
        this.zza = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfss
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfst
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.zzc = new zzfsx() { // from class: com.google.android.gms.internal.ads.zzfsu
            @Override // com.google.android.gms.internal.ads.zzfsx
            public final URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i) throws IOException {
        this.zza = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfsv
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzc = new zzfsx() { // from class: com.google.android.gms.internal.ads.zzfsw
            @Override // com.google.android.gms.internal.ads.zzfsx
            public final URLConnection zza() {
                return url.openConnection();
            }
        };
        return zzm();
    }

    public zzfsy() {
        this(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfso
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return zzfsy.zzf();
            }
        }, new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfsp
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return zzfsy.zzg();
            }
        }, null);
    }
}
