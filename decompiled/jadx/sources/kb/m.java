package kb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import da.v;
import e6.q;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f6188p = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f6189q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f6190a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6192c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f6194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f6195g;
    public final n9.g h;
    public final za.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f6196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f6197k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k f6201o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6191b = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Random f6199m = new Random();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n7.b f6200n = n7.b.f7302a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6198l = "firebase";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6193d = false;
    public boolean e = false;

    public m(n9.g gVar, za.d dVar, h hVar, c cVar, Context context, LinkedHashSet linkedHashSet, k kVar, ScheduledExecutorService scheduledExecutorService) {
        this.f6190a = linkedHashSet;
        this.f6194f = scheduledExecutorService;
        this.f6192c = Math.max(8 - kVar.b().f6180a, 1);
        this.h = gVar;
        this.f6195g = hVar;
        this.i = dVar;
        this.f6196j = cVar;
        this.f6197k = context;
        this.f6201o = kVar;
    }

    public static void b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean a() {
        return (this.f6190a.isEmpty() || this.f6191b || this.f6193d || this.e) ? false : true;
    }

    public final String c(String str) {
        n9.g gVar = this.h;
        gVar.a();
        Matcher matcher = f6189q.matcher(gVar.f7361c.f7367b);
        return v.k("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j4) {
        try {
            if (a()) {
                int i = this.f6192c;
                if (i > 0) {
                    this.f6192c = i - 1;
                    this.f6194f.schedule(new androidx.activity.i(this, 24), j4, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    new jb.c("Unable to connect to the server. Check your connection and try again.");
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        Iterator it = this.f6190a.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a();
        }
    }

    public final synchronized void h() {
        this.f6200n.getClass();
        e(Math.max(0L, this.f6201o.b().f6181b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final void i(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        String strC;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        n9.g gVar = this.h;
        gVar.a();
        n9.j jVar = gVar.f7361c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", jVar.f7366a);
        Context context = this.f6197k;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrG = n7.c.g(context, context.getPackageName());
            if (bArrG == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strC = null;
            } else {
                strC = n7.c.c(bArrG);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strC);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        HashMap map = new HashMap();
        gVar.a();
        Matcher matcher = f6189q.matcher(jVar.f7367b);
        map.put("project", matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.f6198l);
        map.put("lastKnownVersionNumber", Long.toString(this.f6195g.f6174g.f6183a.getLong("last_template_version", 0L)));
        gVar.a();
        map.put("appId", jVar.f7367b);
        map.put("sdkVersion", "21.4.1");
        map.put("appInstanceId", str);
        byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final synchronized q j(HttpURLConnection httpURLConnection) {
        return new q(httpURLConnection, this.f6195g, this.f6196j, this.f6190a, new l(this), this.f6194f);
    }

    public final void k(Date date) {
        k kVar = this.f6201o;
        int i = kVar.b().f6180a + 1;
        long millis = TimeUnit.MINUTES.toMillis(f6188p[(i < 8 ? i : 8) - 1]);
        kVar.d(i, new Date(date.getTime() + (millis / 2) + ((long) this.f6199m.nextInt((int) millis))));
    }
}
