package e6;

import android.os.RemoteException;
import app.namso_gen.spacehowen.MainActivity;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzboy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 {
    public static t2 h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k1 f3445f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3441a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3443c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3444d = false;
    public final Object e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w5.s f3446g = new w5.s(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3442b = new ArrayList();

    static {
        new HashSet(Arrays.asList(w5.b.APP_OPEN_AD, w5.b.INTERSTITIAL, w5.b.REWARDED));
    }

    public static zzbly a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzblp zzblpVar = (zzblp) it.next();
            map.put(zzblpVar.zza, new zzblx(zzblpVar.zzb ? c6.a.f1780b : c6.a.f1779a, zzblpVar.zzd, zzblpVar.zzc));
        }
        return new zzbly(map);
    }

    public static t2 e() {
        t2 t2Var;
        synchronized (t2.class) {
            try {
                if (h == null) {
                    h = new t2();
                }
                t2Var = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t2Var;
    }

    public final void b(MainActivity mainActivity) {
        try {
            zzboy.zza().zzb(mainActivity, null);
            this.f3445f.zzk();
            this.f3445f.zzl(null, new q7.b(null));
        } catch (RemoteException e) {
            i6.h.h("MobileAdsSettingManager initialization failed", e);
        }
    }

    public final void c(MainActivity mainActivity) {
        if (this.f3445f == null) {
            this.f3445f = (k1) new n(s.f3427f.f3429b, mainActivity).d(mainActivity, false);
        }
    }

    public final c6.b d() {
        zzbly zzblyVarA;
        synchronized (this.e) {
            try {
                com.google.android.gms.common.internal.i0.k("MobileAds.initialize() must be called prior to getting initialization status.", this.f3445f != null);
                try {
                    zzblyVarA = a(this.f3445f.zzg());
                } catch (RemoteException unused) {
                    i6.h.d("Unable to get Initialization status.");
                    return new wa.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblyVarA;
    }
}
