package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.i0;
import e6.c1;
import e6.l3;
import e6.o3;
import e6.q3;
import e6.u3;
import e6.z0;
import java.util.ArrayList;
import z5.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzffm {
    private o3 zza;
    private q3 zzb;
    private String zzc;
    private l3 zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbfn zzh;
    private u3 zzi;
    private z5.a zzj;
    private g zzk;
    private z0 zzl;
    private zzbmb zzn;
    private zzems zzr;
    private Bundle zzt;
    private c1 zzu;
    private int zzm = 1;
    private final zzfez zzo = new zzfez();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;

    public final zzffm zzA(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzffm zzB(boolean z4) {
        this.zze = z4;
        return this;
    }

    public final zzffm zzC(int i) {
        this.zzm = i;
        return this;
    }

    public final zzffm zzD(zzbfn zzbfnVar) {
        this.zzh = zzbfnVar;
        return this;
    }

    public final zzffm zzE(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzffm zzF(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzffm zzG(g gVar) {
        this.zzk = gVar;
        if (gVar != null) {
            this.zze = gVar.f10982a;
            this.zzl = gVar.f10983b;
        }
        return this;
    }

    public final zzffm zzH(o3 o3Var) {
        this.zza = o3Var;
        return this;
    }

    public final zzffm zzI(l3 l3Var) {
        this.zzd = l3Var;
        return this;
    }

    public final zzffo zzJ() {
        i0.j(this.zzc, "ad unit must not be null");
        i0.j(this.zzb, "ad size must not be null");
        i0.j(this.zza, "ad request must not be null");
        return new zzffo(this, null);
    }

    public final String zzL() {
        return this.zzc;
    }

    public final boolean zzS() {
        return this.zzp;
    }

    public final boolean zzT() {
        return this.zzq;
    }

    public final zzffm zzV(c1 c1Var) {
        this.zzu = c1Var;
        return this;
    }

    public final o3 zzf() {
        return this.zza;
    }

    public final q3 zzh() {
        return this.zzb;
    }

    public final zzfez zzp() {
        return this.zzo;
    }

    public final zzffm zzq(zzffo zzffoVar) {
        this.zzo.zza(zzffoVar.zzo.zza);
        this.zza = zzffoVar.zzd;
        this.zzb = zzffoVar.zze;
        this.zzu = zzffoVar.zzt;
        this.zzc = zzffoVar.zzf;
        this.zzd = zzffoVar.zza;
        this.zzf = zzffoVar.zzg;
        this.zzg = zzffoVar.zzh;
        this.zzh = zzffoVar.zzi;
        this.zzi = zzffoVar.zzj;
        zzr(zzffoVar.zzl);
        zzG(zzffoVar.zzm);
        this.zzp = zzffoVar.zzp;
        this.zzq = zzffoVar.zzq;
        this.zzr = zzffoVar.zzc;
        this.zzs = zzffoVar.zzr;
        this.zzt = zzffoVar.zzs;
        return this;
    }

    public final zzffm zzr(z5.a aVar) {
        this.zzj = aVar;
        if (aVar != null) {
            this.zze = aVar.f10968a;
        }
        return this;
    }

    public final zzffm zzs(q3 q3Var) {
        this.zzb = q3Var;
        return this;
    }

    public final zzffm zzt(String str) {
        this.zzc = str;
        return this;
    }

    public final zzffm zzu(u3 u3Var) {
        this.zzi = u3Var;
        return this;
    }

    public final zzffm zzv(zzems zzemsVar) {
        this.zzr = zzemsVar;
        return this;
    }

    public final zzffm zzw(zzbmb zzbmbVar) {
        this.zzn = zzbmbVar;
        this.zzd = new l3(false, true, false);
        return this;
    }

    public final zzffm zzx(boolean z4) {
        this.zzp = z4;
        return this;
    }

    public final zzffm zzy(boolean z4) {
        this.zzq = z4;
        return this;
    }

    public final zzffm zzz(boolean z4) {
        this.zzs = true;
        return this;
    }
}
