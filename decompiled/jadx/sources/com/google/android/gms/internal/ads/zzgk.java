package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgk implements zzgd {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzgd zzc;
    private zzgd zzd;
    private zzgd zze;
    private zzgd zzf;
    private zzgd zzg;
    private zzgd zzh;
    private zzgd zzi;
    private zzgd zzj;
    private zzgd zzk;

    public zzgk(Context context, zzgd zzgdVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzgdVar;
    }

    private final zzgd zzg() {
        if (this.zze == null) {
            zzfv zzfvVar = new zzfv(this.zza);
            this.zze = zzfvVar;
            zzh(zzfvVar);
        }
        return this.zze;
    }

    private final void zzh(zzgd zzgdVar) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzgdVar.zzf((zzhd) this.zzb.get(i));
        }
    }

    private static final void zzi(zzgd zzgdVar, zzhd zzhdVar) {
        if (zzgdVar != null) {
            zzgdVar.zzf(zzhdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i, int i10) throws IOException {
        zzgd zzgdVar = this.zzk;
        zzgdVar.getClass();
        return zzgdVar.zza(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws IOException {
        zzgd zzgdVar;
        zzdb.zzf(this.zzk == null);
        String scheme = zzgiVar.zza.getScheme();
        Uri uri = zzgiVar.zza;
        int i = zzen.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = zzgiVar.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzgs zzgsVar = new zzgs();
                    this.zzd = zzgsVar;
                    zzh(zzgsVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzga zzgaVar = new zzga(this.zza);
                this.zzf = zzgaVar;
                zzh(zzgaVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzgd zzgdVar2 = (zzgd) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.zzg = zzgdVar2;
                    zzh(zzgdVar2);
                } catch (ClassNotFoundException unused) {
                    zzdt.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzhf zzhfVar = new zzhf(2000);
                this.zzh = zzhfVar;
                zzh(zzhfVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzgb zzgbVar = new zzgb();
                this.zzi = zzgbVar;
                zzh(zzgbVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzhb zzhbVar = new zzhb(this.zza);
                    this.zzj = zzhbVar;
                    zzh(zzhbVar);
                }
                zzgdVar = this.zzj;
            } else {
                zzgdVar = this.zzc;
            }
            this.zzk = zzgdVar;
        }
        return this.zzk.zzb(zzgiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        zzgd zzgdVar = this.zzk;
        if (zzgdVar == null) {
            return null;
        }
        return zzgdVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws IOException {
        zzgd zzgdVar = this.zzk;
        if (zzgdVar != null) {
            try {
                zzgdVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Map zze() {
        zzgd zzgdVar = this.zzk;
        return zzgdVar == null ? Collections.EMPTY_MAP : zzgdVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzf(zzhd zzhdVar) {
        zzhdVar.getClass();
        this.zzc.zzf(zzhdVar);
        this.zzb.add(zzhdVar);
        zzi(this.zzd, zzhdVar);
        zzi(this.zze, zzhdVar);
        zzi(this.zzf, zzhdVar);
        zzi(this.zzg, zzhdVar);
        zzi(this.zzh, zzhdVar);
        zzi(this.zzi, zzhdVar);
        zzi(this.zzj, zzhdVar);
    }
}
