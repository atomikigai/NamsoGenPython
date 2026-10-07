package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import e6.j2;
import java.util.ArrayList;
import java.util.List;
import k6.t;
import q7.b;
import w5.w;
import z5.c;
import z5.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbqn extends zzbpu {
    private final t zza;

    public zzbqn(t tVar) {
        this.zza = tVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final boolean zzA() {
        return this.zza.f6059n;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final boolean zzB() {
        return this.zza.f6058m;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final double zze() {
        Double d10 = this.zza.f6054g;
        if (d10 != null) {
            return d10.doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final float zzf() {
        this.zza.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final float zzg() {
        this.zza.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final float zzh() {
        this.zza.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final Bundle zzi() {
        return this.zza.f6057l;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final j2 zzj() {
        j2 j2Var;
        w wVar = this.zza.f6055j;
        if (wVar == null) {
            return null;
        }
        synchronized (wVar.f9671a) {
            j2Var = wVar.f9672b;
        }
        return j2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final zzbfr zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final zzbfy zzl() {
        c cVar = this.zza.f6052d;
        if (cVar != null) {
            return new zzbfl(cVar.getDrawable(), cVar.getUri(), cVar.getScale(), cVar.zzb(), cVar.zza());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final q7.a zzm() {
        this.zza.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final q7.a zzn() {
        this.zza.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final q7.a zzo() {
        Object obj = this.zza.f6056k;
        if (obj == null) {
            return null;
        }
        return new b(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final String zzp() {
        return this.zza.f6053f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final String zzq() {
        return this.zza.f6051c;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final String zzr() {
        return this.zza.e;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final String zzs() {
        return this.zza.f6049a;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final String zzt() {
        return this.zza.i;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final String zzu() {
        return this.zza.h;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final List zzv() {
        List<c> list = this.zza.f6050b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (c cVar : list) {
                arrayList.add(new zzbfl(cVar.getDrawable(), cVar.getUri(), cVar.getScale(), cVar.zzb(), cVar.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzw(q7.a aVar) {
        this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzx() {
        this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzy(q7.a aVar, q7.a aVar2, q7.a aVar3) {
        View view = (View) b.I(aVar);
        ((com.google.ads.mediation.a) this.zza).getClass();
        if (i.f10985a.get(view) != null) {
            throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzz(q7.a aVar) {
        this.zza.getClass();
    }
}
