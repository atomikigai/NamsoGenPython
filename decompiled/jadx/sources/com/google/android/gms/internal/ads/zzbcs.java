package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import d6.p;
import h6.r0;
import i6.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzbcs {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbcs zzbcsVar) throws Throwable {
        while (true) {
            try {
                zzbdc zzbdcVar = (zzbdc) zzbcsVar.zza.take();
                zzbdb zzbdbVarZza = zzbdcVar.zza();
                if (!TextUtils.isEmpty(zzbdbVarZza.zzb())) {
                    zzbcsVar.zzg(zzbcsVar.zzb(zzbcsVar.zzb, zzbdcVar.zzb()), zzbdbVarZza);
                }
            } catch (InterruptedException e) {
                h.h("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbdb zzbdbVar) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (zzbdbVar != null) {
            StringBuilder sb2 = new StringBuilder(string);
            if (!TextUtils.isEmpty(zzbdbVar.zzb())) {
                sb2.append("&it=");
                sb2.append(zzbdbVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbdbVar.zza())) {
                sb2.append("&blat=");
                sb2.append(zzbdbVar.zza());
            }
            string = sb2.toString();
        }
        if (!this.zzh.get()) {
            r0 r0Var = p.C.f2979c;
            r0.j(this.zze, this.zzf, string);
            return;
        }
        File file = this.zzi;
        if (file == null) {
            h.g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        h.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                    }
                } catch (IOException e4) {
                    e = e4;
                    fileOutputStream = fileOutputStream2;
                    h.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e10) {
                            h.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e11) {
                            h.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                        }
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final zzbcy zza(String str) {
        zzbcy zzbcyVar = (zzbcy) this.zzc.get(str);
        return zzbcyVar != null ? zzbcyVar : zzbcy.zza;
    }

    public final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, zza(str).zza((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbei.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(zzfsc.zza(zzfsb.zza(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcr
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                zzbcs.zzc(this.zza);
            }
        });
        Map map2 = this.zzc;
        zzbcy zzbcyVar = zzbcy.zzb;
        map2.put("action", zzbcyVar);
        this.zzc.put("ad_format", zzbcyVar);
        this.zzc.put("e", zzbcy.zzc);
    }

    public final void zze(String str) throws Throwable {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbdc zzbdcVar) {
        return this.zza.offer(zzbdcVar);
    }
}
