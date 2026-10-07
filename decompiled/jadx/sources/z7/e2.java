package z7;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11107a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f3 f11110d;
    public final /* synthetic */ boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k2 f11111f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11112r;

    public e2(k2 k2Var, String str, String str2, f3 f3Var, boolean z4, zzcf zzcfVar) {
        this.f11111f = k2Var;
        this.f11108b = str;
        this.f11109c = str2;
        this.f11110d = f3Var;
        this.e = z4;
        this.f11112r = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        AtomicReference atomicReference;
        switch (this.f11107a) {
            case 0:
                f3 f3Var = this.f11110d;
                String str = this.f11109c;
                String str2 = this.f11108b;
                zzcf zzcfVar = (zzcf) this.f11112r;
                k2 k2Var = this.f11111f;
                a1 a1Var = (a1) k2Var.f159a;
                Bundle bundle = new Bundle();
                try {
                    try {
                        b0 b0Var = k2Var.f11238d;
                        if (b0Var == null) {
                            i0 i0Var = a1Var.f11007t;
                            a1.f(i0Var);
                            i0Var.f11190f.d(str2, "Failed to get user properties; not connected to service", str);
                            d3 d3Var = a1Var.f11010w;
                            a1.d(d3Var);
                            d3Var.x(zzcfVar, bundle);
                            return;
                        }
                        List<a3> listL = b0Var.l(str2, str, this.e, f3Var);
                        Bundle bundle2 = new Bundle();
                        if (listL != null) {
                            for (a3 a3Var : listL) {
                                String str3 = a3Var.e;
                                String str4 = a3Var.f11015b;
                                if (str3 != null) {
                                    bundle2.putString(str4, str3);
                                } else {
                                    Long l2 = a3Var.f11017d;
                                    if (l2 != null) {
                                        bundle2.putLong(str4, l2.longValue());
                                    } else {
                                        Double d10 = a3Var.f11019r;
                                        if (d10 != null) {
                                            bundle2.putDouble(str4, d10.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            k2Var.o();
                            d3 d3Var2 = a1Var.f11010w;
                            a1.d(d3Var2);
                            d3Var2.x(zzcfVar, bundle2);
                            return;
                        } catch (RemoteException e) {
                            e = e;
                            bundle = bundle2;
                            i0 i0Var2 = a1Var.f11007t;
                            a1.f(i0Var2);
                            i0Var2.f11190f.d(str2, "Failed to get user properties; remote exception", e);
                            d3 d3Var3 = a1Var.f11010w;
                            a1.d(d3Var3);
                            d3Var3.x(zzcfVar, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bundle = bundle2;
                            d3 d3Var4 = a1Var.f11010w;
                            a1.d(d3Var4);
                            d3Var4.x(zzcfVar, bundle);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (RemoteException e4) {
                    e = e4;
                }
                break;
            default:
                synchronized (((AtomicReference) this.f11112r)) {
                    try {
                        try {
                            k2 k2Var2 = this.f11111f;
                            b0 b0Var2 = k2Var2.f11238d;
                            if (b0Var2 == null) {
                                i0 i0Var3 = ((a1) k2Var2.f159a).f11007t;
                                a1.f(i0Var3);
                                i0Var3.f11190f.e("(legacy) Failed to get user properties; not connected to service", null, this.f11108b, this.f11109c);
                                ((AtomicReference) this.f11112r).set(Collections.EMPTY_LIST);
                                ((AtomicReference) this.f11112r).notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                ((AtomicReference) this.f11112r).set(b0Var2.l(this.f11108b, this.f11109c, this.e, this.f11110d));
                            } else {
                                ((AtomicReference) this.f11112r).set(b0Var2.c(null, this.f11108b, this.f11109c, this.e));
                            }
                            this.f11111f.o();
                            atomicReference = (AtomicReference) this.f11112r;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e10) {
                            i0 i0Var4 = ((a1) this.f11111f.f159a).f11007t;
                            a1.f(i0Var4);
                            i0Var4.f11190f.e("(legacy) Failed to get user properties; remote exception", null, this.f11108b, e10);
                            ((AtomicReference) this.f11112r).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f11112r;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f11112r).notify();
                        throw th3;
                    }
                }
                break;
        }
    }

    public e2(k2 k2Var, AtomicReference atomicReference, String str, String str2, f3 f3Var, boolean z4) {
        this.f11111f = k2Var;
        this.f11112r = atomicReference;
        this.f11108b = str;
        this.f11109c = str2;
        this.f11110d = f3Var;
        this.e = z4;
    }
}
