package com.google.android.recaptcha.internal;

import ac.i;
import com.google.android.recaptcha.RecaptchaAction;
import ic.p;
import r7.g;
import rc.a0;
import ub.h;
import ub.k;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaq extends i implements p {
    int zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaq(zzaw zzawVar, RecaptchaAction recaptchaAction, long j4, d dVar) {
        super(2, dVar);
        this.zzb = zzawVar;
        this.zzc = recaptchaAction;
        this.zzd = j4;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        return new zzaq(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZzk;
        a aVar = a.f11555a;
        int i = this.zza;
        g.G(obj);
        if (i != 0) {
            objZzk = ((h) obj).f9068a;
        } else {
            zzaw zzawVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j4 = this.zzd;
            this.zza = 1;
            objZzk = zzawVar.zzk(recaptchaAction, j4, this);
            if (objZzk == aVar) {
                return aVar;
            }
        }
        return new h(objZzk);
    }
}
