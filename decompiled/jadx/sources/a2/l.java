package a2;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.k0;
import androidx.fragment.app.o0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.webkit.ProxyConfig;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzbdn;
import com.google.android.gms.internal.ads.zzbdo;
import com.google.android.gms.internal.ads.zzhgq;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import g.e0;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;
import l.m3;
import l.r0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements uc.b, m0.e, ba.b, ba.a, f3.a, OnCompleteListener, zzbdn, i4.a, n5.b, p0.d {
    public static l e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f44c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f45d;

    public /* synthetic */ l(int i, boolean z4) {
        this.f42a = i;
    }

    public static l F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new l(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static l G(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new l(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static final URL f(l lVar) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).authority((String) lVar.f45d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        lb.b bVar = (lb.b) lVar.f43b;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(bVar.f6883a).appendPath("settings");
        lb.a aVar = bVar.f6884b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", aVar.f6882c).appendQueryParameter("display_version", aVar.f6881b).build().toString());
    }

    public static String i(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return da.v.u(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return da.v.h(str, string);
    }

    public boolean A() {
        gb.m mVar;
        IconCompat iconCompat;
        if (((e7.i) this.f45d).m("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f44c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strY = ((e7.i) this.f45d).y("gcm.n.image");
        if (TextUtils.isEmpty(strY)) {
            mVar = null;
        } else {
            try {
                mVar = new gb.m(new URL(strY));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strY);
                mVar = null;
            }
        }
        if (mVar != null) {
            ExecutorService executorService = (ExecutorService) this.f43b;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            mVar.f4479b = executorService.submit(new androidx.webkit.b(4, mVar, taskCompletionSource));
            mVar.f4480c = taskCompletionSource.getTask();
        }
        gb.j jVarA = gb.e.a((FirebaseMessagingService) this.f44c, (e7.i) this.f45d);
        d0.t tVar = (d0.t) jVarA.f4472a;
        if (mVar != null) {
            try {
                Task task = mVar.f4480c;
                i0.i(task);
                Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                tVar.d(bitmap);
                d0.p pVar = new d0.p();
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.f586b = bitmap;
                }
                pVar.e = iconCompat;
                pVar.f2767f = null;
                pVar.f2768g = true;
                tVar.e(pVar);
            } catch (InterruptedException unused2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                mVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e4) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e4.getCause());
            } catch (TimeoutException unused3) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                mVar.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f44c).getSystemService("notification")).notify((String) jVarA.f4473b, 0, ((d0.t) jVarA.f4472a).a());
        return true;
    }

    public void B(String str, String str2) {
        ((HashMap) this.f45d).put(str, str2);
    }

    public void C(c3.d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f43b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((c3.b) this.f44c).m(dVar);
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.n();
        }
    }

    public void D(o0 o0Var) {
        androidx.fragment.app.s sVar = o0Var.f949c;
        String str = sVar.e;
        HashMap map = (HashMap) this.f44c;
        if (map.get(str) != null) {
            return;
        }
        map.put(sVar.e, o0Var);
        if (androidx.fragment.app.i0.D(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void E(o0 o0Var) {
        androidx.fragment.app.s sVar = o0Var.f949c;
        if (sVar.L) {
            ((k0) this.f45d).c(sVar);
        }
        if (((o0) ((HashMap) this.f44c).put(sVar.e, null)) != null && androidx.fragment.app.i0.D(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public void H(androidx.lifecycle.l lVar) {
        androidx.lifecycle.o0 o0Var = (androidx.lifecycle.o0) this.f45d;
        if (o0Var != null) {
            o0Var.run();
        }
        androidx.lifecycle.o0 o0Var2 = new androidx.lifecycle.o0((androidx.lifecycle.t) this.f43b, lVar);
        this.f45d = o0Var2;
        ((Handler) this.f44c).postAtFrontOfQueue(o0Var2);
    }

    public void I() {
        ((TypedArray) this.f44c).recycle();
    }

    public void J(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f43b;
        workDatabase_Impl.b();
        c3.e eVar = (c3.e) this.f45d;
        i2.k kVarA = eVar.a();
        if (str == null) {
            kVarA.I(1);
        } else {
            kVarA.j(1, str);
        }
        workDatabase_Impl.c();
        try {
            kVarA.c();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.n();
            eVar.g(kVarA);
        }
    }

    public void K(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f43b = str;
    }

    public void N(String str, double d10, double d11) {
        ArrayList arrayList = (ArrayList) this.f44c;
        ArrayList arrayList2 = (ArrayList) this.f45d;
        ArrayList arrayList3 = (ArrayList) this.f43b;
        int i = 0;
        while (i < arrayList3.size()) {
            double dDoubleValue = ((Double) arrayList2.get(i)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList.get(i)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            } else {
                i++;
            }
        }
        arrayList3.add(i, str);
        arrayList2.add(i, Double.valueOf(d10));
        arrayList.add(i, Double.valueOf(d11));
    }

    @Override // p0.d
    public boolean b(Object obj) {
        if (obj instanceof q4.b) {
            ((q4.b) obj).c().f8029a = true;
        }
        ((q4.c) this.f44c).e(obj);
        return ((p0.f) this.f45d).b(obj);
    }

    @Override // p0.d
    public Object c() {
        Object objC = ((p0.f) this.f45d).c();
        if (objC == null) {
            objC = ((q4.a) this.f43b).g();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objC.getClass());
            }
        }
        if (objC instanceof q4.b) {
            ((q4.b) objC).c().f8029a = false;
        }
        return objC;
    }

    @Override // uc.b
    public Object d(uc.c cVar, yb.d dVar) {
        Object objD = ((uc.b) this.f43b).d(new k(cVar, (y1.v) this.f44c, (ic.l) this.f45d), dVar);
        return objD == zb.a.f11555a ? objD : ub.k.f9073a;
    }

    @Override // i4.a
    public w3.x e(w3.x xVar, u3.i iVar) {
        Drawable drawable = (Drawable) xVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((ea.j) this.f44c).e(d4.c.c(((BitmapDrawable) drawable).getBitmap(), (x3.a) this.f43b), iVar);
        }
        if (drawable instanceof h4.c) {
            return ((i4.d) this.f45d).e(xVar, iVar);
        }
        return null;
    }

    public void g(androidx.fragment.app.s sVar) {
        if (((ArrayList) this.f43b).contains(sVar)) {
            throw new IllegalStateException("Fragment already added: " + sVar);
        }
        synchronized (((ArrayList) this.f43b)) {
            ((ArrayList) this.f43b).add(sVar);
        }
        sVar.f982v = true;
    }

    @Override // tb.a
    public Object get() {
        return new l5.q(new r7.j(), new r7.i(), (q5.c) ((bd.u) this.f43b).get(), (c3.j) ((m3) this.f44c).get(), (a3.j) ((gb.r) this.f45d).get());
    }

    public l5.i h() {
        String strConcat = ((String) this.f43b) == null ? " backendName" : "";
        if (((i5.c) this.f45d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new l5.i((String) this.f43b, (byte[]) this.f44c, (i5.c) this.f45d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public Bitmap j(BitmapFactory.Options options) {
        switch (this.f42a) {
            case 8:
                return BitmapFactory.decodeStream(new p4.a(p4.b.c((ByteBuffer) this.f43b)), null, options);
            case 9:
                d4.w wVar = (d4.w) ((com.bumptech.glide.load.data.i) this.f43b).f1900b;
                wVar.reset();
                return BitmapFactory.decodeStream(wVar, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.i) this.f45d).d().getFileDescriptor(), null, options);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    public ea.j k() throws Throwable {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            try {
                String strI = i((String) this.f43b, (HashMap) this.f44c);
                String str = "GET Request URL: " + strI;
                try {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str, null);
                    }
                    httpsURLConnection = (HttpsURLConnection) new URL(strI).openConnection();
                    try {
                        httpsURLConnection.setReadTimeout(10000);
                        httpsURLConnection.setConnectTimeout(10000);
                        httpsURLConnection.setRequestMethod("GET");
                        for (Map.Entry entry : ((HashMap) this.f45d).entrySet()) {
                            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        httpsURLConnection.connect();
                        int responseCode = httpsURLConnection.getResponseCode();
                        InputStream inputStream2 = httpsURLConnection.getInputStream();
                        if (inputStream2 != null) {
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                                char[] cArr = new char[8192];
                                StringBuilder sb2 = new StringBuilder();
                                while (true) {
                                    int i = bufferedReader.read(cArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    sb2.append(cArr, 0, i);
                                }
                                string = sb2.toString();
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = inputStream2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                throw th;
                            }
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpsURLConnection.disconnect();
                        return new ea.j(responseCode, string);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    httpsURLConnection = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                httpsURLConnection = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // ba.b
    public void l(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f45d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public void m(Runnable runnable) {
        ((d3.i) this.f43b).execute(runnable);
    }

    public androidx.fragment.app.s n(String str) {
        o0 o0Var = (o0) ((HashMap) this.f44c).get(str);
        if (o0Var != null) {
            return o0Var.f949c;
        }
        return null;
    }

    public androidx.fragment.app.s o(String str) {
        for (o0 o0Var : ((HashMap) this.f44c).values()) {
            if (o0Var != null) {
                androidx.fragment.app.s sVarO = o0Var.f949c;
                if (!str.equals(sVarO.e)) {
                    sVarO = sVarO.E.f879c.o(str);
                }
                if (sVarO != null) {
                    return sVarO;
                }
            }
        }
        return null;
    }

    @Override // m0.e
    public void onCancel() {
        View view = (View) this.f43b;
        view.clearAnimation();
        ((ViewGroup) this.f44c).endViewTransition(view);
        ((androidx.fragment.app.e) this.f45d).d();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        f7.a aVar = (f7.a) this.f43b;
        String str = (String) this.f44c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f45d;
        synchronized (aVar.f3615a) {
            aVar.f3615a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // ba.a
    public void p(Bundle bundle) {
        synchronized (this.f44c) {
            try {
                aa.d dVar = aa.d.f265a;
                dVar.c("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f45d = new CountDownLatch(1);
                ((a5.b) this.f43b).p(bundle);
                dVar.c("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f45d).await(500, TimeUnit.MILLISECONDS)) {
                        dVar.c("App exception callback received from Analytics listener.");
                    } else {
                        dVar.d("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f45d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public p0 q(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return r(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public p0 r(Class cls, String str) {
        p0 p0VarA;
        s0 s0Var = (s0) this.f44c;
        jc.i.e(str, "key");
        t0 t0Var = (t0) this.f43b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.f1096a;
        p0 p0Var = (p0) linkedHashMap.get(str);
        if (!cls.isInstance(p0Var)) {
            l1.b bVar = new l1.b((a4.l) this.f45d);
            ((LinkedHashMap) bVar.f159a).put(q0.f1085b, str);
            try {
                p0VarA = s0Var.d(cls, bVar);
            } catch (AbstractMethodError unused) {
                p0VarA = s0Var.a(cls);
            }
            jc.i.e(p0VarA, "viewModel");
            p0 p0Var2 = (p0) linkedHashMap.put(str, p0VarA);
            if (p0Var2 != null) {
                p0Var2.b();
            }
            return p0VarA;
        }
        m0 m0Var = s0Var instanceof m0 ? (m0) s0Var : null;
        if (m0Var != null) {
            jc.i.b(p0Var);
            androidx.lifecycle.t tVar = m0Var.f1073d;
            if (tVar != null) {
                f2.d dVar = m0Var.e;
                jc.i.b(dVar);
                androidx.lifecycle.i0.a(p0Var, dVar, tVar);
            }
        }
        jc.i.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return p0Var;
    }

    public ArrayList s() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.f44c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var);
            }
        }
        return arrayList;
    }

    public ColorStateList t(int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f44c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = e0.k.getColorStateList((Context) this.f43b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public Drawable u(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f44c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : com.bumptech.glide.d.r((Context) this.f43b, resourceId);
    }

    public Drawable v(int i) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.f44c).hasValue(i) || (resourceId = ((TypedArray) this.f44c).getResourceId(i, 0)) == 0) {
            return null;
        }
        l.r rVarA = l.r.a();
        Context context = (Context) this.f43b;
        synchronized (rVarA) {
            drawableD = rVarA.f6405a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public Typeface w(int i, int i10, r0 r0Var) {
        int resourceId = ((TypedArray) this.f44c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f45d) == null) {
            this.f45d = new TypedValue();
        }
        Context context = (Context) this.f43b;
        TypedValue typedValue = (TypedValue) this.f45d;
        ThreadLocal threadLocal = g0.n.f4149a;
        if (context.isRestricted()) {
            return null;
        }
        return g0.n.a(context, resourceId, typedValue, i10, r0Var, true, false);
    }

    public List x() {
        ArrayList arrayList;
        if (((ArrayList) this.f43b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f43b)) {
            arrayList = new ArrayList((ArrayList) this.f43b);
        }
        return arrayList;
    }

    public ImageHeaderParser$ImageType y() throws Throwable {
        switch (this.f42a) {
            case 8:
                return n9.b.q((List) this.f44c, p4.b.c((ByteBuffer) this.f43b));
            case 9:
                List list = (List) this.f45d;
                d4.w wVar = (d4.w) ((com.bumptech.glide.load.data.i) this.f43b).f1900b;
                wVar.reset();
                return n9.b.p(list, wVar, (x3.f) this.f44c);
            default:
                List list2 = (List) this.f44c;
                com.bumptech.glide.load.data.i iVar = (com.bumptech.glide.load.data.i) this.f45d;
                x3.f fVar = (x3.f) this.f43b;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    u3.e eVar = (u3.e) list2.get(i);
                    d4.w wVar2 = null;
                    try {
                        d4.w wVar3 = new d4.w(new FileInputStream(iVar.d().getFileDescriptor()), fVar);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = eVar.d(wVar3);
                            wVar3.d();
                            iVar.d();
                            if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeD;
                            }
                        } catch (Throwable th) {
                            th = th;
                            wVar2 = wVar3;
                            if (wVar2 != null) {
                                wVar2.d();
                            }
                            iVar.d();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public c3.d z(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f43b;
        y1.y yVarD = y1.y.d(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            yVarD.I(1);
        } else {
            yVarD.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
        try {
            return cursorX.moveToFirst() ? new c3.d(cursorX.getString(jd.l.j(cursorX, "work_spec_id")), cursorX.getInt(jd.l.j(cursorX, "system_id"))) : null;
        } finally {
            cursorX.close();
            yVarD.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public void zza() {
        zzbdo zzbdoVar = (zzbdo) this.f43b;
        h6.o0 o0VarB = new fd.e(zzbdoVar.zza()).b();
        Intent intent = (Intent) o0VarB.f5061b;
        Context context = (Context) this.f44c;
        intent.setPackage(zzhgq.zza(context));
        o0VarB.l(context, (Uri) this.f45d);
        zzbdoVar.zzf((Activity) context);
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i) {
        this.f42a = i;
        this.f43b = obj;
        this.f44c = obj2;
        this.f45d = obj3;
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f42a = 7;
        this.f43b = workDatabase_Impl;
        this.f44c = new c3.b(workDatabase_Impl, 2);
        this.f45d = new c3.e(workDatabase_Impl, 0);
    }

    public l(androidx.lifecycle.u uVar) {
        this.f42a = 4;
        this.f43b = new androidx.lifecycle.t(uVar);
        this.f44c = new Handler();
    }

    public l(int i) {
        this.f42a = i;
        switch (i) {
            case 17:
                this.f43b = new ArrayList();
                this.f44c = new ArrayList();
                this.f45d = new ArrayList();
                break;
            default:
                this.f43b = new ArrayList();
                this.f44c = new HashMap();
                break;
        }
    }

    private final void L() {
    }

    private final void M() {
    }

    public l(ExecutorService executorService) {
        this.f42a = 12;
        this.f44c = new Handler(Looper.getMainLooper());
        this.f45d = new f3.b(this, 0);
        this.f43b = new d3.i(executorService);
    }

    public l(lb.b bVar, rc.x xVar) {
        this.f42a = 28;
        this.f43b = bVar;
        this.f44c = xVar;
        this.f45d = "firebase-settings.crashlytics.com";
    }

    public l(String str, HashMap map) {
        this.f42a = 19;
        this.f43b = str;
        this.f44c = map;
        this.f45d = new HashMap();
    }

    public l(LinearLayout linearLayout, Button button, Button button2, TextView textView) {
        this.f42a = 21;
        this.f43b = button;
        this.f44c = button2;
        this.f45d = textView;
    }

    public l(t0 t0Var, s0 s0Var, a4.l lVar) {
        this.f42a = 5;
        jc.i.e(t0Var, "store");
        jc.i.e(s0Var, "factory");
        jc.i.e(lVar, "defaultCreationExtras");
        this.f43b = t0Var;
        this.f44c = s0Var;
        this.f45d = lVar;
    }

    public l(a5.b bVar) {
        this.f42a = 6;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f44c = new Object();
        this.f43b = bVar;
    }

    public l(n9.g gVar, za.d dVar, kb.h hVar, kb.c cVar, Context context, kb.k kVar, ScheduledExecutorService scheduledExecutorService) {
        this.f42a = 23;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f43b = linkedHashSet;
        this.f44c = new kb.m(gVar, dVar, hVar, cVar, context, linkedHashSet, kVar, scheduledExecutorService);
        this.f45d = scheduledExecutorService;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(t0 t0Var, s0 s0Var) {
        this(t0Var, s0Var, l1.a.f6509b);
        this.f42a = 5;
        jc.i.e(t0Var, "store");
    }

    public l(FirebaseMessagingService firebaseMessagingService, e7.i iVar, ExecutorService executorService) {
        this.f42a = 15;
        this.f43b = executorService;
        this.f44c = firebaseMessagingService;
        this.f45d = iVar;
    }

    public l(Context context, TypedArray typedArray) {
        this.f42a = 24;
        this.f43b = context;
        this.f44c = typedArray;
    }

    public l(Context context, LocationManager locationManager) {
        this.f42a = 14;
        this.f45d = new e0();
        this.f43b = context;
        this.f44c = locationManager;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(u0 u0Var) {
        s0 s0VarC;
        this.f42a = 5;
        jc.i.e(u0Var, "owner");
        t0 t0VarF = u0Var.f();
        if (u0Var instanceof androidx.lifecycle.h) {
            s0VarC = ((androidx.lifecycle.h) u0Var).c();
        } else {
            if (q0.f1086c == null) {
                q0.f1086c = new q0();
            }
            s0VarC = q0.f1086c;
            jc.i.b(s0VarC);
        }
        this(t0VarF, s0VarC, androidx.lifecycle.i0.d(u0Var));
    }

    public l(p0.f fVar, q4.a aVar, q4.c cVar) {
        this.f42a = 29;
        this.f45d = fVar;
        this.f43b = aVar;
        this.f44c = cVar;
    }

    public l(p4.k kVar, ArrayList arrayList, x3.f fVar) {
        this.f42a = 9;
        p4.f.c(fVar, "Argument must not be null");
        this.f44c = fVar;
        p4.f.c(arrayList, "Argument must not be null");
        this.f45d = arrayList;
        this.f43b = new com.bumptech.glide.load.data.i(kVar, fVar);
    }

    public l(e7.i iVar) {
        this.f42a = 11;
        this.f42a = 11;
        this.f43b = iVar;
        this.f44c = Choreographer.getInstance();
        this.f45d = new e1.a(this);
    }

    public l(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, x3.f fVar) {
        this.f42a = 10;
        p4.f.c(fVar, "Argument must not be null");
        this.f43b = fVar;
        p4.f.c(arrayList, "Argument must not be null");
        this.f44c = arrayList;
        this.f45d = new com.bumptech.glide.load.data.i(parcelFileDescriptor);
    }

    public l(e7.i iVar, char c10) {
        this.f42a = 16;
        this.f43b = iVar.y("gcm.n.title");
        iVar.v("gcm.n.title");
        Object[] objArrU = iVar.u("gcm.n.title");
        if (objArrU != null) {
            String[] strArr = new String[objArrU.length];
            for (int i = 0; i < objArrU.length; i++) {
                strArr[i] = String.valueOf(objArrU[i]);
            }
        }
        this.f44c = iVar.y("gcm.n.body");
        iVar.v("gcm.n.body");
        Object[] objArrU2 = iVar.u("gcm.n.body");
        if (objArrU2 != null) {
            String[] strArr2 = new String[objArrU2.length];
            for (int i10 = 0; i10 < objArrU2.length; i10++) {
                strArr2[i10] = String.valueOf(objArrU2[i10]);
            }
        }
        iVar.y("gcm.n.icon");
        if (TextUtils.isEmpty(iVar.y("gcm.n.sound2"))) {
            iVar.y("gcm.n.sound");
        }
        iVar.y("gcm.n.tag");
        iVar.y("gcm.n.color");
        iVar.y("gcm.n.click_action");
        iVar.y("gcm.n.android_channel_id");
        String strY = iVar.y("gcm.n.link_android");
        strY = TextUtils.isEmpty(strY) ? iVar.y("gcm.n.link") : strY;
        if (!TextUtils.isEmpty(strY)) {
            Uri.parse(strY);
        }
        this.f45d = iVar.y("gcm.n.image");
        iVar.y("gcm.n.ticker");
        iVar.n("gcm.n.notification_priority");
        iVar.n("gcm.n.visibility");
        iVar.n("gcm.n.notification_count");
        iVar.m("gcm.n.sticky");
        iVar.m("gcm.n.local_only");
        iVar.m("gcm.n.default_sound");
        iVar.m("gcm.n.default_vibrate_timings");
        iVar.m("gcm.n.default_light_settings");
        iVar.w();
        iVar.t();
        iVar.z();
    }
}
