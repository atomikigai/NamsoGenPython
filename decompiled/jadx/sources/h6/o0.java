package h6;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.cardview.widget.CardView;
import app.namso_gen.spacehowen.R;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.play_billing.zzbg;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fa.c1;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements i6.c, OnCompleteListener, o3.c, la.a, n5.b, n8.h, o3.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5062c;

    public /* synthetic */ o0(int i, Object obj, Object obj2) {
        this.f5060a = i;
        this.f5061b = obj;
        this.f5062c = obj2;
    }

    public static void s() {
        if (r4.e.f8156g.getString(new int[]{R.string.default_web_client_id}[0]).equals("CHANGE-ME")) {
            throw new IllegalStateException("Check your google-services plugin configuration, the default_web_client_id string wasn't populated.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object a(lb.r rVar, ac.c cVar) {
        lb.p pVar;
        lb.r rVar2;
        lb.v vVar;
        Exception e;
        o0 o0Var;
        lb.v vVar2;
        String str;
        if (cVar instanceof lb.p) {
            pVar = (lb.p) cVar;
            int i = pVar.f6937r;
            if ((i & Integer.MIN_VALUE) != 0) {
                pVar.f6937r = i - Integer.MIN_VALUE;
            } else {
                pVar = new lb.p(this, cVar);
            }
        } else {
            pVar = new lb.p(this, cVar);
        }
        Object obj = pVar.e;
        zb.a aVar = zb.a.f11555a;
        int i10 = pVar.f6937r;
        if (i10 == 0) {
            r7.g.G(obj);
            lb.v vVar3 = rVar.f6942a;
            try {
                Task taskC = ((za.c) ((za.d) this.f5061b)).c();
                jc.i.d(taskC, "firebaseInstallations.id");
                pVar.f6932a = this;
                pVar.f6933b = rVar;
                pVar.f6934c = vVar3;
                pVar.f6935d = vVar3;
                pVar.f6937r = 1;
                Object objF = c1.f(taskC, pVar);
                if (objF == aVar) {
                    return aVar;
                }
                rVar2 = rVar;
                vVar2 = vVar3;
                vVar = vVar2;
                obj = objF;
                o0Var = this;
            } catch (Exception e4) {
                rVar2 = rVar;
                vVar = vVar3;
                e = e4;
                o0Var = this;
                Log.e("SessionCoordinator", "Error getting Firebase Installation ID: " + e + ". Using an empty ID");
                str = "";
                vVar2 = vVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar2 = pVar.f6935d;
            vVar = pVar.f6934c;
            rVar2 = pVar.f6933b;
            o0Var = pVar.f6932a;
            try {
                r7.g.G(obj);
            } catch (Exception e10) {
                e = e10;
                Log.e("SessionCoordinator", "Error getting Firebase Installation ID: " + e + ". Using an empty ID");
                str = "";
                vVar2 = vVar;
            }
        }
        jc.i.d(obj, "{\n        firebaseInstallations.id.await()\n      }");
        str = (String) obj;
        vVar2.getClass();
        vVar2.f6955f = str;
        try {
            ((a5.b) o0Var.f5062c).w(rVar2);
            Log.i("SessionCoordinator", "Successfully logged Session Start event: " + rVar2.f6942a.f6951a);
        } catch (RuntimeException e11) {
            Log.e("SessionCoordinator", "Error logging Session Start event to DataTransport: ", e11);
        }
        return ub.k.f9073a;
    }

    public com.bumptech.glide.manager.q b() {
        ArrayList arrayList = (ArrayList) this.f5061b;
        boolean z4 = true;
        boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (!z10) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        ArrayList arrayList2 = (ArrayList) this.f5061b;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                if (((o3.d) obj) == null) {
                    throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                }
            }
        }
        com.bumptech.glide.manager.q qVar = new com.bumptech.glide.manager.q();
        qVar.f1932a = z10 && !((o3.d) ((ArrayList) this.f5061b).get(0)).f7493a.f7507b.optString("packageName").isEmpty();
        ((z9.c) this.f5062c).getClass();
        if (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) {
            z4 = false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (z4 && !zIsEmpty) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        qVar.f1933b = new b9.e(25);
        qVar.f1935d = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.f5061b;
        qVar.f1934c = arrayList3 != null ? zzbt.zzj(arrayList3) : zzbt.zzk();
        return qVar;
    }

    public o3.d c() {
        zzbg.zzc((o3.k) this.f5061b, "ProductDetails is required for constructing ProductDetailsParams.");
        return new o3.d(this);
    }

    public r4.c d() {
        Object obj;
        Bundle bundle = (Bundle) this.f5061b;
        if (!bundle.containsKey("extra_google_sign_in_options")) {
            s();
            List list = Collections.EMPTY_LIST;
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f2018v;
            new HashSet();
            new HashMap();
            com.google.android.gms.common.internal.i0.i(googleSignInOptions);
            HashSet hashSet = new HashSet(googleSignInOptions.f2024b);
            boolean z4 = googleSignInOptions.e;
            boolean z10 = googleSignInOptions.f2027f;
            boolean z11 = googleSignInOptions.f2026d;
            String str = googleSignInOptions.f2028r;
            Account account = googleSignInOptions.f2025c;
            String str2 = googleSignInOptions.f2029s;
            HashMap mapH = GoogleSignInOptions.h(googleSignInOptions.f2030t);
            String str3 = googleSignInOptions.f2031u;
            hashSet.add(GoogleSignInOptions.f2019w);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(new Scope(1, (String) it.next()));
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
            if (hashSet.contains(GoogleSignInOptions.f2022z)) {
                Scope scope = GoogleSignInOptions.f2021y;
                if (hashSet.contains(scope)) {
                    hashSet.remove(scope);
                }
            }
            if (z11 && (account == null || !hashSet.isEmpty())) {
                hashSet.add(GoogleSignInOptions.f2020x);
            }
            boolean z12 = false;
            GoogleSignInOptions googleSignInOptions2 = new GoogleSignInOptions(3, new ArrayList(hashSet), account, z11, z4, z10, str, str2, mapH, str3);
            if (bundle.containsKey(new String[]{"extra_google_sign_in_options"}[0])) {
                throw new IllegalStateException("Cannot overwrite previously set sign-in options.");
            }
            new HashSet();
            new HashMap();
            ArrayList arrayList = googleSignInOptions2.f2024b;
            HashSet hashSet2 = new HashSet(arrayList);
            HashMap mapH2 = GoogleSignInOptions.h(googleSignInOptions2.f2030t);
            String string = googleSignInOptions2.f2028r;
            if (string == null) {
                s();
                string = r4.e.f8156g.getString(R.string.default_web_client_id);
            }
            String str4 = string;
            ArrayList arrayList2 = new ArrayList(arrayList);
            int size = arrayList2.size();
            int i = 0;
            do {
                if (i >= size) {
                    Log.w("AuthUI", "The GoogleSignInOptions passed to setSignInOptions does not request the 'email' scope. In most cases this is a mistake! Call requestEmail() on the GoogleSignInOptions object.");
                    break;
                }
                obj = arrayList2.get(i);
                i++;
            } while (!"email".equals(((Scope) obj).f2040b));
            com.google.android.gms.common.internal.i0.e(str4);
            String str5 = googleSignInOptions2.f2028r;
            if (str5 == null || str5.equals(str4)) {
                z12 = true;
            }
            com.google.android.gms.common.internal.i0.a("two different server client ids provided", z12);
            if (hashSet2.contains(GoogleSignInOptions.f2022z)) {
                Scope scope2 = GoogleSignInOptions.f2021y;
                if (hashSet2.contains(scope2)) {
                    hashSet2.remove(scope2);
                }
            }
            Account account2 = googleSignInOptions2.f2025c;
            if (account2 == null || !hashSet2.isEmpty()) {
                hashSet2.add(GoogleSignInOptions.f2020x);
            }
            bundle.putParcelable("extra_google_sign_in_options", new GoogleSignInOptions(3, new ArrayList(hashSet2), account2, true, googleSignInOptions2.e, googleSignInOptions2.f2027f, str4, googleSignInOptions2.f2029s, mapH2, googleSignInOptions2.f2031u));
        }
        return new r4.c((String) this.f5062c, bundle);
    }

    public void e(String str, PrintWriter printWriter) {
        m1.b bVar = (m1.b) this.f5062c;
        if (bVar.f6979d.f8103c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i = 0;
        while (true) {
            r.l lVar = bVar.f6979d;
            if (i >= lVar.f8103c) {
                return;
            }
            m1.a aVar = (m1.a) lVar.f8102b[i];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(bVar.f6979d.f8101a[i]);
            printWriter.print(": ");
            printWriter.println(aVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(aVar.f6975l);
            e7.d dVar = aVar.f6975l;
            String str3 = str2 + "  ";
            dVar.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dVar.f3475a);
            if (dVar.f3476b || dVar.e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(dVar.f3476b);
                printWriter.print(" mContentChanged=");
                printWriter.print(dVar.e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dVar.f3477c || dVar.f3478d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(dVar.f3477c);
                printWriter.print(" mReset=");
                printWriter.println(dVar.f3478d);
            }
            if (dVar.f3480g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(dVar.f3480g);
                printWriter.print(" waiting=");
                dVar.f3480g.getClass();
                printWriter.println(false);
            }
            if (dVar.h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(dVar.h);
                printWriter.print(" waiting=");
                dVar.h.getClass();
                printWriter.println(false);
            }
            if (aVar.f6977n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(aVar.f6977n);
                ea.e eVar = aVar.f6977n;
                eVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(eVar.f3515b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            e7.d dVar2 = aVar.f6975l;
            Object obj = aVar.e;
            Object obj2 = obj != androidx.lifecycle.y.f1104k ? obj : null;
            dVar2.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            p3.a.d(sb2, obj2);
            sb2.append("}");
            printWriter.println(sb2.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(aVar.f1107c > 0);
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory f(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.f5062c) == null) {
            Context context = (Context) this.f5061b;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f5062c = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f5062c = map;
        }
        String str4 = (String) ((Map) this.f5062c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e4) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e4);
            return null;
        } catch (InstantiationException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        }
    }

    public File g() {
        if (((File) this.f5062c) == null) {
            this.f5062c = new File(((Context) this.f5061b).getCacheDir(), "volley");
        }
        return (File) this.f5062c;
    }

    @Override // tb.a
    public Object get() {
        return new m5.d((Context) ((n5.c) this.f5061b).f7282a, (a2.l) ((ib.c) this.f5062c).get());
    }

    public List h() {
        if (((pc.e) this.f5062c) == null) {
            this.f5062c = new pc.e(this);
        }
        pc.e eVar = (pc.e) this.f5062c;
        jc.i.b(eVar);
        return eVar;
    }

    public synchronized List i(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f5061b).contains(str)) {
                ((ArrayList) this.f5061b).add(str);
            }
            arrayList = (List) ((HashMap) this.f5062c).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f5062c).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @Override // la.a
    public StackTraceElement[] j(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        la.a[] aVarArr = (la.a[]) this.f5061b;
        StackTraceElement[] stackTraceElementArrJ = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            la.a aVar = aVarArr[i];
            if (stackTraceElementArrJ.length <= 1024) {
                break;
            }
            stackTraceElementArrJ = aVar.j(stackTraceElementArr);
        }
        return stackTraceElementArrJ.length > 1024 ? ((b9.e) this.f5062c).j(stackTraceElementArrJ) : stackTraceElementArrJ;
    }

    public synchronized ArrayList k(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f5061b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            List<k4.d> list = (List) ((HashMap) this.f5062c).get((String) obj);
            if (list != null) {
                for (k4.d dVar : list) {
                    if ((dVar.f5981a.isAssignableFrom(cls) && cls2.isAssignableFrom(dVar.f5982b)) && !arrayList.contains(dVar.f5982b)) {
                        arrayList.add(dVar.f5982b);
                    }
                }
            }
        }
        return arrayList;
    }

    public void l(Context context, Uri uri) {
        Intent intent = (Intent) this.f5061b;
        intent.setData(uri);
        e0.k.startActivity(context, intent, (Bundle) this.f5062c);
    }

    public void m(n0.e eVar) {
        Handler handler = (Handler) this.f5062c;
        a5.b bVar = (a5.b) this.f5061b;
        int i = eVar.f7139b;
        if (i == 0) {
            handler.post(new a3.e(bVar, eVar.f7138a, 14, false));
        } else {
            handler.post(new androidx.emoji2.text.j(bVar, i, 4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:62:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:0x0165 A[LOOP:0: B:3:0x0006->B:79:0x0165, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x019e A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0165, please report this as an issue */
    public q3.h n(q3.k kVar) throws Throwable {
        int i;
        o0 o0Var;
        q3.h hVar;
        String str;
        int i10;
        q3.n nVar;
        int i11;
        Map map;
        String str2 = kVar.f8007c;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            r3.a aVar = null;
            try {
                q3.b bVar = kVar.f8016x;
                if (bVar == null) {
                    try {
                        map = Collections.EMPTY_MAP;
                    } catch (IOException e) {
                        e = e;
                        e = e;
                        if (e instanceof SocketTimeoutException) {
                            o0Var = new o0("socket", new q3.a(), 27, false);
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new RuntimeException("Bad URL " + str2, e);
                            }
                            if (aVar == null) {
                                throw new q3.i(e);
                            }
                            i = aVar.f8124a;
                            q3.q.c("Unexpected response code %d for %s", Integer.valueOf(i), str2);
                            if (aVar != 0) {
                                List listUnmodifiableList = Collections.unmodifiableList(aVar.f8125b);
                                SystemClock.elapsedRealtime();
                                hVar = new q3.h(i, 0, false, listUnmodifiableList);
                                if (i == 401) {
                                }
                                o0Var = new o0("auth", new q3.a(hVar), 27, false);
                            } else {
                                o0Var = new o0("network", new q3.a(), 27, false);
                            }
                        }
                        str = (String) o0Var.f5062c;
                        q0.s sVar = kVar.f8015w;
                        i10 = sVar.f7938a;
                        try {
                            nVar = (q3.n) o0Var.f5061b;
                            i11 = sVar.f7939b + 1;
                            sVar.f7939b = i11;
                            sVar.f7938a = ((int) (i10 * 1.0f)) + i10;
                            if (i11 > 1) {
                                throw nVar;
                            }
                            kVar.a(str + "-retry [timeout=" + i10 + "]");
                        } catch (q3.n e4) {
                            kVar.a(str + "-timeout-giveup [timeout=" + i10 + "]");
                            throw e4;
                        }
                    }
                } else {
                    HashMap map2 = new HashMap();
                    String str3 = bVar.f7979b;
                    if (str3 != null) {
                        map2.put("If-None-Match", str3);
                    }
                    long j4 = bVar.f7981d;
                    if (j4 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                        map2.put("If-Modified-Since", simpleDateFormat.format(new Date(j4)));
                    }
                    map = map2;
                }
                try {
                    r3.a aVarT = ((b9.e) this.f5061b).t(kVar, map);
                    try {
                        int i12 = aVarT.f8124a;
                        List listUnmodifiableList2 = Collections.unmodifiableList(aVarT.f8125b);
                        if (i12 == 304) {
                            SystemClock.elapsedRealtime();
                            return com.bumptech.glide.c.t(kVar, listUnmodifiableList2);
                        }
                        InputStream inputStream = (InputStream) aVarT.f8127d;
                        if (inputStream == null) {
                            inputStream = null;
                        }
                        byte[] bArrV = inputStream != null ? com.bumptech.glide.c.v(inputStream, aVarT.f8126c, (r3.a) this.f5062c) : new byte[0];
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (q3.q.f8026a || jElapsedRealtime2 > 3000) {
                            q3.q.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", kVar, Long.valueOf(jElapsedRealtime2), bArrV != null ? Integer.valueOf(bArrV.length) : "null", Integer.valueOf(i12), Integer.valueOf(kVar.f8015w.f7939b));
                        }
                        if (i12 < 200 || i12 > 299) {
                            throw new IOException();
                        }
                        SystemClock.elapsedRealtime();
                        return new q3.h(i12, bArrV, false, listUnmodifiableList2);
                    } catch (IOException e10) {
                        e = e10;
                        aVar = aVarT;
                        if (e instanceof SocketTimeoutException) {
                            o0Var = new o0("socket", new q3.a(), 27, false);
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new RuntimeException("Bad URL " + str2, e);
                            }
                            if (aVar == null) {
                                throw new q3.i(e);
                            }
                            i = aVar.f8124a;
                            q3.q.c("Unexpected response code %d for %s", Integer.valueOf(i), str2);
                            if (aVar != 0) {
                                List listUnmodifiableList3 = Collections.unmodifiableList(aVar.f8125b);
                                SystemClock.elapsedRealtime();
                                hVar = new q3.h(i, 0, false, listUnmodifiableList3);
                                if (i == 401 && i != 403) {
                                    if (i < 400 || i > 499) {
                                        throw new q3.a(hVar);
                                    }
                                    throw new q3.d(hVar);
                                }
                                o0Var = new o0("auth", new q3.a(hVar), 27, false);
                            } else {
                                o0Var = new o0("network", new q3.a(), 27, false);
                            }
                        }
                        str = (String) o0Var.f5062c;
                        q0.s sVar2 = kVar.f8015w;
                        i10 = sVar2.f7938a;
                        nVar = (q3.n) o0Var.f5061b;
                        i11 = sVar2.f7939b + 1;
                        sVar2.f7939b = i11;
                        sVar2.f7938a = ((int) (i10 * 1.0f)) + i10;
                        if (i11 > 1) {
                            throw nVar;
                        }
                        kVar.a(str + "-retry [timeout=" + i10 + "]");
                    }
                } catch (IOException e11) {
                    e = e11;
                    e = e;
                    if (e instanceof SocketTimeoutException) {
                        o0Var = new o0("socket", new q3.a(), 27, false);
                    } else {
                        if (e instanceof MalformedURLException) {
                            throw new RuntimeException("Bad URL " + str2, e);
                        }
                        if (aVar == null) {
                            throw new q3.i(e);
                        }
                        i = aVar.f8124a;
                        q3.q.c("Unexpected response code %d for %s", Integer.valueOf(i), str2);
                        if (aVar != 0) {
                            List listUnmodifiableList4 = Collections.unmodifiableList(aVar.f8125b);
                            SystemClock.elapsedRealtime();
                            hVar = new q3.h(i, 0, false, listUnmodifiableList4);
                            if (i == 401) {
                            }
                            o0Var = new o0("auth", new q3.a(hVar), 27, false);
                        } else {
                            o0Var = new o0("network", new q3.a(), 27, false);
                        }
                    }
                    str = (String) o0Var.f5062c;
                    q0.s sVar3 = kVar.f8015w;
                    i10 = sVar3.f7938a;
                    nVar = (q3.n) o0Var.f5061b;
                    i11 = sVar3.f7939b + 1;
                    sVar3.f7939b = i11;
                    sVar3.f7938a = ((int) (i10 * 1.0f)) + i10;
                    if (i11 > 1) {
                        throw nVar;
                    }
                    kVar.a(str + "-retry [timeout=" + i10 + "]");
                }
            } catch (IOException e12) {
                e = e12;
            }
            kVar.a(str + "-retry [timeout=" + i10 + "]");
        }
    }

    public void o(o3.k kVar) {
        this.f5061b = kVar;
        if (kVar.a() != null) {
            kVar.a().getClass();
            String str = kVar.a().f7499b;
            if (str != null) {
                this.f5062c = str;
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        k9.c cVar = (k9.c) this.f5061b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f5062c;
        synchronized (cVar.f6102f) {
            cVar.e.remove(taskCompletionSource);
        }
    }

    public void p(int i, int i10, int i11, int i12) {
        CardView cardView = (CardView) this.f5062c;
        cardView.f546d.set(i, i10, i11, i12);
        Rect rect = cardView.f545c;
        super/*android.view.View*/.setPadding(i + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
    }

    @Override // o3.c
    public void q(o3.e eVar) {
        jc.i.e(eVar, "res");
        if (eVar.f7495a == 0) {
            o3.b bVar = (o3.b) this.f5061b;
            bVar.u((i6.e) this.f5062c, new a5.a(bVar, 19));
        }
    }

    public void t(zzhx zzhxVar) {
        try {
            y(zzhxVar, (zzis) this.f5061b);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public String toString() {
        switch (this.f5060a) {
            case 10:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                p3.a.d(sb2, (androidx.lifecycle.r) this.f5061b);
                sb2.append("}}");
                return sb2.toString();
            case 25:
                return "Bounds{lower=" + ((h0.c) this.f5061b) + " upper=" + ((h0.c) this.f5062c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(zzhx zzhxVar, int i, long j4) {
        try {
            zziq zziqVar = (zziq) ((zzis) this.f5061b).zzm();
            zziqVar.zzm(i);
            zzis zzisVar = (zzis) zziqVar.zze();
            this.f5061b = zzisVar;
            if (j4 != 0) {
                zziq zziqVar2 = (zziq) zzisVar.zzm();
                zziqVar2.zzo(j4);
                zzisVar = (zzis) zziqVar2.zze();
            }
            y(zzhxVar, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public void v(zzhx zzhxVar, long j4, boolean z4) {
        zzis zzisVar;
        try {
            zzhv zzhvVar = (zzhv) zzhxVar.zzm();
            zzja zzjaVar = (zzja) zzhxVar.zzB().zzm();
            zzjaVar.zza(z4);
            zzhvVar.zzn(zzjaVar);
            zzhx zzhxVar2 = (zzhx) zzhvVar.zze();
            if (j4 == 0) {
                zzisVar = (zzis) this.f5061b;
            } else {
                zziq zziqVar = (zziq) ((zzis) this.f5061b).zzm();
                zziqVar.zzo(j4);
                zzisVar = (zzis) zziqVar.zze();
            }
            y(zzhxVar2, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public void w(zzhx zzhxVar, int i, long j4, boolean z4) {
        zzis zzisVar;
        try {
            zziq zziqVar = (zziq) ((zzis) this.f5061b).zzm();
            zziqVar.zzm(i);
            this.f5061b = (zzis) zziqVar.zze();
            zzhv zzhvVar = (zzhv) zzhxVar.zzm();
            zzja zzjaVar = (zzja) zzhxVar.zzB().zzm();
            zzjaVar.zza(z4);
            zzhvVar.zzn(zzjaVar);
            zzhx zzhxVar2 = (zzhx) zzhvVar.zze();
            if (j4 == 0) {
                zzisVar = (zzis) this.f5061b;
            } else {
                zziq zziqVar2 = (zziq) ((zzis) this.f5061b).zzm();
                zziqVar2.zzo(j4);
                zzisVar = (zzis) zziqVar2.zze();
            }
            y(zzhxVar2, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public void x(zzjo zzjoVar) {
        try {
            ea.e eVar = (ea.e) this.f5062c;
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn((zzis) this.f5061b);
            zzjgVarZzc.zzo(zzjoVar);
            eVar.e((zzji) zzjgVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public void y(zzhx zzhxVar, zzis zzisVar) {
        if (zzhxVar == null) {
            return;
        }
        try {
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn(zzisVar);
            zzjgVarZzc.zza(zzhxVar);
            ((ea.e) this.f5062c).e((zzji) zzjgVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public void z(zzib zzibVar, zzis zzisVar) {
        if (zzibVar == null) {
            return;
        }
        try {
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn(zzisVar);
            zzjgVarZzc.zzl(zzibVar);
            ((ea.e) this.f5062c).e((zzji) zzjgVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // i6.c
    public boolean zza(String str) {
        l0 l0Var = r0.f5068l;
        r0 r0Var = d6.p.C.f2979c;
        r0.j((Context) this.f5061b, (String) this.f5062c, str);
        return true;
    }

    public /* synthetic */ o0(int i, boolean z4) {
        this.f5060a = i;
    }

    public /* synthetic */ o0(Context context, int i) {
        this.f5060a = i;
        this.f5062c = null;
        this.f5061b = context;
    }

    public /* synthetic */ o0(Object obj, Object obj2, int i, boolean z4) {
        this.f5060a = i;
        this.f5062c = obj;
        this.f5061b = obj2;
    }

    public o0(Context context) {
        this.f5060a = 7;
        this.f5062c = new ArrayList();
        this.f5061b = context.getApplicationContext();
    }

    public o0(Context context, zzis zzisVar) {
        this.f5060a = 20;
        ea.e eVar = new ea.e(4);
        try {
            l5.q.b(context);
            eVar.f3516c = l5.q.a().c(j5.a.e).a("PLAY_BILLING_LIBRARY", new i5.b("proto"), new z9.c());
        } catch (Throwable unused) {
            eVar.f3515b = true;
        }
        this.f5062c = eVar;
        this.f5061b = zzisVar;
    }

    public o0(int i) {
        this.f5060a = i;
        switch (i) {
            case 3:
                this.f5061b = new ArrayList();
                this.f5062c = new HashMap();
                return;
            case 29:
                this.f5060a = 29;
                this.f5061b = new Bundle();
                if (!r4.e.f8153c.contains("google.com") && !r4.e.f8154d.contains("google.com")) {
                    throw new IllegalArgumentException("Unknown provider: ".concat("google.com"));
                }
                this.f5062c = "google.com";
                return;
            default:
                this.f5061b = new AtomicReference();
                this.f5062c = new r.e(0);
                return;
        }
    }

    @Override // o3.c
    public void r() {
    }

    public o0(la.a[] aVarArr) {
        this.f5060a = 8;
        this.f5061b = aVarArr;
        this.f5062c = new b9.e(22);
    }

    public o0(androidx.lifecycle.r rVar, androidx.lifecycle.t0 t0Var) {
        this.f5060a = 10;
        this.f5061b = rVar;
        this.f5062c = (m1.b) new a2.l(t0Var, m1.b.f6978f).q(m1.b.class);
    }

    public o0(ya.b bVar) {
        this.f5060a = 5;
        this.f5062c = Collections.synchronizedMap(new HashMap());
        this.f5061b = bVar;
    }

    public o0(Runnable runnable) {
        this.f5060a = 24;
        this.f5062c = new CopyOnWriteArrayList();
        new HashMap();
        this.f5061b = runnable;
    }

    public o0(b9.e eVar) {
        this.f5060a = 26;
        r3.a aVar = new r3.a();
        this.f5061b = eVar;
        this.f5062c = aVar;
    }

    public o0(Matcher matcher, CharSequence charSequence) {
        this.f5060a = 22;
        jc.i.e(charSequence, "input");
        this.f5061b = matcher;
    }

    public o0(CardView cardView) {
        this.f5060a = 23;
        this.f5062c = cardView;
    }
}
