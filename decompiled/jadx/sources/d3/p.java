package d3;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import o6.c0;
import z7.a1;
import z7.b0;
import z7.d3;
import z7.i0;
import z7.k2;
import z7.x1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2845d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2842a = i;
        this.e = obj;
        this.f2843b = obj2;
        this.f2844c = obj3;
        this.f2845d = obj4;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:91:0x0089). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2842a) {
            case 0:
                e3.k kVar = (e3.k) this.f2845d;
                UUID uuid = (UUID) this.f2843b;
                String string = uuid.toString();
                t2.m mVarD = t2.m.d();
                String str = q.f2846c;
                t2.f fVar = (t2.f) this.f2844c;
                mVarD.a(str, "Updating progress for " + uuid + " (" + fVar + ")", new Throwable[0]);
                q qVar = (q) this.e;
                WorkDatabase workDatabase = qVar.f2847a;
                WorkDatabase workDatabase2 = qVar.f2847a;
                workDatabase.c();
                try {
                    c3.i iVarL = workDatabase2.x().l(string);
                    if (iVarL == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (iVarL.f1745b == 2) {
                        c3.g gVar = new c3.g(string, fVar);
                        gb.r rVarW = workDatabase2.w();
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) rVarW.f4493a;
                        workDatabase_Impl.b();
                        workDatabase_Impl.c();
                        try {
                            ((c3.b) rVarW.f4494b).m(gVar);
                            workDatabase_Impl.q();
                            workDatabase_Impl.n();
                        } catch (Throwable th) {
                            workDatabase_Impl.n();
                            throw th;
                        }
                    } else {
                        t2.m.d().h(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.", new Throwable[0]);
                    }
                    kVar.h(null);
                    workDatabase2.q();
                } catch (Throwable th2) {
                    try {
                        t2.m.d().b(q.f2846c, "Error updating Worker progress", th2);
                        kVar.i(th2);
                    } finally {
                        workDatabase2.n();
                    }
                    break;
                }
                return;
            case 1:
                Context context = (Context) this.f2843b;
                try {
                    new zzbml(context, (String) this.f2844c).zza(((w5.g) this.f2845d).f9647a, (j6.b) this.e);
                    return;
                } catch (IllegalStateException e) {
                    zzbuj.zza(context).zzh(e, "InterstitialAd.load");
                    return;
                }
            case 2:
                k.f fVar2 = (k.f) ((a5.b) this.e).f188b;
                k.n nVar = (k.n) this.f2844c;
                k.e eVar = (k.e) this.f2843b;
                if (eVar != null) {
                    fVar2.K = true;
                    eVar.f5834b.c(false);
                    fVar2.K = false;
                }
                if (nVar.isEnabled() && nVar.hasSubMenu()) {
                    ((k.l) this.f2845d).q(nVar, null, 4);
                    return;
                }
                return;
            case 3:
                c0 c0Var = (c0) this.f2843b;
                zzdsh zzdshVar = (zzdsh) this.f2844c;
                ArrayDeque arrayDeque = (ArrayDeque) this.f2845d;
                ArrayDeque arrayDeque2 = (ArrayDeque) this.e;
                c0Var.c(zzdshVar, arrayDeque, "to");
                c0Var.c(zzdshVar, arrayDeque2, "of");
                return;
            case 4:
                Context context2 = (Context) this.f2843b;
                try {
                    new zzbxl(context2, (String) this.f2844c).zzb(((w5.g) this.f2845d).f9647a, (r6.d) this.e);
                    return;
                } catch (IllegalStateException e4) {
                    zzbuj.zza(context2).zzh(e4, "RewardedAd.load");
                    return;
                }
            case 5:
                Context context3 = (Context) this.f2843b;
                try {
                    new zzbxw(context3, (String) this.f2844c).zza(((w5.g) this.f2845d).f9647a, (s6.b) this.e);
                    return;
                } catch (IllegalStateException e10) {
                    zzbuj.zza(context3).zzh(e10, "RewardedInterstitialAd.load");
                    return;
                }
            case 6:
                Context context4 = (Context) this.f2843b;
                try {
                    new zzban(context4, (String) this.f2844c, ((w5.g) this.f2845d).f9647a, 3, (y5.a) this.e).zza();
                    return;
                } catch (IllegalStateException e11) {
                    zzbuj.zza(context4).zzh(e11, "AppOpenAd.load");
                    return;
                }
            case 7:
                k2 k2VarN = ((a1) ((x1) this.e).f159a).n();
                AtomicReference atomicReference = (AtomicReference) this.f2843b;
                String str2 = (String) this.f2844c;
                String str3 = (String) this.f2845d;
                k2VarN.c();
                k2VarN.d();
                k2VarN.p(new n(k2VarN, atomicReference, str2, str3, k2VarN.m(false), 1));
                return;
            case 8:
                k2 k2VarN2 = ((AppMeasurementDynamiteService) this.e).f2316a.n();
                zzcf zzcfVar = (zzcf) this.f2843b;
                z7.q qVar2 = (z7.q) this.f2844c;
                String str4 = (String) this.f2845d;
                k2VarN2.c();
                k2VarN2.d();
                a1 a1Var = (a1) k2VarN2.f159a;
                d3 d3Var = a1Var.f11010w;
                a1.d(d3Var);
                if (g7.f.f4241b.d(((a1) d3Var.f159a).f11000a, 12451000) == 0) {
                    k2VarN2.p(new p(k2VarN2, qVar2, str4, zzcfVar, 9));
                    return;
                }
                i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11193t.b("Not bundling data. Service unavailable or out of date");
                d3 d3Var2 = a1Var.f11010w;
                a1.d(d3Var2);
                d3Var2.y(zzcfVar, new byte[0]);
                return;
            case 9:
                zzcf zzcfVar2 = (zzcf) this.f2845d;
                k2 k2Var = (k2) this.e;
                a1 a1Var2 = (a1) k2Var.f159a;
                byte[] bArrS = null;
                try {
                    try {
                        b0 b0Var = k2Var.f11238d;
                        if (b0Var == null) {
                            i0 i0Var2 = a1Var2.f11007t;
                            a1.f(i0Var2);
                            i0Var2.f11190f.b("Discarding data. Failed to send event to service to bundle");
                            d3 d3Var3 = a1Var2.f11010w;
                            a1.d(d3Var3);
                            d3Var3.y(zzcfVar2, null);
                        } else {
                            bArrS = b0Var.s((z7.q) this.f2843b, (String) this.f2844c);
                            k2Var.o();
                            d3 d3Var4 = a1Var2.f11010w;
                            a1.d(d3Var4);
                            d3Var4.y(zzcfVar2, bArrS);
                        }
                    } catch (Throwable th3) {
                        d3 d3Var5 = a1Var2.f11010w;
                        a1.d(d3Var5);
                        d3Var5.y(zzcfVar2, bArrS);
                        throw th3;
                    }
                } catch (RemoteException e12) {
                    i0 i0Var3 = a1Var2.f11007t;
                    a1.f(i0Var3);
                    i0Var3.f11190f.c(e12, "Failed to send event to the service to bundle");
                    d3 d3Var6 = a1Var2.f11010w;
                    a1.d(d3Var6);
                    d3Var6.y(zzcfVar2, bArrS);
                }
                return;
            default:
                k2 k2VarN3 = ((AppMeasurementDynamiteService) this.e).f2316a.n();
                zzcf zzcfVar3 = (zzcf) this.f2843b;
                String str5 = (String) this.f2844c;
                String str6 = (String) this.f2845d;
                k2VarN3.c();
                k2VarN3.d();
                k2VarN3.p(new n(k2VarN3, str5, str6, k2VarN3.m(false), zzcfVar3, 2));
                return;
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z4) {
        this.f2842a = i;
        this.f2843b = obj;
        this.f2844c = obj2;
        this.f2845d = obj3;
        this.e = obj4;
    }
}
