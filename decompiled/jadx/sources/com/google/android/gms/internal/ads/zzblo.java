package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import d6.p;
import e6.t;
import h6.k0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzblo implements zzapi {
    private volatile zzblb zza;
    private final Context zzb;

    public zzblo(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzblo zzbloVar) {
        if (zzbloVar.zza == null) {
            return;
        }
        zzbloVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzapi
    public final zzapl zza(zzapp zzappVar) throws zzapy {
        Parcelable.Creator<zzblc> creator = zzblc.CREATOR;
        Map mapZzl = zzappVar.zzl();
        int size = mapZzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i10 = 0;
        for (Map.Entry entry : mapZzl.entrySet()) {
            strArr[i10] = (String) entry.getKey();
            strArr2[i10] = (String) entry.getValue();
            i10++;
        }
        zzblc zzblcVar = new zzblc(zzappVar.zzk(), strArr, strArr2);
        p pVar = p.C;
        pVar.f2983j.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            zzcao zzcaoVar = new zzcao();
            this.zza = new zzblb(this.zzb, pVar.f2992s.a(), new zzblm(this, zzcaoVar), new zzbln(this, zzcaoVar));
            this.zza.checkAvailabilityAndConnect();
            zzblk zzblkVar = new zzblk(this, zzblcVar);
            zzges zzgesVar = zzcaj.zza;
            m9.a aVarZzo = zzgei.zzo(zzgei.zzn(zzcaoVar, zzblkVar, zzgesVar), ((Integer) t.f3437d.f3440c.zza(zzbcn.zzex)).intValue(), TimeUnit.MILLISECONDS, zzcaj.zzd);
            aVarZzo.addListener(new zzbll(this), zzgesVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) aVarZzo.get();
            pVar.f2983j.getClass();
            k0.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            zzble zzbleVar = (zzble) new zzbvv(parcelFileDescriptor).zza(zzble.CREATOR);
            if (zzbleVar != null) {
                if (zzbleVar.zza) {
                    throw new zzapy(zzbleVar.zzb);
                }
                if (zzbleVar.zze.length == zzbleVar.zzf.length) {
                    HashMap map = new HashMap();
                    while (true) {
                        String[] strArr3 = zzbleVar.zze;
                        if (i >= strArr3.length) {
                            return new zzapl(zzbleVar.zzc, zzbleVar.zzd, map, zzbleVar.zzg, zzbleVar.zzh);
                        }
                        map.put(strArr3[i], zzbleVar.zzf[i]);
                        i++;
                    }
                }
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            p.C.f2983j.getClass();
            k0.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            p.C.f2983j.getClass();
            k0.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            throw th;
        }
    }
}
