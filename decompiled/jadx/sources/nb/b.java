package nb;

import a2.l;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import fa.c1;
import h3.s;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import jc.i;
import rc.b0;
import rc.x;
import ub.k;
import vb.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za.d f7376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f7377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f7378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zc.d f7379d = zc.e.a();

    public b(x xVar, za.d dVar, lb.b bVar, l lVar, z0.f fVar) {
        this.f7376a = dVar;
        this.f7377b = lVar;
        this.f7378c = new h(fVar);
    }

    public static String a(String str) {
        Pattern patternCompile = Pattern.compile("/");
        i.d(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        i.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:21:0x004c, B:42:0x00a9, B:44:0x00ad, B:47:0x00b8, B:35:0x0082, B:39:0x008e), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8 A[Catch: all -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:21:0x004c, B:42:0x00a9, B:44:0x00ad, B:47:0x00b8, B:35:0x0082, B:39:0x008e), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0138  */
    /* JADX WARN: Code duplicated, block: B:53:0x013c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    public final Object b(yb.d dVar) throws Throwable {
        a aVar;
        zc.a aVar2;
        zc.a aVar3;
        b bVar;
        String str;
        Object objY;
        zc.a aVar4;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, (ac.c) dVar);
            }
        } else {
            aVar = new a(this, (ac.c) dVar);
        }
        Object objF = aVar.f7374c;
        zb.a aVar5 = zb.a.f11555a;
        ?? r10 = aVar.e;
        int i10 = 2;
        k kVar = k.f9073a;
        yb.d dVar2 = null;
        try {
            if (r10 == 0) {
                r7.g.G(objF);
                zc.d dVar3 = this.f7379d;
                if (!dVar3.e() && !this.f7378c.b()) {
                    return kVar;
                }
                aVar.f7372a = this;
                aVar.f7373b = dVar3;
                aVar.e = 1;
                if (dVar3.c(aVar) != aVar5) {
                    aVar3 = dVar3;
                    bVar = this;
                }
                return aVar5;
            }
            if (r10 == 1) {
                aVar3 = aVar.f7373b;
                bVar = (b) aVar.f7372a;
                r7.g.G(objF);
            } else {
                if (r10 == 2) {
                    aVar3 = aVar.f7373b;
                    bVar = (b) aVar.f7372a;
                    r7.g.G(objF);
                    str = (String) objF;
                    if (str == null) {
                        Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        aVar3.d(null);
                        return kVar;
                    }
                    ub.f fVar = new ub.f("X-Crashlytics-Installation-ID", str);
                    String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                    bVar.getClass();
                    ub.f fVar2 = new ub.f("X-Crashlytics-Device-Model", a(str2));
                    String str3 = Build.VERSION.INCREMENTAL;
                    i.d(str3, "INCREMENTAL");
                    ub.f fVar3 = new ub.f("X-Crashlytics-OS-Build-Version", a(str3));
                    String str4 = Build.VERSION.RELEASE;
                    i.d(str4, "RELEASE");
                    Map mapB = t.B(fVar, fVar2, fVar3, new ub.f("X-Crashlytics-OS-Display-Version", a(str4)), new ub.f("X-Crashlytics-API-Client-Version", "1.0.2"));
                    l lVar = bVar.f7377b;
                    s sVar = new s(bVar, null);
                    k3.g gVar = new k3.g(i10, dVar2, 3);
                    aVar.f7372a = aVar3;
                    aVar.f7373b = null;
                    aVar.e = 3;
                    objY = b0.y((x) lVar.f44c, new s(lVar, mapB, sVar, gVar, null), aVar);
                    if (objY != aVar5) {
                        objY = kVar;
                    }
                    if (objY != aVar5) {
                        aVar4 = aVar3;
                    }
                    return aVar5;
                }
                if (r10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (zc.a) aVar.f7372a;
                try {
                    r7.g.G(objF);
                    aVar4 = aVar2;
                } catch (Throwable th) {
                    th = th;
                    aVar2.d(null);
                    throw th;
                }
            }
            aVar4.d(null);
            return kVar;
            if (!bVar.f7378c.b()) {
                aVar3.d(null);
                return kVar;
            }
            Task taskC = ((za.c) bVar.f7376a).c();
            i.d(taskC, "firebaseInstallationsApi.id");
            aVar.f7372a = bVar;
            aVar.f7373b = aVar3;
            aVar.e = 2;
            objF = c1.f(taskC, aVar);
            if (objF != aVar5) {
                str = (String) objF;
                if (str == null) {
                    Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    aVar3.d(null);
                    return kVar;
                }
                ub.f fVar4 = new ub.f("X-Crashlytics-Installation-ID", str);
                String str5 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                bVar.getClass();
                ub.f fVar5 = new ub.f("X-Crashlytics-Device-Model", a(str5));
                String str6 = Build.VERSION.INCREMENTAL;
                i.d(str6, "INCREMENTAL");
                ub.f fVar6 = new ub.f("X-Crashlytics-OS-Build-Version", a(str6));
                String str7 = Build.VERSION.RELEASE;
                i.d(str7, "RELEASE");
                Map mapB2 = t.B(fVar4, fVar5, fVar6, new ub.f("X-Crashlytics-OS-Display-Version", a(str7)), new ub.f("X-Crashlytics-API-Client-Version", "1.0.2"));
                l lVar2 = bVar.f7377b;
                s sVar2 = new s(bVar, null);
                k3.g gVar2 = new k3.g(i10, dVar2, 3);
                aVar.f7372a = aVar3;
                aVar.f7373b = null;
                aVar.e = 3;
                objY = b0.y((x) lVar2.f44c, new s(lVar2, mapB2, sVar2, gVar2, null), aVar);
                if (objY != aVar5) {
                    objY = kVar;
                }
                if (objY != aVar5) {
                    aVar4 = aVar3;
                    aVar4.d(null);
                    return kVar;
                }
            }
            return aVar5;
        } catch (Throwable th2) {
            th = th2;
            aVar2 = r10;
        }
    }
}
