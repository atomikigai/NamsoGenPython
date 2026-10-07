package b3;

import a3.e;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import c3.i;
import com.bumptech.glide.manager.q;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.e1;
import com.google.android.gms.common.api.internal.f1;
import com.google.android.gms.common.api.internal.h0;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.tasks.TaskCompletionSource;
import h6.o0;
import h6.s0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o3.f;
import o3.x;
import o6.t;
import o6.z;
import q0.k1;
import q0.p1;
import q3.k;
import q3.l;
import q3.n;
import t2.m;
import u2.j;
import w5.g;
import z7.a1;
import z7.a2;
import z7.a3;
import z7.b0;
import z7.d3;
import z7.f3;
import z7.i0;
import z7.i1;
import z7.k2;
import z7.l0;
import z7.p;
import z7.q0;
import z7.v0;
import z7.x1;
import z7.z0;
import z7.z1;
import z7.z2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1368d;

    public /* synthetic */ b(int i) {
        this.f1365a = i;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [b3.b] */
    private final void a() throws Throwable {
        Throwable th;
        int responseCode;
        HttpURLConnection httpURLConnection;
        ?? r10;
        IOException e;
        ?? r11;
        InputStream inputStream;
        a2 a2Var = (a2) this.f1366b;
        a1 a1Var = (a1) a2Var.f159a;
        a1 a1Var2 = (a1) a2Var.f159a;
        z0 z0Var = a1Var.f11008u;
        a1.f(z0Var);
        z0Var.g();
        try {
            URLConnection uRLConnectionOpenConnection = ((URL) this.f1367c).openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            a1Var2.getClass();
            r10 = 60000;
            r11 = 60000;
            httpURLConnection.setConnectTimeout(60000);
            a1Var2.getClass();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i = inputStream.read(bArr);
                                    if (i <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        d(responseCode, null, byteArray, headerFields);
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        d(responseCode, e, null, r11);
                    } catch (Throwable th4) {
                        th = th4;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        d(responseCode, null, null, r10);
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    r11 = 0;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    d(responseCode, e, null, r11);
                } catch (Throwable th5) {
                    th = th5;
                    r10 = 0;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    d(responseCode, null, null, r10);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                responseCode = 0;
            } catch (Throwable th6) {
                th = th6;
                responseCode = 0;
            }
        } catch (IOException e12) {
            e = e12;
            responseCode = 0;
            httpURLConnection = null;
            r11 = 0;
        } catch (Throwable th7) {
            th = th7;
            responseCode = 0;
            httpURLConnection = null;
            r10 = 0;
        }
    }

    private final void b() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        synchronized (((AtomicReference) this.f1367c)) {
            try {
                try {
                    q0 q0Var = ((a1) ((k2) this.f1368d).f159a).f11006s;
                    a1.d(q0Var);
                    if (q0Var.h().f(i1.ANALYTICS_STORAGE)) {
                        k2 k2Var = (k2) this.f1368d;
                        b0 b0Var = k2Var.f11238d;
                        if (b0Var != null) {
                            ((AtomicReference) this.f1367c).set(b0Var.m((f3) this.f1366b));
                            String str = (String) ((AtomicReference) this.f1367c).get();
                            if (str != null) {
                                x1 x1Var = ((a1) ((k2) this.f1368d).f159a).A;
                                a1.e(x1Var);
                                x1Var.f11427r.set(str);
                                q0 q0Var2 = ((a1) ((k2) this.f1368d).f159a).f11006s;
                                a1.d(q0Var2);
                                q0Var2.f11308f.h(str);
                            }
                            ((k2) this.f1368d).o();
                            atomicReference = (AtomicReference) this.f1367c;
                            atomicReference.notify();
                            return;
                        }
                        i0 i0Var = ((a1) k2Var.f159a).f11007t;
                        a1.f(i0Var);
                        i0Var.f11190f.b("Failed to get app instance id");
                        atomicReference2 = (AtomicReference) this.f1367c;
                    } else {
                        i0 i0Var2 = ((a1) ((k2) this.f1368d).f159a).f11007t;
                        a1.f(i0Var2);
                        i0Var2.f11195v.b("Analytics storage consent denied; will not get app instance id");
                        x1 x1Var2 = ((a1) ((k2) this.f1368d).f159a).A;
                        a1.e(x1Var2);
                        x1Var2.f11427r.set(null);
                        q0 q0Var3 = ((a1) ((k2) this.f1368d).f159a).f11006s;
                        a1.d(q0Var3);
                        q0Var3.f11308f.h(null);
                        ((AtomicReference) this.f1367c).set(null);
                        atomicReference2 = (AtomicReference) this.f1367c;
                    }
                    atomicReference2.notify();
                } catch (RemoteException e) {
                    i0 i0Var3 = ((a1) ((k2) this.f1368d).f159a).f11007t;
                    a1.f(i0Var3);
                    i0Var3.f11190f.c(e, "Failed to get app instance id");
                    atomicReference = (AtomicReference) this.f1367c;
                }
            } catch (Throwable th) {
                ((AtomicReference) this.f1367c).notify();
                throw th;
            }
        }
    }

    private final void c() {
        f3 f3Var = (f3) this.f1367c;
        zzcf zzcfVar = (zzcf) this.f1366b;
        k2 k2Var = (k2) this.f1368d;
        a1 a1Var = (a1) k2Var.f159a;
        String strM = null;
        try {
            try {
                q0 q0Var = a1Var.f11006s;
                a1.d(q0Var);
                if (q0Var.h().f(i1.ANALYTICS_STORAGE)) {
                    b0 b0Var = k2Var.f11238d;
                    if (b0Var == null) {
                        i0 i0Var = a1Var.f11007t;
                        a1.f(i0Var);
                        i0Var.f11190f.b("Failed to get app instance id");
                    } else {
                        strM = b0Var.m(f3Var);
                        if (strM != null) {
                            x1 x1Var = a1Var.A;
                            a1.e(x1Var);
                            x1Var.f11427r.set(strM);
                            q0 q0Var2 = a1Var.f11006s;
                            a1.d(q0Var2);
                            q0Var2.f11308f.h(strM);
                        }
                        k2Var.o();
                    }
                } else {
                    i0 i0Var2 = a1Var.f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11195v.b("Analytics storage consent denied; will not get app instance id");
                    x1 x1Var2 = a1Var.A;
                    a1.e(x1Var2);
                    x1Var2.f11427r.set(null);
                    q0 q0Var3 = a1Var.f11006s;
                    a1.d(q0Var3);
                    q0Var3.f11308f.h(null);
                }
            } catch (RemoteException e) {
                i0 i0Var3 = a1Var.f11007t;
                a1.f(i0Var3);
                i0Var3.f11190f.c(e, "Failed to get app instance id");
            }
        } finally {
            d3 d3Var = a1Var.f11010w;
            a1.d(d3Var);
            d3Var.B(null, zzcfVar);
        }
    }

    public void d(int i, IOException iOException, byte[] bArr, Map map) {
        z0 z0Var = ((a1) ((a2) this.f1366b).f159a).f11008u;
        a1.f(z0Var);
        z0Var.l(new z1(this, i, iOException, bArr, map));
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        CookieManager cookieManagerH;
        l lVar;
        p pVar;
        zzff zzffVar;
        boolean zBooleanValue = true;
        Object objCall = null;
        boolean z4 = false;
        zAcceptThirdPartyCookies = false;
        boolean zAcceptThirdPartyCookies = false;
        switch (this.f1365a) {
            case 0:
                i iVarL = ((WorkDatabase) this.f1367c).x().l((String) this.f1366b);
                if (iVarL == null || !iVarL.b()) {
                    return;
                }
                synchronized (((c) this.f1368d).f1372c) {
                    ((c) this.f1368d).f1374f.put((String) this.f1366b, iVarL);
                    ((c) this.f1368d).f1375r.add(iVarL);
                    c cVar = (c) this.f1368d;
                    cVar.f1376s.b(cVar.f1375r);
                    break;
                }
                return;
            case 1:
                LifecycleCallback lifecycleCallback = (LifecycleCallback) this.f1367c;
                e1 e1Var = (e1) this.f1368d;
                if (e1Var.f2080b > 0) {
                    Bundle bundle = e1Var.f2081c;
                    lifecycleCallback.onCreate(bundle != null ? bundle.getBundle((String) this.f1366b) : null);
                }
                if (e1Var.f2080b >= 2) {
                    lifecycleCallback.onStart();
                }
                if (e1Var.f2080b >= 3) {
                    lifecycleCallback.onResume();
                }
                if (e1Var.f2080b >= 4) {
                    lifecycleCallback.onStop();
                }
                if (e1Var.f2080b >= 5) {
                    lifecycleCallback.onDestroy();
                    return;
                }
                return;
            case 2:
                LifecycleCallback lifecycleCallback2 = (LifecycleCallback) this.f1367c;
                f1 f1Var = (f1) this.f1368d;
                if (f1Var.f2096g0 > 0) {
                    Bundle bundle2 = f1Var.f2097h0;
                    lifecycleCallback2.onCreate(bundle2 != null ? bundle2.getBundle((String) this.f1366b) : null);
                }
                if (f1Var.f2096g0 >= 2) {
                    lifecycleCallback2.onStart();
                }
                if (f1Var.f2096g0 >= 3) {
                    lifecycleCallback2.onResume();
                }
                if (f1Var.f2096g0 >= 4) {
                    lifecycleCallback2.onStop();
                }
                if (f1Var.f2096g0 >= 5) {
                    lifecycleCallback2.onDestroy();
                    return;
                }
                return;
            case 3:
                ((j) this.f1367c).f8824r.g((String) this.f1366b, (q5.d) this.f1368d);
                return;
            case 4:
                h0 h0Var = (h0) this.f1367c;
                String str = (String) this.f1366b;
                HashMap map = (HashMap) this.f1368d;
                zzcfk zzcfkVar = (zzcfk) h0Var.f2117d;
                if (zzcfkVar != null) {
                    zzcfkVar.zzd(str, map);
                    return;
                }
                return;
            case 5:
                ja.c cVar2 = (ja.c) this.f1368d;
                da.b bVar = (da.b) this.f1367c;
                cVar2.b(bVar, (TaskCompletionSource) this.f1366b);
                ((AtomicInteger) cVar2.i.f264c).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(cVar2.f5727b, cVar2.a()) * (60000.0d / cVar2.f5726a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + bVar.f3091b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, null);
                }
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 6:
                try {
                    objCall = ((n0.c) this.f1367c).call();
                    break;
                } catch (Exception unused2) {
                }
                ((Handler) this.f1368d).post(new e((n0.d) this.f1366b, objCall, 15, z4));
                return;
            case 7:
                o3.b bVar2 = (o3.b) this.f1367c;
                f fVar = (f) this.f1366b;
                i6.e eVar = (i6.e) this.f1368d;
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                o3.e eVar2 = x.f7538k;
                bVar2.V(4, zzieVar, eVar2);
                fVar.a(eVar2, eVar.f5226b);
                return;
            case 8:
                super/*o3.b*/.x((a4.b) this.f1366b, (o3.l) this.f1368d);
                return;
            case 9:
                super/*o3.b*/.u((i6.e) this.f1366b, (f) this.f1368d);
                return;
            case 10:
                super/*o3.b*/.t((h2.a) this.f1366b, (o3.a) this.f1368d);
                return;
            case 11:
                o6.a aVar = (o6.a) this.f1367c;
                Bundle bundle3 = (Bundle) this.f1366b;
                t tVar = (t) this.f1368d;
                s0 s0Var = d6.p.C.e;
                Context context = aVar.f7580a;
                CookieManager cookieManagerH2 = s0Var.h();
                bundle3.putBoolean("accept_3p_cookie", cookieManagerH2 != null ? cookieManagerH2.acceptThirdPartyCookies(aVar.f7581b) : false);
                ta.c cVar3 = new ta.c();
                cVar3.e(bundle3);
                q6.a.a(context, new g(cVar3), tVar);
                return;
            case 12:
                o6.x xVar = (o6.x) this.f1367c;
                Object obj = this.f1366b;
                Pair pair = (Pair) this.f1368d;
                HashMap map2 = xVar.f7682b;
                if ((obj instanceof WebView) && (cookieManagerH = d6.p.C.e.h()) != null) {
                    zAcceptThirdPartyCookies = cookieManagerH.acceptThirdPartyCookies((WebView) obj);
                }
                HashMap map3 = xVar.f7681a;
                Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
                z zVar = (z) map3.get(boolValueOf);
                if (zVar != null) {
                    d6.p.C.f2983j.getClass();
                    if (zVar.f7692c > System.currentTimeMillis()) {
                        xVar.d(zVar, pair, true);
                        return;
                    }
                }
                List arrayList = (List) map2.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map2.put(boolValueOf, arrayList);
                }
                arrayList.add(pair);
                return;
            case 13:
                zzdsr zzdsrVar = (zzdsr) this.f1367c;
                String str3 = (String) this.f1366b;
                Pair[] pairArr = (Pair[]) this.f1368d;
                ConcurrentHashMap concurrentHashMapZzc = zzdsrVar.zzc();
                if (!TextUtils.isEmpty("action") && !TextUtils.isEmpty(str3)) {
                    concurrentHashMapZzc.put("action", str3);
                }
                for (Pair pair2 : pairArr) {
                    String str4 = (String) pair2.first;
                    String str5 = (String) pair2.second;
                    if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
                        concurrentHashMapZzc.put(str4, str5);
                    }
                }
                zzdsrVar.zzf(concurrentHashMapZzc);
                return;
            case 14:
                k1.h((View) this.f1367c, (o0) this.f1366b);
                ((ValueAnimator) this.f1368d).start();
                return;
            case 15:
                if (((k) this.f1367c).i()) {
                    ((k) this.f1367c).d("canceled-at-delivery");
                    return;
                }
                q qVar = (q) this.f1366b;
                n nVar = (n) qVar.f1935d;
                if (nVar == null) {
                    ((k) this.f1367c).c(qVar.f1933b);
                } else {
                    k kVar = (k) this.f1367c;
                    synchronized (kVar.e) {
                        lVar = kVar.f8009f;
                        break;
                    }
                    if (lVar != null) {
                        lVar.c(nVar);
                    }
                }
                if (((q) this.f1366b).f1932a) {
                    ((k) this.f1367c).a("intermediate-response");
                } else {
                    ((k) this.f1367c).d("done");
                }
                Runnable runnable = (Runnable) this.f1368d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                new zzbtx((Context) this.f1367c, w5.b.BANNER, ((g) this.f1366b).f9647a, null).zzb((q6.b) this.f1368d);
                return;
            case 17:
                try {
                    zBooleanValue = ((Boolean) ((e3.k) this.f1368d).get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused3) {
                }
                ((u2.b) this.f1367c).c((String) this.f1366b, zBooleanValue);
                return;
            case 18:
                e3.k kVar2 = (e3.k) this.f1366b;
                u2.k kVar3 = (u2.k) this.f1368d;
                try {
                    ((m9.a) this.f1367c).get();
                    m.d().a(u2.k.E, "Starting work for " + kVar3.e.f1746c, new Throwable[0]);
                    kVar3.C = kVar3.f8832f.startWork();
                    kVar2.j(kVar3.C);
                    return;
                } catch (Throwable th) {
                    kVar2.i(th);
                    return;
                }
            case 19:
                String str6 = (String) this.f1366b;
                u2.k kVar4 = (u2.k) this.f1368d;
                try {
                    try {
                        t2.l lVar2 = (t2.l) ((e3.k) this.f1367c).get();
                        if (lVar2 == null) {
                            m.d().b(u2.k.E, kVar4.e.f1746c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                        } else {
                            m.d().a(u2.k.E, String.format("%s returned a %s result.", kVar4.e.f1746c, lVar2), new Throwable[0]);
                            kVar4.f8834s = lVar2;
                        }
                    } catch (Throwable th2) {
                        kVar4.b();
                        throw th2;
                    }
                    break;
                } catch (InterruptedException e) {
                    e = e;
                    m.d().b(u2.k.E, str6 + " failed because it threw an exception/error", e);
                } catch (CancellationException e4) {
                    m.d().e(u2.k.E, str6 + " was cancelled", e4);
                } catch (ExecutionException e10) {
                    e = e10;
                    m.d().b(u2.k.E, str6 + " failed because it threw an exception/error", e);
                }
                kVar4.b();
                return;
            case 20:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f1368d;
                Context context2 = (Context) this.f1366b;
                Intent intent = (Intent) this.f1367c;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    m.d().a(ConstraintProxyUpdateReceiver.f1261a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                    d3.g.a(context2, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    d3.g.a(context2, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    d3.g.a(context2, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    d3.g.a(context2, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case zzbbs.zzt.zzm /* 21 */:
                z7.e1 e1Var2 = (z7.e1) this.f1367c;
                String str7 = (String) this.f1366b;
                Bundle bundle4 = (Bundle) this.f1368d;
                z7.j jVar = e1Var2.f11104a.f11509c;
                z2.D(jVar);
                jVar.c();
                jVar.d();
                a1 a1Var = (a1) jVar.f159a;
                com.google.android.gms.common.internal.i0.e(str7);
                com.google.android.gms.common.internal.i0.e("dep");
                TextUtils.isEmpty("");
                if (bundle4 == null || bundle4.isEmpty()) {
                    pVar = new p(new Bundle());
                } else {
                    Bundle bundle5 = new Bundle(bundle4);
                    Iterator<String> it = bundle5.keySet().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (next == null) {
                            i0 i0Var = a1Var.f11007t;
                            a1.f(i0Var);
                            i0Var.f11190f.b("Param name can't be null");
                            it.remove();
                        } else {
                            d3 d3Var = a1Var.f11010w;
                            a1.d(d3Var);
                            Object objG = d3Var.g(bundle5.get(next), next);
                            if (objG == null) {
                                i0 i0Var2 = a1Var.f11007t;
                                a1.f(i0Var2);
                                i0Var2.f11193t.c(a1Var.f11011x.e(next), "Param value can't be null");
                                it.remove();
                            } else {
                                d3 d3Var2 = a1Var.f11010w;
                                a1.d(d3Var2);
                                d3Var2.u(bundle5, next, objG);
                            }
                        }
                    }
                    pVar = new p(bundle5);
                }
                Bundle bundle6 = pVar.f11292a;
                l0 l0Var = jVar.f11411b.f11512r;
                z2.D(l0Var);
                zzfs zzfsVarZze = zzft.zze();
                zzfsVarZze.zzl(0L);
                for (String str8 : bundle6.keySet()) {
                    zzfw zzfwVarZze = zzfx.zze();
                    zzfwVarZze.zzj(str8);
                    Object obj2 = bundle6.get(str8);
                    com.google.android.gms.common.internal.i0.i(obj2);
                    l0Var.H(zzfwVarZze, obj2);
                    zzfsVarZze.zze(zzfwVarZze);
                }
                byte[] bArrZzbx = ((zzft) zzfsVarZze.zzaD()).zzbx();
                i0 i0Var3 = a1Var.f11007t;
                a1.f(i0Var3);
                i0Var3.f11198y.d(a1Var.f11011x.d(str7), "Saving default event parameters, appId, data size", Integer.valueOf(bArrZzbx.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str7);
                contentValues.put("parameters", bArrZzbx);
                try {
                    if (jVar.v().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        a1.f(i0Var3);
                        i0Var3.f11190f.c(i0.k(str7), "Failed to insert default event parameters (got -1). appId");
                        return;
                    }
                    return;
                } catch (SQLiteException e11) {
                    a1.f(i0Var3);
                    i0Var3.f11190f.d(i0.k(str7), "Error storing default event parameters. appId", e11);
                    return;
                }
            case 22:
                f3 f3Var = (f3) this.f1366b;
                z2 z2Var = ((z7.e1) this.f1368d).f11104a;
                z2Var.a();
                z7.c cVar4 = (z7.c) this.f1367c;
                if (cVar4.f11039c.zza() == null) {
                    z2Var.j(cVar4, f3Var);
                    return;
                } else {
                    z2Var.m(cVar4, f3Var);
                    return;
                }
            case 23:
                z7.e1 e1Var3 = (z7.e1) this.f1368d;
                z2 z2Var2 = e1Var3.f11104a;
                z7.q qVar2 = (z7.q) this.f1367c;
                String str9 = qVar2.f11302a;
                p pVar2 = qVar2.f11303b;
                if ("_cmp".equals(str9) && pVar2 != null) {
                    Bundle bundle7 = pVar2.f11292a;
                    if (bundle7.size() != 0) {
                        String string = bundle7.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            z2Var2.zzaA().f11196w.c(qVar2.toString(), "Event has been filtered ");
                            qVar2 = new z7.q("_cmpx", qVar2.f11303b, qVar2.f11304c, qVar2.f11305d);
                        }
                    }
                }
                String str10 = qVar2.f11302a;
                f3 f3Var2 = (f3) this.f1366b;
                v0 v0Var = z2Var2.f11507a;
                l0 l0Var2 = z2Var2.f11512r;
                z2.D(v0Var);
                String str11 = f3Var2.f11119a;
                if (TextUtils.isEmpty(str11) || (zzffVar = (zzff) v0Var.f11399s.get(str11)) == null || zzffVar.zza() == 0) {
                    e1Var3.y(qVar2, f3Var2);
                    return;
                }
                z2Var2.zzaA().f11198y.c(str11, "EES config found for");
                v0 v0Var2 = z2Var2.f11507a;
                z2.D(v0Var2);
                zzc zzcVar = TextUtils.isEmpty(str11) ? null : (zzc) v0Var2.f11401u.get(str11);
                if (zzcVar == null) {
                    z2Var2.zzaA().f11198y.c(str11, "EES not loaded for");
                    e1Var3.y(qVar2, f3Var2);
                    return;
                }
                try {
                    z2.D(l0Var2);
                    HashMap mapG = l0.G(qVar2.f11303b.g(), true);
                    String strF = z7.k1.f(str10, z7.k1.f11231c, z7.k1.f11229a);
                    if (strF == null) {
                        strF = str10;
                    }
                    if (zzcVar.zze(new zzaa(strF, qVar2.f11305d, mapG))) {
                        if (zzcVar.zzg()) {
                            z2Var2.zzaA().f11198y.c(str10, "EES edited event");
                            z2.D(l0Var2);
                            e1Var3.y(l0.z(zzcVar.zza().zzb()), f3Var2);
                        } else {
                            e1Var3.y(qVar2, f3Var2);
                        }
                        if (zzcVar.zzf()) {
                            for (zzaa zzaaVar : zzcVar.zza().zzc()) {
                                z2Var2.zzaA().f11198y.c(zzaaVar.zzd(), "EES logging created event");
                                z2.D(l0Var2);
                                e1Var3.y(l0.z(zzaaVar), f3Var2);
                            }
                            return;
                        }
                        return;
                    }
                } catch (zzd unused4) {
                    z2Var2.zzaA().f11190f.d(f3Var2.f11120b, "EES error. appId, eventName", str10);
                }
                z2Var2.zzaA().f11198y.c(str10, "EES was not applied to event");
                e1Var3.y(qVar2, f3Var2);
                return;
            case 24:
                z2 z2Var3 = ((z7.e1) this.f1368d).f11104a;
                z2Var3.a();
                z2Var3.f((z7.q) this.f1367c, (String) this.f1366b);
                return;
            case 25:
                f3 f3Var3 = (f3) this.f1366b;
                z2 z2Var4 = ((z7.e1) this.f1368d).f11104a;
                z2Var4.a();
                a3 a3Var = (a3) this.f1367c;
                if (a3Var.zza() == null) {
                    z2Var4.k(a3Var.f11015b, f3Var3);
                    return;
                } else {
                    z2Var4.o(a3Var, f3Var3);
                    return;
                }
            case 26:
                a();
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                f3 f3Var4 = (f3) this.f1367c;
                k2 k2Var = (k2) this.f1368d;
                b0 b0Var = k2Var.f11238d;
                a1 a1Var2 = (a1) k2Var.f159a;
                if (b0Var == null) {
                    i0 i0Var4 = a1Var2.f11007t;
                    a1.f(i0Var4);
                    i0Var4.f11190f.b("Failed to send default event parameters to service");
                    return;
                } else {
                    try {
                        b0Var.a((Bundle) this.f1366b, f3Var4);
                        return;
                    } catch (RemoteException e12) {
                        i0 i0Var5 = a1Var2.f11007t;
                        a1.f(i0Var5);
                        i0Var5.f11190f.c(e12, "Failed to send default event parameters to service");
                        return;
                    }
                }
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.f1365a = i;
        this.f1368d = obj;
        this.f1367c = obj2;
        this.f1366b = obj3;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i, boolean z4) {
        this.f1365a = i;
        this.f1367c = obj;
        this.f1366b = obj2;
        this.f1368d = obj3;
    }

    public b(a2 a2Var, String str, URL url, ta.c cVar) {
        this.f1365a = 26;
        this.f1366b = a2Var;
        com.google.android.gms.common.internal.i0.e(str);
        this.f1367c = url;
        this.f1368d = cVar;
    }

    public b(View view, p1 p1Var, o0 o0Var, ValueAnimator valueAnimator) {
        this.f1365a = 14;
        this.f1367c = view;
        this.f1366b = o0Var;
        this.f1368d = valueAnimator;
    }
}
