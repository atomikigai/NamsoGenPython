package h6;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4987a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4988b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4989c;

    public f0(Context context) {
        this.f4989c = context;
    }

    public final void a() {
        zzbce zzbceVar = zzbcn.zzkb;
        e6.t tVar = e6.t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            r0 r0Var = d6.p.C.f2979c;
            HashMap mapH = r0.H((String) tVar.f3440c.zza(zzbcn.zzkg));
            for (String str : mapH.keySet()) {
                synchronized (this) {
                    try {
                        if (!this.f4987a.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f4989c) : this.f4989c.getSharedPreferences(str, 0);
                            e0 e0Var = new e0(this, str);
                            this.f4987a.put(str, e0Var);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(e0Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            d0 d0Var = new d0(mapH);
            synchronized (this) {
                this.f4988b.add(d0Var);
            }
        }
    }
}
