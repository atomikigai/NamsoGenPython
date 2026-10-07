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
public final class zzdwm extends zzftg {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdwl zzf;
    private boolean zzg;

    public zzdwm(Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzftg
    public final void zza(SensorEvent sensorEvent) {
        zzbce zzbceVar = zzbcn.zziD;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f12 * f12) + (f11 * f11) + (f10 * f10))) >= ((Float) zzbclVar2.zza(zzbcn.zziE)).floatValue()) {
                p.C.f2983j.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.zzd + ((long) ((Integer) zzbclVar2.zza(zzbcn.zziF)).intValue()) <= jCurrentTimeMillis) {
                    if (this.zzd + ((long) ((Integer) zzbclVar2.zza(zzbcn.zziG)).intValue()) < jCurrentTimeMillis) {
                        this.zze = 0;
                    }
                    k0.k("Shake detected.");
                    this.zzd = jCurrentTimeMillis;
                    int i = this.zze + 1;
                    this.zze = i;
                    zzdwl zzdwlVar = this.zzf;
                    if (zzdwlVar == null || i != ((Integer) zzbclVar2.zza(zzbcn.zziH)).intValue()) {
                        return;
                    }
                    zzdvk zzdvkVar = (zzdvk) zzdwlVar;
                    zzdvkVar.zzh(new zzdvh(zzdvkVar), zzdvj.GESTURE);
                }
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            try {
                if (this.zzg) {
                    SensorManager sensorManager = this.zzb;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.zzc);
                        k0.k("Stopped listening for shake gestures.");
                    }
                    this.zzg = false;
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
                zzbce zzbceVar = zzbcn.zziD;
                t tVar = t.f3437d;
                if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                    if (this.zzb == null) {
                        SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                        this.zzb = sensorManager2;
                        if (sensorManager2 == null) {
                            h.g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.zzc = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        p.C.f2983j.getClass();
                        this.zzd = System.currentTimeMillis() - ((long) ((Integer) tVar.f3440c.zza(zzbcn.zziF)).intValue());
                        this.zzg = true;
                        k0.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(zzdwl zzdwlVar) {
        this.zzf = zzdwlVar;
    }
}
