package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.RemoteException;
import e6.k1;
import e6.l3;
import e6.t2;
import i6.h;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k6.s;
import w5.x;
import z5.d;
import z5.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbqm implements s {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbfn zzg;
    private final boolean zzi;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbqm(Date date, int i, Set set, Location location, boolean z4, int i10, zzbfn zzbfnVar, List list, boolean z10, int i11, String str) {
        this.zza = date;
        this.zzb = i;
        this.zzc = set;
        this.zze = location;
        this.zzd = z4;
        this.zzf = i10;
        this.zzg = zzbfnVar;
        this.zzi = z10;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.zzj.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.zzj.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    public final float getAdVolume() {
        t2 t2VarE = t2.e();
        synchronized (t2VarE.e) {
            k1 k1Var = t2VarE.f3445f;
            float fZze = 1.0f;
            if (k1Var == null) {
                return 1.0f;
            }
            try {
                fZze = k1Var.zze();
            } catch (RemoteException e) {
                h.e("Unable to get app volume.", e);
            }
            return fZze;
        }
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // k6.d
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    @Override // k6.s
    public final e getNativeAdOptions() {
        d dVar = new d();
        zzbfn zzbfnVar = this.zzg;
        if (zzbfnVar == null) {
            return new e(dVar);
        }
        int i = zzbfnVar.zza;
        if (i == 2) {
            dVar.f10974f = zzbfnVar.zze;
        } else {
            if (i != 3) {
                if (i == 4) {
                    dVar.f10975g = zzbfnVar.zzg;
                    dVar.f10972c = zzbfnVar.zzh;
                }
            }
            l3 l3Var = zzbfnVar.zzf;
            if (l3Var != null) {
                dVar.e = new x(l3Var);
            }
            dVar.f10974f = zzbfnVar.zze;
        }
        dVar.f10970a = zzbfnVar.zzb;
        dVar.f10971b = zzbfnVar.zzc;
        dVar.f10973d = zzbfnVar.zzd;
        return new e(dVar);
    }

    @Override // k6.s
    public final n6.h getNativeAdRequestOptions() {
        return zzbfn.zza(this.zzg);
    }

    public final boolean isAdMuted() {
        t2 t2VarE = t2.e();
        synchronized (t2VarE.e) {
            k1 k1Var = t2VarE.f3445f;
            boolean zZzv = false;
            if (k1Var == null) {
                return false;
            }
            try {
                zZzv = k1Var.zzv();
            } catch (RemoteException e) {
                h.e("Unable to get app mute state.", e);
            }
            return zZzv;
        }
    }

    @Override // k6.d
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // k6.d
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // k6.s
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override // k6.d
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // k6.s
    public final Map zza() {
        return this.zzj;
    }

    @Override // k6.s
    public final boolean zzb() {
        return this.zzh.contains("3");
    }
}
