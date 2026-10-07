package j5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbbs;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import k5.d;
import k5.f;
import k5.g;
import k5.h;
import k5.i;
import k5.j;
import k5.k;
import k5.l;
import k5.n;
import k5.o;
import k5.q;
import k5.r;
import k5.s;
import k5.t;
import k5.u;
import k5.v;
import m5.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta.c f5695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f5696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f5698d;
    public final u5.a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u5.a f5699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5700g;

    public c(Context context, u5.a aVar, u5.a aVar2) {
        ta.e eVar = new ta.e();
        k5.c cVar = k5.c.f5996a;
        eVar.a(o.class, cVar);
        eVar.a(i.class, cVar);
        f fVar = f.f6007a;
        eVar.a(s.class, fVar);
        eVar.a(l.class, fVar);
        d dVar = d.f5998a;
        eVar.a(q.class, dVar);
        eVar.a(j.class, dVar);
        k5.b bVar = k5.b.f5986a;
        eVar.a(k5.a.class, bVar);
        eVar.a(h.class, bVar);
        k5.e eVar2 = k5.e.f6001a;
        eVar.a(r.class, eVar2);
        eVar.a(k.class, eVar2);
        g gVar = g.f6013a;
        eVar.a(v.class, gVar);
        eVar.a(n.class, gVar);
        eVar.f8669d = true;
        this.f5695a = new ta.c(eVar);
        this.f5697c = context;
        this.f5696b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5698d = b(a.f5687c);
        this.e = aVar2;
        this.f5699f = aVar;
        this.f5700g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(u3.b.b("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x010a  */
    public final l5.h a(l5.h hVar) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.f5696b.getActiveNetworkInfo();
        bd.v vVarC = hVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) vVarC.f1685g;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i));
        vVarC.b("model", Build.MODEL);
        vVarC.b("hardware", Build.HARDWARE);
        vVarC.b("device", Build.DEVICE);
        vVarC.b("product", Build.PRODUCT);
        vVarC.b("os-uild", Build.ID);
        vVarC.b("manufacturer", Build.MANUFACTURER);
        vVarC.b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / zzbbs.zzq.zzf;
        HashMap map3 = (HashMap) vVarC.f1685g;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i10 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f6045a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) vVarC.f1685g;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f6043a;
                subtype = 100;
            } else if (((t) t.f6043a.get(subtype)) == null) {
            }
            map = (HashMap) vVarC.f1685g;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            vVarC.b("country", Locale.getDefault().getCountry());
            vVarC.b("locale", Locale.getDefault().getLanguage());
            Context context = this.f5697c;
            vVarC.b("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                a.a.f(e, "CctTransportBackend", "Unable to find version code for package");
            }
            vVarC.b("application_build", Integer.toString(i10));
            return vVarC.e();
        }
        SparseArray sparseArray3 = t.f6043a;
        subtype = 0;
        map = (HashMap) vVarC.f1685g;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        vVarC.b("country", Locale.getDefault().getCountry());
        vVarC.b("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f5697c;
        vVarC.b("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i10 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        vVarC.b("application_build", Integer.toString(i10));
        return vVarC.e();
    }
}
