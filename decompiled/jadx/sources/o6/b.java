package o6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbcn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f7591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i6.a f7593d;
    public final JSONObject e = new JSONObject();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f7594f = new AtomicBoolean(false);

    public b(Context context, List list, i6.a aVar) {
        this.f7590a = context;
        this.f7591b = context.getApplicationInfo();
        this.f7592c = list;
        this.f7593d = aVar;
    }

    public final JSONObject a() {
        if (!this.f7594f.get()) {
            b();
        }
        return this.e;
    }

    public final void b() {
        if (this.f7594f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoF = null;
        ApplicationInfo applicationInfo = this.f7591b;
        if (applicationInfo != null) {
            try {
                packageInfoF = p7.c.a(this.f7590a).f(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.e;
        if (packageInfoF != null) {
            try {
                jSONObject.put("vc", packageInfoF.versionCode);
                jSONObject.put("vnm", packageInfoF.versionName);
            } catch (JSONException e) {
                d6.p.C.f2982g.zzw(e, "PawAppSignalGenerator.initialize");
                return;
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        List list = this.f7592c;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) e6.t.f3437d.f3440c.zza(zzbcn.zzjs)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject.put("eid", arrayList);
        jSONObject.put("js", this.f7593d.f5213a);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
    }
}
