package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import d6.p;
import e6.t;
import h6.k0;
import h6.r0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbbl {
    private final zzbbr zza;
    private final zzbbs.zzt.zza zzb;
    private final boolean zzc;

    private zzbbl() {
        this.zzb = zzbbs.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbbr();
    }

    public static zzbbl zza() {
        return new zzbbl();
    }

    private final synchronized String zzd(int i) {
        StringBuilder sb2;
        String strZzah = this.zzb.zzah();
        p.C.f2983j.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(this.zzb.zzbr().zzaV(), 3);
        sb2 = new StringBuilder("id=");
        sb2.append(strZzah);
        sb2.append(",timestamp=");
        sb2.append(jElapsedRealtime);
        sb2.append(",event=");
        sb2.append(i - 1);
        sb2.append(",data=");
        sb2.append(strEncodeToString);
        sb2.append("\n");
        return sb2.toString();
    }

    private final synchronized void zze(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfsc.zza(zzfsb.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                fileOutputStream.write(zzd(i).getBytes());
            } catch (IOException unused) {
                k0.k("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    k0.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused3) {
            k0.k("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i) {
        zzbbs.zzt.zza zzaVar = this.zzb;
        zzaVar.zzq();
        zzaVar.zzj(r0.x());
        zzbbp zzbbpVar = new zzbbp(this.zza, this.zzb.zzbr().zzaV(), null);
        int i10 = i - 1;
        zzbbpVar.zza(i10);
        zzbbpVar.zzc();
        k0.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i10, 10))));
    }

    public final synchronized void zzb(zzbbk zzbbkVar) {
        if (this.zzc) {
            try {
                zzbbkVar.zza(this.zzb);
            } catch (NullPointerException e) {
                p.C.f2982g.zzw(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeW)).booleanValue()) {
                zze(i);
            } else {
                zzf(i);
            }
        }
    }

    public zzbbl(zzbbr zzbbrVar) {
        this.zzb = zzbbs.zzt.zzj();
        this.zza = zzbbrVar;
        this.zzc = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeV)).booleanValue();
    }
}
