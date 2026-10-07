package com.google.android.recaptcha.internal;

import ac.i;
import com.google.android.recaptcha.RecaptchaAction;
import ic.p;
import r7.g;
import rc.a0;
import rc.b0;
import ub.h;
import ub.k;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzat extends i implements p {
    int zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ zzbd zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzat(zzaw zzawVar, long j4, RecaptchaAction recaptchaAction, zzbd zzbdVar, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzawVar;
        this.zzc = j4;
        this.zzd = recaptchaAction;
        this.zze = zzbdVar;
        this.zzf = str;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        return new zzat(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzat) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws zzp {
        zzat zzatVar;
        a aVar = a.f11555a;
        int i = this.zza;
        g.G(obj);
        if (i != 0) {
            zzatVar = this;
            if (i == 1) {
            }
            zzol zzolVar = (zzol) obj;
            zzatVar.zzb.zzl(zzolVar, zzatVar.zze);
            zzatVar.zzb.zzi.zza(zzatVar.zze.zza(zzne.EXECUTE_TOTAL));
            return new h(zzolVar.zzi());
        }
        zzaw.zzi(this.zzb, this.zzc, this.zzd, this.zze);
        zzaw zzawVar = this.zzb;
        long j4 = this.zzc;
        String str = this.zzf;
        zzbd zzbdVar = this.zze;
        this.zza = 1;
        zzatVar = this;
        obj = zzawVar.zzj(j4, str, zzbdVar, zzatVar);
        if (obj == aVar) {
            return aVar;
        }
        zzaw zzawVar2 = zzatVar.zzb;
        RecaptchaAction recaptchaAction = zzatVar.zzd;
        zzatVar.zza = 2;
        obj = b0.y(zzawVar2.zzl.zza().b(), new zzav(zzatVar.zze, zzawVar2, recaptchaAction, (zzog) obj, null), this);
        if (obj == aVar) {
            return aVar;
        }
        zzol zzolVar2 = (zzol) obj;
        zzatVar.zzb.zzl(zzolVar2, zzatVar.zze);
        zzatVar.zzb.zzi.zza(zzatVar.zze.zza(zzne.EXECUTE_TOTAL));
        return new h(zzolVar2.zzi());
    }
}
