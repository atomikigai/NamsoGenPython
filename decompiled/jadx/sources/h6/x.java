package h6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaox;
import com.google.android.gms.internal.ads.zzaps;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzbcn;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static zzaps f5091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f5092b = new Object();

    public x(Context context) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f5092b) {
            try {
                if (f5091a == null) {
                    zzbcn.zza(context);
                    f5091a = ((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzev)).booleanValue() ? n.a(context) : zzaqw.zza(context, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static v a(int i, String str, HashMap map, byte[] bArr) {
        v vVar = new v();
        aa.c cVar = new aa.c(29, str, vVar);
        i6.g gVar = new i6.g();
        u uVar = new u(i, str, vVar, cVar, bArr, map, gVar);
        if (i6.g.c()) {
            try {
                Map mapZzl = uVar.zzl();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (i6.g.c()) {
                    gVar.d("onNetworkRequest", new a3.j(str, "GET", mapZzl, bArr2));
                }
            } catch (zzaox e) {
                i6.h.g(e.getMessage());
            }
        }
        f5091a.zza(uVar);
        return vVar;
    }
}
