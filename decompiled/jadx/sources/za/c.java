package za;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import x9.m;
import y9.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f11536m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9.g f11537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bb.d f11538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa.c f11539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f11540d;
    public final m e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f11541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11542g;
    public final ExecutorService h;
    public final k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f11543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f11544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f11545l;

    static {
        new AtomicInteger(1);
    }

    public c(n9.g gVar, ya.b bVar, ExecutorService executorService, k kVar) {
        gVar.a();
        bb.d dVar = new bb.d(gVar.f7359a, bVar);
        aa.c cVar = new aa.c(gVar);
        if (b9.e.f1438b == null) {
            b9.e.f1438b = new b9.e(5);
        }
        b9.e eVar = b9.e.f1438b;
        if (j.f11553d == null) {
            j.f11553d = new j(eVar);
        }
        j jVar = j.f11553d;
        m mVar = new m(new x9.d(gVar, 2));
        h hVar = new h();
        this.f11542g = new Object();
        this.f11544k = new HashSet();
        this.f11545l = new ArrayList();
        this.f11537a = gVar;
        this.f11538b = dVar;
        this.f11539c = cVar;
        this.f11540d = jVar;
        this.e = mVar;
        this.f11541f = hVar;
        this.h = executorService;
        this.i = kVar;
    }

    public final void a() {
        ab.b bVarF;
        synchronized (f11536m) {
            try {
                n9.g gVar = this.f11537a;
                gVar.a();
                s5.j jVarA = s5.j.a(gVar.f7359a);
                try {
                    bVarF = this.f11539c.F();
                    int i = bVarF.f273b;
                    boolean z4 = true;
                    if (i != 2 && i != 1) {
                        z4 = false;
                    }
                    if (z4) {
                        String strF = f(bVarF);
                        aa.c cVar = this.f11539c;
                        ab.a aVarA = bVarF.a();
                        aVarA.f267b = strF;
                        aVarA.f266a = 3;
                        bVarF = aVarA.i();
                        cVar.B(bVarF);
                    }
                    if (jVarA != null) {
                        jVarA.y();
                    }
                } catch (Throwable th) {
                    if (jVarA != null) {
                        jVarA.y();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(bVarF);
        this.i.execute(new b(this, 1));
    }

    public final ab.b b(ab.b bVar) throws e {
        HttpURLConnection httpURLConnectionC;
        bb.c cVarF;
        bb.d dVar = this.f11538b;
        n9.g gVar = this.f11537a;
        gVar.a();
        String str = gVar.f7361c.f7366a;
        String str2 = bVar.f272a;
        n9.g gVar2 = this.f11537a;
        gVar2.a();
        String str3 = gVar2.f7361c.f7371g;
        String str4 = bVar.f275d;
        bb.e eVar = dVar.f1533c;
        if (!eVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = bb.d.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionC = dVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    bb.d.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    eVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        cVarF = bb.d.f(httpURLConnectionC);
                        break;
                    }
                    bb.d.b(httpURLConnectionC, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        bb.b bVarA = bb.c.a();
                        bVarA.f1524b = 3;
                        cVarF = bVarA.b();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        bb.b bVarA2 = bb.c.a();
                        bVarA2.f1524b = 2;
                        cVarF = bVarA2.b();
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iD = u.e.d(cVarF.f1529c);
        if (iD != 0) {
            if (iD == 1) {
                ab.a aVarA = bVar.a();
                aVarA.e = "BAD CONFIG";
                aVarA.f266a = 5;
                return aVarA.i();
            }
            if (iD != 2) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.f11543j = null;
            }
            ab.a aVarA2 = bVar.a();
            aVarA2.f266a = 2;
            return aVarA2.i();
        }
        String str5 = cVarF.f1527a;
        long j4 = cVarF.f1528b;
        j jVar = this.f11540d;
        jVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jVar.f11554a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        ab.a aVarA3 = bVar.a();
        aVarA3.f268c = str5;
        aVarA3.f270f = Long.valueOf(j4);
        aVarA3.f271g = Long.valueOf(seconds);
        return aVarA3.i();
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.f11543j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g gVar = new g(taskCompletionSource);
        synchronized (this.f11542g) {
            this.f11545l.add(gVar);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 0));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        f fVar = new f(this.f11540d, taskCompletionSource);
        synchronized (this.f11542g) {
            this.f11545l.add(fVar);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 2));
        return task;
    }

    public final void e() {
        n9.g gVar = this.f11537a;
        gVar.a();
        i0.f(gVar.f7361c.f7367b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        i0.f(gVar.f7361c.f7371g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        i0.f(gVar.f7361c.f7366a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f7361c.f7367b;
        Pattern pattern = j.f11552c;
        i0.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        i0.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f11552c.matcher(gVar.f7361c.f7366a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: all -> 0x003f, DONT_GENERATE, TRY_ENTER, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final String f(ab.b bVar) {
        ab.c cVar;
        String string;
        n9.g gVar = this.f11537a;
        gVar.a();
        if (!gVar.f7360b.equals("CHIME_ANDROID_SDK")) {
            n9.g gVar2 = this.f11537a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f7360b)) {
                if (bVar.f273b == 1) {
                    cVar = (ab.c) this.e.get();
                    synchronized (cVar.f279a) {
                        try {
                            synchronized (cVar.f279a) {
                                string = cVar.f279a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = cVar.a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f11541f.getClass();
                    return h.a();
                }
            }
        } else if (bVar.f273b == 1) {
            cVar = (ab.c) this.e.get();
            synchronized (cVar.f279a) {
                synchronized (cVar.f279a) {
                    string = cVar.f279a.getString("|S|id", null);
                    if (string != null) {
                        string = cVar.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f11541f.getClass();
                    return h.a();
                }
            }
        }
        this.f11541f.getClass();
        return h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [bb.d] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [bb.a] */
    public final ab.b g(ab.b bVar) throws e {
        String str = bVar.f272a;
        String string = null;
        if (str != null && str.length() == 11) {
            ab.c cVar = (ab.c) this.e.get();
            synchronized (cVar.f279a) {
                try {
                    String[] strArr = ab.c.f278c;
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            break;
                        }
                        String str2 = strArr[i];
                        String string2 = cVar.f279a.getString("|T|" + cVar.f280b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        bb.d dVar = this.f11538b;
        n9.g gVar = this.f11537a;
        gVar.a();
        String str3 = gVar.f7361c.f7366a;
        String str4 = bVar.f272a;
        n9.g gVar2 = this.f11537a;
        gVar2.a();
        String str5 = gVar2.f7361c.f7371g;
        n9.g gVar3 = this.f11537a;
        gVar3.a();
        String str6 = gVar3.f7361c.f7367b;
        bb.e eVar = dVar.f1533c;
        if (!eVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = bb.d.a("projects/" + str5 + "/installations");
        int i10 = 0;
        bb.a aVar = dVar;
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    bb.d.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    eVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        bb.a aVarE = bb.d.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = aVarE;
                    } else {
                        try {
                            bb.d.b(httpURLConnectionC, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                bb.a aVar2 = new bb.a(null, null, null, null, 2);
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar = aVar2;
                            } else {
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i10++;
                                aVar = aVar;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        aVar = aVar;
                    }
                    int iD = u.e.d(aVar.e);
                    if (iD != 0) {
                        if (iD != 1) {
                            throw new e("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        ab.a aVarA = bVar.a();
                        aVarA.e = "BAD CONFIG";
                        aVarA.f266a = 5;
                        return aVarA.i();
                    }
                    String str7 = aVar.f1520b;
                    String str8 = aVar.f1521c;
                    j jVar = this.f11540d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f11554a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    bb.c cVar2 = aVar.f1522d;
                    String str9 = cVar2.f1527a;
                    long j4 = cVar2.f1528b;
                    ab.a aVarA2 = bVar.a();
                    aVarA2.f267b = str7;
                    aVarA2.f266a = 4;
                    aVarA2.f268c = str9;
                    aVarA2.f269d = str8;
                    aVarA2.f270f = Long.valueOf(j4);
                    aVarA2.f271g = Long.valueOf(seconds);
                    return aVarA2.i();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f11542g) {
            try {
                Iterator it = this.f11545l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(ab.b bVar) {
        synchronized (this.f11542g) {
            try {
                Iterator it = this.f11545l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
