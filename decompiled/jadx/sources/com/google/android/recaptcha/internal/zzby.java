package com.google.android.recaptcha.internal;

import ac.i;
import ic.p;
import java.util.Arrays;
import jc.r;
import r7.g;
import rc.a0;
import rc.b1;
import rc.y;
import ub.k;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzby extends i implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzcj zzb;
    final /* synthetic */ zzca zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzby(Exception exc, zzcj zzcjVar, zzca zzcaVar, d dVar) {
        super(2, dVar);
        this.zza = exc;
        this.zzb = zzcjVar;
        this.zzc = zzcaVar;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        zzby zzbyVar = new zzby(this.zza, this.zzb, this.zzc, dVar);
        zzbyVar.zzd = obj;
        return zzbyVar;
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzby) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        zzpg zzpgVarZza;
        a aVar = a.f11555a;
        g.G(obj);
        a0 a0Var = (a0) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzae) {
            zzpgVarZza = ((zzae) exc).zza();
            zzpgVarZza.zzd(this.zzb.zza());
        } else {
            zzcj zzcjVar = this.zzb;
            zzpg zzpgVarZzf = zzph.zzf();
            zzpgVarZzf.zzd(zzcjVar.zza());
            zzpgVarZzf.zzp(2);
            zzpgVarZzf.zze(2);
            zzpgVarZza = zzpgVarZzf;
        }
        zzph zzphVar = (zzph) zzpgVarZza.zzj();
        zzphVar.zzk();
        zzphVar.zzj();
        r.a(this.zza.getClass()).c();
        this.zza.getMessage();
        zzcj zzcjVar2 = this.zzb;
        zzz zzzVarZzb = zzcjVar2.zzb();
        zzz zzzVar = zzcjVar2.zza;
        if (zzzVar == null) {
            zzzVar = null;
        }
        zzno zznoVarZza = zzbp.zza(zzzVarZzb, zzzVar);
        String strZzd = this.zzb.zzd();
        if (strZzd.length() == 0) {
            strZzd = "recaptcha.m.Main.rge";
        }
        b1 b1Var = (b1) a0Var.b().H(y.f8337b);
        if (b1Var != null ? b1Var.c() : true) {
            zzca zzcaVar = this.zzc;
            zzfy zzfyVarZzh = zzfy.zzh();
            byte[] bArrZzd = zzphVar.zzd();
            String strZzi = zzfyVarZzh.zzi(bArrZzd, 0, bArrZzd.length);
            zzfy zzfyVarZzh2 = zzfy.zzh();
            byte[] bArrZzd2 = zznoVarZza.zzd();
            zzcaVar.zzc.zze().zzb(strZzd, (String[]) Arrays.copyOf(new String[]{strZzi, zzfyVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length)}, 2));
        }
        return k.f9073a;
    }
}
