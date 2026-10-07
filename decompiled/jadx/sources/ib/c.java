package ib;

import a4.e0;
import a4.j0;
import a4.k0;
import a4.y;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import androidx.fragment.app.f0;
import androidx.fragment.app.i0;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.g;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzgee;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d4.j;
import d4.k;
import d9.h;
import da.c0;
import da.n;
import da.p;
import da.q;
import da.s;
import g.u;
import h3.l1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k.l;
import k.x;
import l.m;
import org.json.JSONException;
import org.json.JSONObject;
import q0.d2;
import q0.t;
import r7.i;
import w9.d;
import x9.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements y, j0, Continuation, z, androidx.activity.result.b, ba.b, ca.a, k, t, g, x, zzcha, o3.c, com.google.android.gms.common.api.internal.t, OnSuccessListener, OnFailureListener, OnCanceledListener, m, n5.b, zzgee {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f5254c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5256b;

    public /* synthetic */ c(int i, boolean z4) {
        this.f5255a = i;
    }

    public static void o(ArrayList arrayList, String str, boolean z4) {
        if (arrayList.remove(str)) {
            if (z4) {
                arrayList.add(0, str);
            } else {
                arrayList.add(str);
            }
        }
    }

    public static void p(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
    }

    public static String u(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // ca.a
    public void a(q qVar) {
        this.f5256b = qVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.t
    public void accept(Object obj, Object obj2) throws RemoteException {
        i7.a aVar = (i7.a) ((i7.c) obj).getService();
        v vVar = (v) this.f5256b;
        Parcel parcelZaa = aVar.zaa();
        zac.zac(parcelZaa, vVar);
        aVar.zad(1, parcelZaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override // k.x
    public void b(l lVar, boolean z4) {
        g.t tVar;
        u uVar = (u) this.f5256b;
        l lVarK = lVar.k();
        int i = 0;
        boolean z10 = lVarK != lVar;
        if (z10) {
            lVar = lVarK;
        }
        g.t[] tVarArr = uVar.W;
        int length = tVarArr != null ? tVarArr.length : 0;
        while (true) {
            if (i < length) {
                tVar = tVarArr[i];
                if (tVar != null && tVar.h == lVar) {
                    break;
                } else {
                    i++;
                }
            } else {
                tVar = null;
                break;
            }
        }
        if (tVar != null) {
            if (!z10) {
                uVar.w(tVar, z4);
            } else {
                uVar.u(tVar.f4070a, tVar, lVarK);
                uVar.w(tVar, true);
            }
        }
    }

    @Override // d4.k
    public int d() {
        return (g() << 8) | g();
    }

    @Override // androidx.activity.result.b
    public void e(Object obj) {
        Map map = (Map) obj;
        i0 i0Var = (i0) this.f5256b;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        f0 f0Var = (f0) i0Var.f896w.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = f0Var.f866a;
            if (i0Var.f879c.o(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    @Override // com.bumptech.glide.load.data.g
    public Object f() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f5256b;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // d4.k
    public short g() throws IOException {
        int i = ((InputStream) this.f5256b).read();
        if (i != -1) {
            return (short) i;
        }
        throw new j();
    }

    @Override // tb.a
    public Object get() {
        return new a2.l((Context) ((n5.c) this.f5256b).f7282a, new r7.j(), new i(), 27);
    }

    @Override // k.x
    public boolean h(l lVar) {
        Window.Callback callback;
        u uVar = (u) this.f5256b;
        if (lVar != lVar.k() || !uVar.Q || (callback = uVar.f4106w.getCallback()) == null || uVar.f4088b0) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    @Override // a4.y
    public a4.x i(e0 e0Var) {
        switch (this.f5255a) {
            case 2:
                return new k0(this);
            default:
                return new b4.a((c) this.f5256b);
        }
    }

    @Override // d4.k
    public int j(int i, byte[] bArr) throws j {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i && (i11 = ((InputStream) this.f5256b).read(bArr, i10, i - i10)) != -1) {
            i10 += i11;
        }
        if (i10 == 0 && i11 == -1) {
            throw new j();
        }
        return i10;
    }

    @Override // q0.t
    public d2 k(View view, d2 d2Var) {
        h hVar = (h) this.f5256b;
        hVar.f3069m = d2Var.a();
        hVar.f3070n = d2Var.b();
        hVar.f3071o = d2Var.c();
        hVar.f();
        return d2Var;
    }

    @Override // ba.b
    public void l(String str, Bundle bundle) {
        q qVar = (q) this.f5256b;
        if (qVar != null) {
            try {
                String str2 = "$A$:" + u(str, bundle);
                s sVar = qVar.f3139a;
                long jCurrentTimeMillis = System.currentTimeMillis() - sVar.f3145d;
                p pVar = sVar.f3147g;
                pVar.e.d(new n(pVar, jCurrentTimeMillis, str2));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // androidx.lifecycle.z
    public void m(Object obj) {
        r rVar = (r) obj;
        androidx.fragment.app.l lVar = (androidx.fragment.app.l) this.f5256b;
        if (rVar == null || !lVar.f919m0) {
            return;
        }
        View viewV = lVar.V();
        if (viewV.getParent() != null) {
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
        if (lVar.f923q0 != null) {
            if (i0.D(3)) {
                Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + lVar.f923q0);
            }
            lVar.f923q0.setContentView(viewV);
        }
    }

    @Override // a4.j0
    public e n(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.f5256b, uri, 0);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((CountDownLatch) this.f5256b).countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.f5256b).countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f5256b).countDown();
    }

    @Override // o3.c
    public void q(o3.e eVar) {
        MainActivity mainActivity = (MainActivity) this.f5256b;
        String str = mainActivity.W;
        jc.i.e(eVar, "billingResult");
        if (eVar.f7495a != 0) {
            Log.e(str, "Billing FALLO: code=" + eVar.f7495a + ", msg=" + eVar.f7497c);
            Toast.makeText(mainActivity, mainActivity.getString(R.string.error_billing_connection), 0).show();
            return;
        }
        Log.d(str, "Billing conectado OK");
        Log.d(str, "checkSubscriptionStatus: iniciando consulta...");
        i6.e eVar2 = new i6.e(2);
        eVar2.f5226b = "subs";
        c cVarA = eVar2.a();
        o3.b bVar = mainActivity.X;
        if (bVar != null) {
            bVar.y(cVarA, new l1(mainActivity, 3));
        } else {
            jc.i.i("billingClient");
            throw null;
        }
    }

    @Override // o3.c
    public void r() {
        MainActivity mainActivity = (MainActivity) this.f5256b;
        Log.w(mainActivity.W, "Billing DESCONECTADO, reconectando...");
        o3.b bVar = mainActivity.X;
        if (bVar != null) {
            bVar.z(this);
        } else {
            jc.i.i("billingClient");
            throw null;
        }
    }

    public void s(c3.j jVar, Thread thread, Throwable th) {
        p pVar = (p) this.f5256b;
        synchronized (pVar) {
            try {
                String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    try {
                        c0.a(pVar.e.e(new da.m(pVar, System.currentTimeMillis(), th, thread, jVar)));
                    } catch (TimeoutException unused) {
                        Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                    }
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // d4.k
    public long skip(long j4) throws IOException {
        InputStream inputStream = (InputStream) this.f5256b;
        if (j4 < 0) {
            return 0L;
        }
        long j10 = j4;
        while (j10 > 0) {
            long jSkip = inputStream.skip(j10);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j10 -= jSkip;
        }
        return j4 - j10;
    }

    public JSONObject t() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f5256b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(da.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        da.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    da.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            da.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e4) {
            e = e4;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            da.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        s4.c cVar = (s4.c) this.f5256b;
        List arrayList = ((d) task.getResult()).f9818a;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList(cVar.f8395b.size());
        Iterator it = cVar.f8395b.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r4.c) it.next()).f8145a);
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (true) {
            byte b10 = 3;
            String str = "google.com";
            if (!it2.hasNext()) {
                if (arrayList2.contains("emailLink") && arrayList.contains("password") && !arrayList.contains("emailLink")) {
                    arrayList3.add(0, "emailLink");
                }
                if (task.isSuccessful() && arrayList3.isEmpty() && !arrayList.isEmpty()) {
                    return Tasks.forException(new r4.g(3));
                }
                o(arrayList3, "password", true);
                o(arrayList3, "google.com", true);
                o(arrayList3, "emailLink", false);
                return Tasks.forResult(arrayList3);
            }
            String str2 = (String) it2.next();
            str2.getClass();
            switch (str2.hashCode()) {
                case -1830313082:
                    b10 = !str2.equals("twitter.com") ? (byte) -1 : (byte) 0;
                    break;
                case -1536293812:
                    b10 = !str2.equals("google.com") ? (byte) -1 : (byte) 1;
                    break;
                case -364826023:
                    b10 = !str2.equals("facebook.com") ? (byte) -1 : (byte) 2;
                    break;
                case 106642798:
                    if (!str2.equals("phone")) {
                        b10 = -1;
                    }
                    break;
                case 1216985755:
                    b10 = !str2.equals("password") ? (byte) -1 : (byte) 4;
                    break;
                case 1985010934:
                    b10 = !str2.equals("github.com") ? (byte) -1 : (byte) 5;
                    break;
                case 2120171958:
                    b10 = !str2.equals("emailLink") ? (byte) -1 : (byte) 6;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    str = "twitter.com";
                    break;
                case 1:
                    break;
                case 2:
                    str = "facebook.com";
                    break;
                case 3:
                    str = "phone";
                    break;
                case 4:
                    str = "password";
                    break;
                case 5:
                    str = "github.com";
                    break;
                case 6:
                    str = "emailLink";
                    break;
                default:
                    str = str2;
                    break;
            }
            if (arrayList2.contains(str)) {
                arrayList3.add(0, str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public void zza(Throwable th) {
        d6.p.C.f2982g.zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        o6.i iVar = (o6.i) this.f5256b;
        zzdsr zzdsrVar = iVar.f7631v;
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        AtomicInteger atomicInteger = iVar.N;
        android.support.v4.media.session.a.N(zzdsrVar, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        i6.h.e("Failed to initialize webview for loading SDKCore. ", th);
        zzbce zzbceVar = zzbcn.zzjn;
        e6.t tVar = e6.t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() || iVar.M.get()) {
            return;
        }
        if (atomicInteger.getAndIncrement() < ((Integer) tVar.f3440c.zza(zzbcn.zzjo)).intValue()) {
            iVar.J();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public void zzb(Object obj) {
        o6.i iVar = (o6.i) this.f5256b;
        i6.h.b("Initialized webview successfully for SDKCore.");
        if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzjn)).booleanValue()) {
            android.support.v4.media.session.a.N(iVar.f7631v, "sgs", new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(iVar.N.get())));
            iVar.M.set(true);
        }
    }

    public /* synthetic */ c(i6.e eVar) {
        this.f5255a = 27;
        this.f5256b = eVar.f5226b;
    }

    public /* synthetic */ c(Object obj, int i) {
        this.f5255a = i;
        this.f5256b = obj;
    }

    public c(int i) {
        this.f5255a = i;
        switch (i) {
            case 1:
                this.f5256b = new a4.u(500L);
                break;
            case 7:
                this.f5256b = new c(1);
                break;
            case 9:
                this.f5256b = new HashMap();
                break;
            case 15:
                this.f5256b = new LinkedHashSet();
                break;
            case 20:
                this.f5256b = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
            case 23:
                this.f5256b = new CountDownLatch(1);
                break;
            default:
                this.f5256b = new HashSet();
                break;
        }
    }

    public c(o oVar) {
        this.f5255a = 29;
        this.f5256b = new AtomicReference();
        oVar.a(new a5.a(this, 22));
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public void zza(boolean z4, int i, String str, String str2) {
        zzcfk zzcfkVar = ((g6.i) this.f5256b).f4198c;
        if (zzcfkVar != null) {
            zzcfkVar.zzaa();
        }
    }

    public c(ia.b bVar) {
        this.f5255a = 22;
        this.f5256b = new File(bVar.f5246b, "com.crashlytics.settings.json");
    }

    public c(Context context) {
        boolean zIsEmpty;
        this.f5255a = 18;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f5256b = sharedPreferences;
        File file = new File(e0.k.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    @Override // com.bumptech.glide.load.data.g
    public void c() {
    }
}
