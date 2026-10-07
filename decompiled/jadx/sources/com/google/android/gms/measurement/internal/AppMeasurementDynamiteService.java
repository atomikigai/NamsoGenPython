package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcl;
import d3.p;
import gb.k;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import q7.a;
import q7.b;
import r.e;
import y9.j;
import z7.a1;
import z7.b2;
import z7.d2;
import z7.d3;
import z7.e3;
import z7.i0;
import z7.k1;
import z7.l1;
import z7.m1;
import z7.o1;
import z7.q;
import z7.q1;
import z7.s1;
import z7.t1;
import z7.u1;
import z7.x1;
import z7.z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends zzcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a1 f2316a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f2317b = new e(0);

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(String str, long j4) throws RemoteException {
        zzb();
        this.f2316a.h().d(str, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        x1Var.g(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        x1Var.d();
        z0 z0Var = ((a1) x1Var.f159a).f11008u;
        a1.f(z0Var);
        z0Var.l(new j(8, x1Var, (Object) null));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(String str, long j4) throws RemoteException {
        zzb();
        this.f2316a.h().e(str, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(zzcf zzcfVar) throws RemoteException {
        zzb();
        d3 d3Var = this.f2316a.f11010w;
        a1.d(d3Var);
        long jE0 = d3Var.e0();
        zzb();
        d3 d3Var2 = this.f2316a.f11010w;
        a1.d(d3Var2);
        d3Var2.A(zzcfVar, jE0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(zzcf zzcfVar) throws RemoteException {
        zzb();
        z0 z0Var = this.f2316a.f11008u;
        a1.f(z0Var);
        z0Var.l(new u1(this, zzcfVar, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(zzcf zzcfVar) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        y(x1Var.w(), zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) throws RemoteException {
        zzb();
        z0 z0Var = this.f2316a.f11008u;
        a1.f(z0Var);
        z0Var.l(new p(this, zzcfVar, str, str2, 10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(zzcf zzcfVar) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        d2 d2Var = ((a1) x1Var.f159a).f11013z;
        a1.e(d2Var);
        b2 b2Var = d2Var.f11072c;
        y(b2Var != null ? b2Var.f11029b : null, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(zzcf zzcfVar) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        d2 d2Var = ((a1) x1Var.f159a).f11013z;
        a1.e(d2Var);
        b2 b2Var = d2Var.f11072c;
        y(b2Var != null ? b2Var.f11028a : null, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(zzcf zzcfVar) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        a1 a1Var = (a1) x1Var.f159a;
        String strI = a1Var.f11001b;
        if (strI == null) {
            try {
                strI = k1.i(a1Var.f11000a, a1Var.D);
            } catch (IllegalStateException e) {
                i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11190f.c(e, "getGoogleAppId failed with exception");
                strI = null;
            }
        }
        y(strI, zzcfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String str, zzcf zzcfVar) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        com.google.android.gms.common.internal.i0.e(str);
        ((a1) x1Var.f159a).getClass();
        zzb();
        d3 d3Var = this.f2316a.f11010w;
        a1.d(d3Var);
        d3Var.z(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getSessionId(zzcf zzcfVar) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        z0 z0Var = ((a1) x1Var.f159a).f11008u;
        a1.f(z0Var);
        z0Var.l(new j(7, x1Var, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(zzcf zzcfVar, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            d3 d3Var = this.f2316a.f11010w;
            a1.d(d3Var);
            x1 x1Var = this.f2316a.A;
            a1.e(x1Var);
            AtomicReference atomicReference = new AtomicReference();
            z0 z0Var = ((a1) x1Var.f159a).f11008u;
            a1.f(z0Var);
            d3Var.B((String) z0Var.h(atomicReference, 15000L, "String test flag value", new s1(x1Var, atomicReference, 1)), zzcfVar);
            return;
        }
        if (i == 1) {
            d3 d3Var2 = this.f2316a.f11010w;
            a1.d(d3Var2);
            x1 x1Var2 = this.f2316a.A;
            a1.e(x1Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            z0 z0Var2 = ((a1) x1Var2.f159a).f11008u;
            a1.f(z0Var2);
            d3Var2.A(zzcfVar, ((Long) z0Var2.h(atomicReference2, 15000L, "long test flag value", new s1(x1Var2, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            d3 d3Var3 = this.f2316a.f11010w;
            a1.d(d3Var3);
            x1 x1Var3 = this.f2316a.A;
            a1.e(x1Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            z0 z0Var3 = ((a1) x1Var3.f159a).f11008u;
            a1.f(z0Var3);
            double dDoubleValue = ((Double) z0Var3.h(atomicReference3, 15000L, "double test flag value", new s1(x1Var3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                zzcfVar.zze(bundle);
                return;
            } catch (RemoteException e) {
                i0 i0Var = ((a1) d3Var3.f159a).f11007t;
                a1.f(i0Var);
                i0Var.f11193t.c(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            d3 d3Var4 = this.f2316a.f11010w;
            a1.d(d3Var4);
            x1 x1Var4 = this.f2316a.A;
            a1.e(x1Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            z0 z0Var4 = ((a1) x1Var4.f159a).f11008u;
            a1.f(z0Var4);
            d3Var4.z(zzcfVar, ((Integer) z0Var4.h(atomicReference4, 15000L, "int test flag value", new s1(x1Var4, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        d3 d3Var5 = this.f2316a.f11010w;
        a1.d(d3Var5);
        x1 x1Var5 = this.f2316a.A;
        a1.e(x1Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        z0 z0Var5 = ((a1) x1Var5.f159a).f11008u;
        a1.f(z0Var5);
        d3Var5.v(zzcfVar, ((Boolean) z0Var5.h(atomicReference5, 15000L, "boolean test flag value", new s1(x1Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z4, zzcf zzcfVar) throws RemoteException {
        zzb();
        z0 z0Var = this.f2316a.f11008u;
        a1.f(z0Var);
        z0Var.l(new t1(this, zzcfVar, str, str2, z4, 2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(a aVar, zzcl zzclVar, long j4) throws RemoteException {
        a1 a1Var = this.f2316a;
        if (a1Var == null) {
            Context context = (Context) b.I(aVar);
            com.google.android.gms.common.internal.i0.i(context);
            this.f2316a = a1.m(context, zzclVar, Long.valueOf(j4));
        } else {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11193t.b("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(zzcf zzcfVar) throws RemoteException {
        zzb();
        z0 z0Var = this.f2316a.f11008u;
        a1.f(z0Var);
        z0Var.l(new u1(this, zzcfVar, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(String str, String str2, Bundle bundle, boolean z4, boolean z10, long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        x1Var.j(str, str2, bundle, z4, z10, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j4) throws RemoteException {
        zzb();
        com.google.android.gms.common.internal.i0.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        q qVar = new q(str2, new z7.p(bundle), "app", j4);
        z0 z0Var = this.f2316a.f11008u;
        a1.f(z0Var);
        z0Var.l(new p(this, zzcfVar, qVar, str, 8));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i, String str, a aVar, a aVar2, a aVar3) throws RemoteException {
        zzb();
        Object objI = aVar == null ? null : b.I(aVar);
        Object objI2 = aVar2 == null ? null : b.I(aVar2);
        Object objI3 = aVar3 != null ? b.I(aVar3) : null;
        i0 i0Var = this.f2316a.f11007t;
        a1.f(i0Var);
        i0Var.p(i, true, false, str, objI, objI2, objI3);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(a aVar, Bundle bundle, long j4) throws Throwable {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        k kVar = x1Var.f11424c;
        if (kVar != null) {
            x1 x1Var2 = this.f2316a.A;
            a1.e(x1Var2);
            x1Var2.h();
            kVar.onActivityCreated((Activity) b.I(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(a aVar, long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        k kVar = x1Var.f11424c;
        if (kVar != null) {
            x1 x1Var2 = this.f2316a.A;
            a1.e(x1Var2);
            x1Var2.h();
            kVar.onActivityDestroyed((Activity) b.I(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(a aVar, long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        k kVar = x1Var.f11424c;
        if (kVar != null) {
            x1 x1Var2 = this.f2316a.A;
            a1.e(x1Var2);
            x1Var2.h();
            kVar.onActivityPaused((Activity) b.I(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(a aVar, long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        k kVar = x1Var.f11424c;
        if (kVar != null) {
            x1 x1Var2 = this.f2316a.A;
            a1.e(x1Var2);
            x1Var2.h();
            kVar.onActivityResumed((Activity) b.I(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(a aVar, zzcf zzcfVar, long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        k kVar = x1Var.f11424c;
        Bundle bundle = new Bundle();
        if (kVar != null) {
            x1 x1Var2 = this.f2316a.A;
            a1.e(x1Var2);
            x1Var2.h();
            kVar.onActivitySaveInstanceState((Activity) b.I(aVar), bundle);
        }
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            i0 i0Var = this.f2316a.f11007t;
            a1.f(i0Var);
            i0Var.f11193t.c(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(a aVar, long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        if (x1Var.f11424c != null) {
            x1 x1Var2 = this.f2316a.A;
            a1.e(x1Var2);
            x1Var2.h();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(a aVar, long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        if (x1Var.f11424c != null) {
            x1 x1Var2 = this.f2316a.A;
            a1.e(x1Var2);
            x1Var2.h();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, zzcf zzcfVar, long j4) throws RemoteException {
        zzb();
        zzcfVar.zze(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Object e3Var;
        zzb();
        synchronized (this.f2317b) {
            try {
                e3Var = (m1) this.f2317b.get(Integer.valueOf(zzciVar.zzd()));
                if (e3Var == null) {
                    e3Var = new e3(this, zzciVar);
                    this.f2317b.put(Integer.valueOf(zzciVar.zzd()), e3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        x1Var.d();
        if (x1Var.e.add(e3Var)) {
            return;
        }
        i0 i0Var = ((a1) x1Var.f159a).f11007t;
        a1.f(i0Var);
        i0Var.f11193t.b("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        x1Var.f11427r.set(null);
        z0 z0Var = ((a1) x1Var.f159a).f11008u;
        a1.f(z0Var);
        z0Var.l(new q1(x1Var, j4, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(Bundle bundle, long j4) throws RemoteException {
        zzb();
        if (bundle == null) {
            i0 i0Var = this.f2316a.f11007t;
            a1.f(i0Var);
            i0Var.f11190f.b("Conditional user property must not be null");
        } else {
            x1 x1Var = this.f2316a.A;
            a1.e(x1Var);
            x1Var.o(bundle, j4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(Bundle bundle, long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        z0 z0Var = ((a1) x1Var.f159a).f11008u;
        a1.f(z0Var);
        z0Var.m(new q3.j(x1Var, bundle, j4));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(Bundle bundle, long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        x1Var.q(bundle, -20, j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        if (r0 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
    
        if (r0 <= 100) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.zzcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreen(q7.a r3, java.lang.String r4, java.lang.String r5, long r6) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(q7.a, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        x1Var.d();
        z0 z0Var = ((a1) x1Var.f159a).f11008u;
        a1.f(z0Var);
        z0Var.l(new com.bumptech.glide.manager.p(x1Var, z4, 3));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        z0 z0Var = ((a1) x1Var.f159a).f11008u;
        a1.f(z0Var);
        z0Var.l(new o1(x1Var, bundle2, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(zzci zzciVar) throws RemoteException {
        zzb();
        s5.j jVar = new s5.j(this, zzciVar, 26, false);
        z0 z0Var = this.f2316a.f11008u;
        a1.f(z0Var);
        if (!z0Var.n()) {
            z0 z0Var2 = this.f2316a.f11008u;
            a1.f(z0Var2);
            z0Var2.l(new j(12, this, jVar));
            return;
        }
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        x1Var.c();
        x1Var.d();
        l1 l1Var = x1Var.f11425d;
        if (jVar != l1Var) {
            com.google.android.gms.common.internal.i0.k("EventInterceptor already set.", l1Var == null);
        }
        x1Var.f11425d = jVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(zzck zzckVar) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z4, long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        Boolean boolValueOf = Boolean.valueOf(z4);
        x1Var.d();
        z0 z0Var = ((a1) x1Var.f159a).f11008u;
        a1.f(z0Var);
        z0Var.l(new j(8, x1Var, boolValueOf));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j4) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        z0 z0Var = ((a1) x1Var.f159a).f11008u;
        a1.f(z0Var);
        z0Var.l(new q1(x1Var, j4, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(String str, long j4) throws RemoteException {
        zzb();
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        a1 a1Var = (a1) x1Var.f159a;
        if (str != null && TextUtils.isEmpty(str)) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11193t.b("User ID must be non-empty or null");
        } else {
            z0 z0Var = a1Var.f11008u;
            a1.f(z0Var);
            z0Var.l(new j(x1Var, str));
            x1Var.s(null, "_id", str, true, j4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(String str, String str2, a aVar, boolean z4, long j4) throws RemoteException {
        zzb();
        Object objI = b.I(aVar);
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        x1Var.s(str, str2, objI, z4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Object e3Var;
        zzb();
        synchronized (this.f2317b) {
            e3Var = (m1) this.f2317b.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (e3Var == null) {
            e3Var = new e3(this, zzciVar);
        }
        x1 x1Var = this.f2316a.A;
        a1.e(x1Var);
        x1Var.d();
        if (x1Var.e.remove(e3Var)) {
            return;
        }
        i0 i0Var = ((a1) x1Var.f159a).f11007t;
        a1.f(i0Var);
        i0Var.f11193t.b("OnEventListener had not been registered");
    }

    public final void y(String str, zzcf zzcfVar) {
        zzb();
        d3 d3Var = this.f2316a.f11010w;
        a1.d(d3Var);
        d3Var.B(str, zzcfVar);
    }

    public final void zzb() {
        if (this.f2316a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}
