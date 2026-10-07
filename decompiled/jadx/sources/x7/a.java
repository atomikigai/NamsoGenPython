package x7;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.i0;
import d3.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import r.e;
import z7.a1;
import z7.a3;
import z7.b2;
import z7.d2;
import z7.d3;
import z7.t1;
import z7.u;
import z7.v;
import z7.x1;
import z7.z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f10304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f10305b;

    public a(a1 a1Var) {
        i0.i(a1Var);
        this.f10304a = a1Var;
        x1 x1Var = a1Var.A;
        a1.e(x1Var);
        this.f10305b = x1Var;
    }

    @Override // z7.y1
    public final List a(String str, String str2) {
        x1 x1Var = this.f10305b;
        a1 a1Var = (a1) x1Var.f159a;
        z0 z0Var = a1Var.f11008u;
        z7.i0 i0Var = a1Var.f11007t;
        a1.f(z0Var);
        if (z0Var.n()) {
            a1.f(i0Var);
            i0Var.f11190f.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (v.a()) {
            a1.f(i0Var);
            i0Var.f11190f.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        z0 z0Var2 = a1Var.f11008u;
        a1.f(z0Var2);
        z0Var2.h(atomicReference, 5000L, "get conditional user properties", new p(x1Var, atomicReference, str, str2, 7));
        List list = (List) atomicReference.get();
        if (list != null) {
            return d3.m(list);
        }
        a1.f(i0Var);
        i0Var.f11190f.c(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // z7.y1
    public final Map b(String str, String str2, boolean z4) {
        x1 x1Var = this.f10305b;
        a1 a1Var = (a1) x1Var.f159a;
        z0 z0Var = a1Var.f11008u;
        z7.i0 i0Var = a1Var.f11007t;
        a1.f(z0Var);
        if (z0Var.n()) {
            a1.f(i0Var);
            i0Var.f11190f.b("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (v.a()) {
            a1.f(i0Var);
            i0Var.f11190f.b("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        z0 z0Var2 = a1Var.f11008u;
        a1.f(z0Var2);
        z0Var2.h(atomicReference, 5000L, "get user properties", new t1(x1Var, atomicReference, str, str2, z4, 0));
        List<a3> list = (List) atomicReference.get();
        if (list == null) {
            a1.f(i0Var);
            i0Var.f11190f.c(Boolean.valueOf(z4), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        e eVar = new e(list.size());
        for (a3 a3Var : list) {
            Object objZza = a3Var.zza();
            if (objZza != null) {
                eVar.put(a3Var.f11015b, objZza);
            }
        }
        return eVar;
    }

    @Override // z7.y1
    public final void c(Bundle bundle) {
        x1 x1Var = this.f10305b;
        ((a1) x1Var.f159a).f11012y.getClass();
        x1Var.o(bundle, System.currentTimeMillis());
    }

    @Override // z7.y1
    public final void d(String str, String str2, Bundle bundle) {
        x1 x1Var = this.f10305b;
        ((a1) x1Var.f159a).f11012y.getClass();
        x1Var.j(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // z7.y1
    public final void e(String str, String str2, Bundle bundle) {
        x1 x1Var = this.f10304a.A;
        a1.e(x1Var);
        x1Var.g(str, str2, bundle);
    }

    @Override // z7.y1
    public final int zza(String str) {
        x1 x1Var = this.f10305b;
        x1Var.getClass();
        i0.e(str);
        ((a1) x1Var.f159a).getClass();
        return 25;
    }

    @Override // z7.y1
    public final long zzb() {
        d3 d3Var = this.f10304a.f11010w;
        a1.d(d3Var);
        return d3Var.e0();
    }

    @Override // z7.y1
    public final String zzh() {
        return this.f10305b.w();
    }

    @Override // z7.y1
    public final String zzi() {
        d2 d2Var = ((a1) this.f10305b.f159a).f11013z;
        a1.e(d2Var);
        b2 b2Var = d2Var.f11072c;
        if (b2Var != null) {
            return b2Var.f11029b;
        }
        return null;
    }

    @Override // z7.y1
    public final String zzj() {
        d2 d2Var = ((a1) this.f10305b.f159a).f11013z;
        a1.e(d2Var);
        b2 b2Var = d2Var.f11072c;
        if (b2Var != null) {
            return b2Var.f11028a;
        }
        return null;
    }

    @Override // z7.y1
    public final String zzk() {
        return this.f10305b.w();
    }

    @Override // z7.y1
    public final void zzp(String str) {
        a1 a1Var = this.f10304a;
        u uVarH = a1Var.h();
        a1Var.f11012y.getClass();
        uVarH.d(str, SystemClock.elapsedRealtime());
    }

    @Override // z7.y1
    public final void zzr(String str) {
        a1 a1Var = this.f10304a;
        u uVarH = a1Var.h();
        a1Var.f11012y.getClass();
        uVarH.e(str, SystemClock.elapsedRealtime());
    }
}
