package com.google.android.recaptcha.internal;

import ac.i;
import android.app.Application;
import android.webkit.WebView;
import ic.p;
import java.util.ArrayList;
import java.util.List;
import oc.f;
import r7.g;
import rc.a0;
import rc.b0;
import rc.b1;
import rc.k1;
import rc.l1;
import rc.y;
import ub.h;
import ub.k;
import vb.q;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaj extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ Application zzc;
    final /* synthetic */ zzab zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzbq zzf;
    final /* synthetic */ zzbd zzg;
    final /* synthetic */ zzbg zzh;
    final /* synthetic */ long zzi;
    final /* synthetic */ zzt zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(Application application, zzab zzabVar, String str, zzbq zzbqVar, zzbd zzbdVar, zzt zztVar, WebView webView, zzbg zzbgVar, long j4, d dVar) {
        super(2, dVar);
        this.zzc = application;
        this.zzd = zzabVar;
        this.zze = str;
        this.zzf = zzbqVar;
        this.zzg = zzbdVar;
        this.zzj = zztVar;
        this.zzh = zzbgVar;
        this.zzi = j4;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        return new zzaj(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzj, null, this.zzh, this.zzi, dVar);
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaj) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0094  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d9 A[LOOP:0: B:22:0x00d3->B:24:0x00d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:29:0x0104  */
    /* JADX WARN: Code duplicated, block: B:30:0x0107  */
    /* JADX WARN: Code duplicated, block: B:32:0x0111  */
    /* JADX WARN: Code duplicated, block: B:33:0x0116  */
    /* JADX WARN: Code duplicated, block: B:36:0x0124 A[LOOP:1: B:34:0x011e->B:36:0x0124, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0139  */
    /* JADX WARN: Code duplicated, block: B:44:0x0145  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x0145, please report this as an issue */
    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objY;
        zzoe zzoeVar;
        Object objZzb;
        Throwable th;
        zzoe zzoeVar2;
        zzt zztVar;
        Throwable thA;
        b1 b1Var;
        yb.i iVarB;
        b1 b1Var2;
        f fVarT;
        Object next;
        ArrayList arrayList;
        List listD;
        f fVarT2;
        y yVar = y.f8337b;
        a aVar = a.f11555a;
        int i = this.zzb;
        if (i == 0) {
            g.G(obj);
            zzam zzamVar = zzam.zza;
            Application application = this.zzc;
            zzab zzabVar = this.zzd;
            String str = this.zze;
            zzbq zzbqVar = this.zzf;
            zzbd zzbdVar = this.zzg;
            zzt zztVar2 = this.zzj;
            this.zzb = 1;
            objY = b0.y(zztVar2.zza().b(), new zzal(application, str, zzbdVar, zzbqVar, zzabVar, null), this);
            if (objY != aVar) {
            }
            return aVar;
        }
        if (i == 1) {
            g.G(obj);
            objY = obj;
        } else {
            if (i == 2) {
                zzoeVar = (zzoe) this.zza;
                g.G(obj);
                objZzb = ((h) obj).f9068a;
                zzoeVar2 = zzoeVar;
                zztVar = this.zzj;
                thA = h.a(objZzb);
                if (thA == null) {
                    Application application2 = this.zzc;
                    zzam zzamVar2 = zzam.zza;
                    return new zzaw(application2, zzam.zze(), this.zze, this.zzj, this.zzd, zzoeVar2, this.zzg, this.zzh, new zzq(application2), new zzbs());
                }
                b1Var = (b1) zztVar.zzc().b().H(yVar);
                if (b1Var != null) {
                    fVarT2 = com.bumptech.glide.d.t(new k1((l1) b1Var, null));
                    while (fVarT2.hasNext()) {
                        ((b1) fVarT2.next()).d(null);
                    }
                }
                iVarB = zztVar.zzc().b();
                b1Var2 = (b1) iVarB.H(yVar);
                if (b1Var2 != null) {
                    throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVarB).toString());
                }
                fVarT = com.bumptech.glide.d.t(new k1((l1) b1Var2, null));
                if (fVarT.hasNext()) {
                    next = fVarT.next();
                    if (fVarT.hasNext()) {
                        arrayList = new ArrayList();
                        arrayList.add(next);
                        while (fVarT.hasNext()) {
                            arrayList.add(fVarT.next());
                        }
                        listD = arrayList;
                    } else {
                        listD = jd.d.D(next);
                    }
                } else {
                    listD = q.f9297a;
                }
                this.zza = thA;
                this.zzb = 3;
                if (b0.p(listD, this) != aVar) {
                    th = thA;
                }
                return aVar;
            }
            th = (Throwable) this.zza;
            g.G(obj);
        }
        zzam zzamVar3 = zzam.zza;
        zzam.zzf(new zzg(null, 1, null));
        throw th;
        zzoeVar = (zzoe) objY;
        zzam.zze().zzd(new zzez(new WebView(this.zzc), this.zze, this.zzc, this.zzd, this.zzg, this.zzj, this.zzh, this.zzf));
        long j4 = this.zzi;
        zzg zzgVarZze = zzam.zze();
        this.zza = zzoeVar;
        this.zzb = 2;
        objZzb = zzgVarZze.zzb(j4, zzoeVar, this);
        if (objZzb != aVar) {
            zzoeVar2 = zzoeVar;
            zztVar = this.zzj;
            thA = h.a(objZzb);
            if (thA == null) {
                Application application3 = this.zzc;
                zzam zzamVar4 = zzam.zza;
                return new zzaw(application3, zzam.zze(), this.zze, this.zzj, this.zzd, zzoeVar2, this.zzg, this.zzh, new zzq(application3), new zzbs());
            }
            b1Var = (b1) zztVar.zzc().b().H(yVar);
            if (b1Var != null) {
                fVarT2 = com.bumptech.glide.d.t(new k1((l1) b1Var, null));
                while (fVarT2.hasNext()) {
                    ((b1) fVarT2.next()).d(null);
                }
            }
            iVarB = zztVar.zzc().b();
            b1Var2 = (b1) iVarB.H(yVar);
            if (b1Var2 != null) {
                throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVarB).toString());
            }
            fVarT = com.bumptech.glide.d.t(new k1((l1) b1Var2, null));
            if (fVarT.hasNext()) {
                listD = q.f9297a;
            } else {
                next = fVarT.next();
                if (fVarT.hasNext()) {
                    listD = jd.d.D(next);
                } else {
                    arrayList = new ArrayList();
                    arrayList.add(next);
                    while (fVarT.hasNext()) {
                        arrayList.add(fVarT.next());
                    }
                    listD = arrayList;
                }
            }
            this.zza = thA;
            this.zzb = 3;
            if (b0.p(listD, this) != aVar) {
                th = thA;
                zzam zzamVar5 = zzam.zza;
                zzam.zzf(new zzg(null, 1, null));
                throw th;
            }
        }
        return aVar;
    }
}
