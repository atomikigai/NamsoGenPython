package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import i6.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import q6.c;
import q6.d;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbud {
    private final View zza;
    private final Map zzb;
    private final zzbzh zzc;

    public zzbud(zzbuc zzbucVar) {
        View view = zzbucVar.zza;
        this.zza = view;
        Map map = zzbucVar.zzb;
        this.zzb = map;
        zzbzh zzbzhVarZza = zzbtx.zza(zzbucVar.zza.getContext());
        this.zzc = zzbzhVarZza;
        if (zzbzhVarZza == null || map.isEmpty()) {
            return;
        }
        try {
            zzbzhVarZza.zzg(new zzbue(new b(view).asBinder(), new b(map).asBinder()));
        } catch (RemoteException unused) {
            h.d("Failed to call remote method.");
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            h.g("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            h.g("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzh(list, new b(this.zza), new zzbub(this, list));
        } catch (RemoteException e) {
            h.d("RemoteException recording click: ".concat(e.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            h.g("No impression urls were passed to recordImpression");
            return;
        }
        zzbzh zzbzhVar = this.zzc;
        if (zzbzhVar == null) {
            h.g("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            zzbzhVar.zzi(list, new b(this.zza), new zzbua(this, list));
        } catch (RemoteException e) {
            h.d("RemoteException recording impression urls: ".concat(e.toString()));
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbzh zzbzhVar = this.zzc;
        if (zzbzhVar == null) {
            h.b("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzbzhVar.zzk(new b(motionEvent));
        } catch (RemoteException unused) {
            h.d("Failed to call remote method.");
        }
    }

    public final void zzd(Uri uri, c cVar) {
        this.zzc.getClass();
        try {
            this.zzc.zzl(new ArrayList(Arrays.asList(uri)), new b(this.zza), new zzbtz(this, cVar));
        } catch (RemoteException e) {
            "Internal error: ".concat(e.toString());
            throw null;
        }
    }

    public final void zze(List list, d dVar) {
        this.zzc.getClass();
        try {
            this.zzc.zzm(list, new b(this.zza), new zzbty(this, dVar));
        } catch (RemoteException e) {
            "Internal error: ".concat(e.toString());
            throw null;
        }
    }
}
