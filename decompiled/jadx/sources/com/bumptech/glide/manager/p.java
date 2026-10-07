package com.bumptech.glide.manager;

import android.content.Context;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzarj;
import com.google.android.gms.internal.ads.zzauu;
import o6.x;
import z7.a1;
import z7.i0;
import z7.x1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1931c;

    public /* synthetic */ p(Object obj, boolean z4, int i) {
        this.f1929a = i;
        this.f1931c = obj;
        this.f1930b = z4;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1929a) {
            case 0:
                a3.g gVar = (a3.g) this.f1931c;
                boolean z4 = this.f1930b;
                p4.n.a();
                q qVar = (q) gVar.f105b;
                boolean z10 = qVar.f1932a;
                qVar.f1932a = z4;
                if (z10 != z4) {
                    ((o) qVar.f1933b).a(z4);
                }
                break;
            case 1:
                d6.h hVar = (d6.h) this.f1931c;
                boolean z11 = this.f1930b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    Context context = hVar.f2948u;
                    i6.a aVar = hVar.f2950w;
                    boolean z12 = hVar.f2951x;
                    zzarh zzarhVarZza = zzarj.zza();
                    zzarhVarZza.zza(z11);
                    zzarhVarZza.zzb(aVar.f5213a);
                    zzarj zzarjVar = (zzarj) zzarhVarZza.zzbr();
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    zzauu.zza(context, zzarjVar, z12).zzp();
                } catch (NullPointerException e) {
                    hVar.f2946s.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
                    return;
                }
                break;
            case 2:
                ((x) this.f1931c).e(this.f1930b, false);
                break;
            default:
                boolean zB = ((a1) ((x1) this.f1931c).f159a).b();
                a1 a1Var = (a1) ((x1) this.f1931c).f159a;
                boolean z13 = false;
                boolean z14 = a1Var.L != null && a1Var.L.booleanValue();
                ((a1) ((x1) this.f1931c).f159a).L = Boolean.valueOf(this.f1930b);
                if (z14 == this.f1930b) {
                    i0 i0Var = ((a1) ((x1) this.f1931c).f159a).f11007t;
                    a1.f(i0Var);
                    i0Var.f11198y.c(Boolean.valueOf(this.f1930b), "Default data collection state already set to");
                }
                if (((a1) ((x1) this.f1931c).f159a).b() != zB) {
                    boolean zB2 = ((a1) ((x1) this.f1931c).f159a).b();
                    a1 a1Var2 = (a1) ((x1) this.f1931c).f159a;
                    if (a1Var2.L != null && a1Var2.L.booleanValue()) {
                        z13 = true;
                    }
                    if (zB2 != z13) {
                        i0 i0Var2 = ((a1) ((x1) this.f1931c).f159a).f11007t;
                        a1.f(i0Var2);
                        i0Var2.f11195v.d(Boolean.valueOf(this.f1930b), "Default data collection is different than actual status", Boolean.valueOf(zB));
                    }
                } else {
                    i0 i0Var3 = ((a1) ((x1) this.f1931c).f159a).f11007t;
                    a1.f(i0Var3);
                    i0Var3.f11195v.d(Boolean.valueOf(this.f1930b), "Default data collection is different than actual status", Boolean.valueOf(zB));
                }
                ((x1) this.f1931c).v();
                break;
        }
    }
}
