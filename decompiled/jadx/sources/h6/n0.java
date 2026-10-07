package h6;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzazl;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5037b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m9.a f5039d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f5040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f5041g;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f5042j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5036a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5038c = new ArrayList();
    public zzazl e = null;
    public boolean h = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5043k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f5044l = "-1";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5045m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public zzbzt f5046n = new zzbzt("", 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5047o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f5048p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5049q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5050r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Set f5051s = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public JSONObject f5052t = new JSONObject();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5053u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5054v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f5055w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f5056x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5057y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f5058z = "";
    public String A = "{}";
    public int B = -1;
    public int C = -1;
    public long D = 0;

    public final void a(int i) {
        l();
        synchronized (this.f5036a) {
            try {
                this.f5045m = i;
                SharedPreferences.Editor editor = this.f5041g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.f5041g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str) {
        if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzjb)).booleanValue()) {
            l();
            synchronized (this.f5036a) {
                try {
                    if (this.A.equals(str)) {
                        return;
                    }
                    this.A = str;
                    SharedPreferences.Editor editor = this.f5041g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f5041g.apply();
                    }
                    m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(boolean z4) {
        l();
        synchronized (this.f5036a) {
            try {
                if (z4 == this.f5043k) {
                    return;
                }
                this.f5043k = z4;
                SharedPreferences.Editor editor = this.f5041g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z4);
                    this.f5041g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(boolean z4) {
        l();
        synchronized (this.f5036a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) e6.t.f3437d.f3440c.zza(zzbcn.zzke)).longValue();
                SharedPreferences.Editor editor = this.f5041g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z4);
                    this.f5041g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f5041g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(String str, String str2, boolean z4) {
        l();
        synchronized (this.f5036a) {
            try {
                JSONArray jSONArrayOptJSONArray = this.f5052t.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        if (!z4 || !jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            length = i;
                            break;
                        }
                        return;
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z4);
                    d6.p.C.f2983j.getClass();
                    jSONObject.put("timestamp_ms", System.currentTimeMillis());
                    jSONArrayOptJSONArray.put(length, jSONObject);
                    this.f5052t.put(str, jSONArrayOptJSONArray);
                } catch (JSONException e) {
                    i6.h.h("Could not update native advanced settings", e);
                }
                SharedPreferences.Editor editor = this.f5041g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f5052t.toString());
                    this.f5041g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(int i) {
        l();
        synchronized (this.f5036a) {
            try {
                if (this.C == i) {
                    return;
                }
                this.C = i;
                SharedPreferences.Editor editor = this.f5041g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f5041g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(long j4) {
        l();
        synchronized (this.f5036a) {
            try {
                if (this.D == j4) {
                    return;
                }
                this.D = j4;
                SharedPreferences.Editor editor = this.f5041g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j4);
                    this.f5041g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(String str) {
        l();
        synchronized (this.f5036a) {
            try {
                this.f5044l = str;
                if (this.f5041g != null) {
                    if (str.equals("-1")) {
                        this.f5041g.remove("IABTCF_TCString");
                    } else {
                        this.f5041g.putString("IABTCF_TCString", str);
                    }
                    this.f5041g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i() {
        boolean z4;
        l();
        synchronized (this.f5036a) {
            z4 = this.f5053u;
        }
        return z4;
    }

    public final boolean j() {
        boolean z4;
        l();
        synchronized (this.f5036a) {
            z4 = this.f5054v;
        }
        return z4;
    }

    public final boolean k() {
        boolean z4;
        if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzaE)).booleanValue()) {
            return false;
        }
        l();
        synchronized (this.f5036a) {
            z4 = this.f5043k;
        }
        return z4;
    }

    public final void l() {
        m9.a aVar = this.f5039d;
        if (aVar == null || aVar.isDone()) {
            return;
        }
        try {
            this.f5039d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            i6.h.h("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e4) {
            e = e4;
            i6.h.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e10) {
            e = e10;
            i6.h.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e11) {
            e = e11;
            i6.h.e("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void m() {
        zzcaj.zza.execute(new androidx.activity.i(this, 22));
    }

    public final zzbzt n() {
        zzbzt zzbztVar;
        l();
        synchronized (this.f5036a) {
            try {
                if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzlq)).booleanValue() && this.f5046n.zzj()) {
                    ArrayList arrayList = this.f5038c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Runnable) obj).run();
                    }
                }
                zzbztVar = this.f5046n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbztVar;
    }

    public final String o() {
        String str;
        l();
        synchronized (this.f5036a) {
            str = this.f5055w;
        }
        return str;
    }

    public final void p(Context context) {
        synchronized (this.f5036a) {
            try {
                if (this.f5040f != null) {
                    return;
                }
                this.f5039d = zzcaj.zza.zza(new a3.e(this, context, 13, false));
                this.f5037b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(String str) {
        if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zziO)).booleanValue()) {
            l();
            synchronized (this.f5036a) {
                try {
                    if (this.f5058z.equals(str)) {
                        return;
                    }
                    this.f5058z = str;
                    SharedPreferences.Editor editor = this.f5041g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f5041g.apply();
                    }
                    m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void r(boolean z4) {
        if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zziO)).booleanValue()) {
            l();
            synchronized (this.f5036a) {
                try {
                    if (this.f5057y == z4) {
                        return;
                    }
                    this.f5057y = z4;
                    SharedPreferences.Editor editor = this.f5041g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z4);
                        this.f5041g.apply();
                    }
                    m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void s(String str) {
        l();
        synchronized (this.f5036a) {
            try {
                if (TextUtils.equals(this.f5055w, str)) {
                    return;
                }
                this.f5055w = str;
                SharedPreferences.Editor editor = this.f5041g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f5041g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(long j4) {
        l();
        synchronized (this.f5036a) {
            try {
                if (this.f5048p == j4) {
                    return;
                }
                this.f5048p = j4;
                SharedPreferences.Editor editor = this.f5041g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j4);
                    this.f5041g.apply();
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
