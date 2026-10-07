package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import d6.p;
import e6.t;
import h6.k0;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzduw extends zzftg {
    private final SensorManager zza;
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzduv zzi;
    private boolean zzj;

    public zzduw(Context context) {
        super("FlickDetector", "ads");
        this.zzc = 0.0f;
        this.zzd = Float.valueOf(0.0f);
        p.C.f2983j.getClass();
        this.zze = System.currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftg
    public final void zza(SensorEvent sensorEvent) {
        zzbce zzbceVar = zzbcn.zziI;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
            p.C.f2983j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.zze + ((long) ((Integer) zzbclVar2.zza(zzbcn.zziK)).intValue()) < jCurrentTimeMillis) {
                this.zzf = 0;
                this.zze = jCurrentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            float fFloatValue = this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.zzd = Float.valueOf(fFloatValue);
            float f10 = this.zzc;
            zzbce zzbceVar2 = zzbcn.zziJ;
            if (fFloatValue > ((Float) zzbclVar2.zza(zzbceVar2)).floatValue() + f10) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) zzbclVar2.zza(zzbceVar2)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                k0.k("Flick detected.");
                this.zze = jCurrentTimeMillis;
                int i = this.zzf + 1;
                this.zzf = i;
                this.zzg = false;
                this.zzh = false;
                zzduv zzduvVar = this.zzi;
                if (zzduvVar == null || i != ((Integer) zzbclVar2.zza(zzbcn.zziL)).intValue()) {
                    return;
                }
                zzdvk zzdvkVar = (zzdvk) zzduvVar;
                zzdvkVar.zzh(new zzdvi(zzdvkVar), zzdvj.GESTURE);
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.zzj = false;
                    k0.k("Stopped listening for flick gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziI)).booleanValue()) {
                    if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzj = true;
                        k0.k("Listening for flick gestures.");
                    }
                    if (this.zza == null || this.zzb == null) {
                        h.g("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(zzduv zzduvVar) {
        this.zzi = zzduvVar;
    }
}
