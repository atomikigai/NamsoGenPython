package d6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzdsl;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzfjz;
import com.google.android.gms.internal.ads.zzfka;
import com.google.android.gms.internal.ads.zzfko;
import com.google.android.gms.internal.ads.zzgdp;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzges;
import e6.t;
import h6.k0;
import h6.n0;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2936c;

    public e(n7.b bVar) {
        this.f2934a = 3;
        i0.i(bVar);
        this.f2936c = bVar;
    }

    public static final void k(zzdsm zzdsmVar, String str, long j4) {
        if (zzdsmVar != null) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmp)).booleanValue()) {
                zzdsl zzdslVarZza = zzdsmVar.zza();
                zzdslVarZza.zzb("action", "lat_init");
                zzdslVarZza.zzb(str, Long.toString(j4));
                zzdslVarZza.zzf();
            }
        }
    }

    public void a(int i) {
        if (i < 64) {
            this.f2935b &= ~(1 << i);
            return;
        }
        e eVar = (e) this.f2936c;
        if (eVar != null) {
            eVar.a(i - 64);
        }
    }

    public int b(int i) {
        e eVar = (e) this.f2936c;
        if (eVar == null) {
            return i >= 64 ? Long.bitCount(this.f2935b) : Long.bitCount(this.f2935b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2935b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2935b) + eVar.b(i - 64);
    }

    public void c() {
        if (((e) this.f2936c) == null) {
            this.f2936c = new e(2);
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f2935b & (1 << i)) != 0;
        }
        c();
        return ((e) this.f2936c).d(i - 64);
    }

    public void e(int i, boolean z4) {
        if (i >= 64) {
            c();
            ((e) this.f2936c).e(i - 64, z4);
            return;
        }
        long j4 = this.f2935b;
        boolean z10 = (Long.MIN_VALUE & j4) != 0;
        long j10 = (1 << i) - 1;
        this.f2935b = ((j4 & (~j10)) << 1) | (j4 & j10);
        if (z4) {
            i(i);
        } else {
            a(i);
        }
        if (z10 || ((e) this.f2936c) != null) {
            c();
            ((e) this.f2936c).e(0, z10);
        }
    }

    public bd.m f() {
        bd.l lVar = new bd.l(0);
        while (true) {
            String strR = ((od.h) this.f2936c).r(this.f2935b);
            this.f2935b -= (long) strR.length();
            if (strR.length() == 0) {
                return lVar.b();
            }
            int iJ0 = pc.g.j0(strR, ':', 1, 4);
            if (iJ0 != -1) {
                String strSubstring = strR.substring(0, iJ0);
                jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = strR.substring(iJ0 + 1);
                jc.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                lVar.a(strSubstring, strSubstring2);
            } else if (strR.charAt(0) == ':') {
                String strSubstring3 = strR.substring(1);
                jc.i.d(strSubstring3, "this as java.lang.String).substring(startIndex)");
                lVar.a("", strSubstring3);
            } else {
                lVar.a("", strR);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((e) this.f2936c).g(i - 64);
        }
        long j4 = 1 << i;
        long j10 = this.f2935b;
        boolean z4 = (j10 & j4) != 0;
        long j11 = j10 & (~j4);
        this.f2935b = j11;
        long j12 = j4 - 1;
        this.f2935b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        e eVar = (e) this.f2936c;
        if (eVar != null) {
            if (eVar.d(0)) {
                i(63);
            }
            ((e) this.f2936c).g(0);
        }
        return z4;
    }

    public void h() {
        this.f2935b = 0L;
        e eVar = (e) this.f2936c;
        if (eVar != null) {
            eVar.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f2935b |= 1 << i;
        } else {
            c();
            ((e) this.f2936c).i(i - 64);
        }
    }

    public void j(Context context, i6.a aVar, boolean z4, zzbzt zzbztVar, String str, String str2, Runnable runnable, final zzfko zzfkoVar, final zzdsm zzdsmVar, final Long l2) {
        PackageInfo packageInfoF;
        p pVar = p.C;
        n7.b bVar = pVar.f2983j;
        n7.b bVar2 = pVar.f2983j;
        bVar.getClass();
        if (SystemClock.elapsedRealtime() - this.f2935b < 5000) {
            i6.h.g("Not retrying to fetch app settings");
            return;
        }
        bVar2.getClass();
        this.f2935b = SystemClock.elapsedRealtime();
        if (zzbztVar != null && !TextUtils.isEmpty(zzbztVar.zzc())) {
            long jZza = zzbztVar.zza();
            bVar2.getClass();
            if (System.currentTimeMillis() - jZza <= ((Long) t.f3437d.f3440c.zza(zzbcn.zzei)).longValue() && zzbztVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            i6.h.g("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            i6.h.g("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f2936c = applicationContext;
        final zzfka zzfkaVarZza = zzfjz.zza(context, 4);
        zzfkaVarZza.zzi();
        zzboi zzboiVarZza = pVar.f2990q.zza((Context) this.f2936c, aVar, zzfkoVar);
        zzboc zzbocVar = zzbof.zza;
        zzbny zzbnyVarZza = zzboiVarZza.zza("google.afma.config.fetchAppSettings", zzbocVar, zzbocVar);
        boolean z10 = false;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z4);
            jSONObject.put("pn", context.getPackageName());
            zzbce zzbceVar = zzbcn.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", t.f3437d.f3438a.zza()));
            jSONObject.put("js", aVar.f5213a);
            try {
                ApplicationInfo applicationInfo = ((Context) this.f2936c).getApplicationInfo();
                if (applicationInfo != null && (packageInfoF = p7.c.a(context).f(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", packageInfoF.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                k0.k("Error fetching PackageInfo.");
            }
            m9.a aVarZzb = zzbnyVarZza.zzb(jSONObject);
            zzgdp zzgdpVar = new zzgdp() { // from class: d6.d
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final m9.a zza(Object obj) throws JSONException {
                    Long l10 = l2;
                    zzdsm zzdsmVar2 = zzdsmVar;
                    zzfko zzfkoVar2 = zzfkoVar;
                    zzfka zzfkaVar = zzfkaVarZza;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    int i = 0;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        String string = jSONObject2.getString("appSettingsJson");
                        p pVar2 = p.C;
                        n0 n0Var = (n0) pVar2.f2982g.zzi();
                        n0Var.l();
                        synchronized (n0Var.f5036a) {
                            try {
                                pVar2.f2983j.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (string == null || string.equals(n0Var.f5046n.zzc())) {
                                    n0Var.f5046n.zzg(jCurrentTimeMillis);
                                } else {
                                    n0Var.f5046n = new zzbzt(string, jCurrentTimeMillis);
                                    SharedPreferences.Editor editor = n0Var.f5041g;
                                    if (editor != null) {
                                        editor.putString("app_settings_json", string);
                                        n0Var.f5041g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                                        n0Var.f5041g.apply();
                                    }
                                    n0Var.m();
                                    ArrayList arrayList = n0Var.f5038c;
                                    int size = arrayList.size();
                                    while (i < size) {
                                        Object obj2 = arrayList.get(i);
                                        i++;
                                        ((Runnable) obj2).run();
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (l10 != null) {
                            p.C.f2983j.getClass();
                            e.k(zzdsmVar2, "cld_s", SystemClock.elapsedRealtime() - l10.longValue());
                        }
                    }
                    zzfkaVar.zzg(zOptBoolean);
                    zzfkoVar2.zzb(zzfkaVar.zzm());
                    return zzgei.zzh(null);
                }
            };
            zzges zzgesVar = zzcaj.zzf;
            m9.a aVarZzn = zzgei.zzn(aVarZzb, zzgdpVar, zzgesVar);
            if (runnable != null) {
                aVarZzb.addListener(runnable, zzgesVar);
            }
            if (l2 != null) {
                aVarZzb.addListener(new a3.e(zzdsmVar, l2, 6, z10), zzgesVar);
            }
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhr)).booleanValue()) {
                zzcam.zzb(aVarZzn, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzcam.zza(aVarZzn, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e) {
            i6.h.e("Error requesting application settings", e);
            zzfkaVarZza.zzh(e);
            zzfkaVarZza.zzg(false);
            zzfkoVar.zzb(zzfkaVarZza.zzm());
        }
    }

    public String toString() {
        switch (this.f2934a) {
            case 2:
                if (((e) this.f2936c) == null) {
                    return Long.toBinaryString(this.f2935b);
                }
                return ((e) this.f2936c).toString() + "xx" + Long.toBinaryString(this.f2935b);
            default:
                return super.toString();
        }
    }

    public e(od.h hVar) {
        this.f2934a = 1;
        jc.i.e(hVar, "source");
        this.f2936c = hVar;
        this.f2935b = 262144L;
    }

    public e(int i) {
        this.f2934a = i;
        switch (i) {
            case 2:
                this.f2935b = 0L;
                break;
        }
    }
}
