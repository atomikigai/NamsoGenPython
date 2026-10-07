package d3;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcf;
import da.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import z7.a1;
import z7.b0;
import z7.d3;
import z7.f3;
import z7.i0;
import z7.k2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2837d;
    public final /* synthetic */ Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2838f;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f2834a = i;
        this.f2838f = obj;
        this.f2835b = obj2;
        this.f2836c = obj3;
        this.f2837d = obj4;
        this.e = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        switch (this.f2834a) {
            case 0:
                try {
                    if (!(((e3.k) this.f2835b).f3270a instanceof e3.a)) {
                        String string = ((UUID) this.f2836c).toString();
                        int i = ((o) this.f2838f).f2841c.i(string);
                        if (i == 0 || v.a(i)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((u2.b) ((o) this.f2838f).f2840b).f(string, (t2.g) this.f2837d);
                        ((Context) this.e).startService(b3.c.a((Context) this.e, string, (t2.g) this.f2837d));
                    }
                    ((e3.k) this.f2835b).h(null);
                    return;
                } catch (Throwable th) {
                    ((e3.k) this.f2835b).i(th);
                    return;
                }
            case 1:
                synchronized (((AtomicReference) this.f2835b)) {
                    try {
                        try {
                            k2 k2Var = (k2) this.f2838f;
                            b0 b0Var = k2Var.f11238d;
                            if (b0Var == null) {
                                i0 i0Var = ((a1) k2Var.f159a).f11007t;
                                a1.f(i0Var);
                                i0Var.f11190f.e("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f2836c, (String) this.f2837d);
                                ((AtomicReference) this.f2835b).set(Collections.EMPTY_LIST);
                                ((AtomicReference) this.f2835b).notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                ((AtomicReference) this.f2835b).set(b0Var.h((String) this.f2836c, (String) this.f2837d, (f3) this.e));
                            } else {
                                ((AtomicReference) this.f2835b).set(b0Var.i(null, (String) this.f2836c, (String) this.f2837d));
                            }
                            ((k2) this.f2838f).o();
                            atomicReference = (AtomicReference) this.f2835b;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e) {
                            i0 i0Var2 = ((a1) ((k2) this.f2838f).f159a).f11007t;
                            a1.f(i0Var2);
                            i0Var2.f11190f.e("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f2836c, e);
                            ((AtomicReference) this.f2835b).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f2835b;
                        }
                    } catch (Throwable th2) {
                        ((AtomicReference) this.f2835b).notify();
                        throw th2;
                    }
                }
                break;
            default:
                f3 f3Var = (f3) this.f2837d;
                String str = (String) this.f2836c;
                String str2 = (String) this.f2835b;
                zzcf zzcfVar = (zzcf) this.e;
                k2 k2Var2 = (k2) this.f2838f;
                a1 a1Var = (a1) k2Var2.f159a;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        b0 b0Var2 = k2Var2.f11238d;
                        if (b0Var2 == null) {
                            i0 i0Var3 = a1Var.f11007t;
                            a1.f(i0Var3);
                            i0Var3.f11190f.d(str2, "Failed to get conditional properties; not connected to service", str);
                        } else {
                            arrayList = d3.m(b0Var2.h(str2, str, f3Var));
                            k2Var2.o();
                        }
                        break;
                    } catch (RemoteException e4) {
                        i0 i0Var4 = a1Var.f11007t;
                        a1.f(i0Var4);
                        i0Var4.f11190f.e("Failed to get conditional properties; remote exception", str2, str, e4);
                    }
                    return;
                } finally {
                    d3 d3Var = a1Var.f11010w;
                    a1.d(d3Var);
                    d3Var.w(zzcfVar, arrayList);
                }
        }
    }
}
