package n0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import bd.u;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r.j;
import r.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f7140a = new j(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f7141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f7143d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new i(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f7141b = threadPoolExecutor;
        f7142c = new Object();
        f7143d = new k(0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[EDGE_INSN: B:10:0x0020->B:24:0x003d BREAK  A[LOOP:0: B:17:0x002d->B:23:0x003a]] */
    public static e a(String str, Context context, u uVar, int i) {
        j jVar = f7140a;
        Typeface typeface = (Typeface) jVar.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            ea.j jVarA = b.a(context, uVar);
            g[] gVarArr = (g[]) jVarA.f3530b;
            int i10 = jVarA.f3529a;
            int i11 = 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    i11 = -3;
                    break;
                }
                i11 = -2;
            } else if (gVarArr != null && gVarArr.length != 0) {
                i11 = 0;
                for (g gVar : gVarArr) {
                    int i12 = gVar.e;
                    if (i12 != 0) {
                        if (i12 >= 0) {
                            i11 = i12;
                            break;
                        }
                        i11 = -3;
                        break;
                    }
                }
            }
            if (i11 != 0) {
                return new e(i11);
            }
            Typeface typefaceK = h0.g.f4552a.k(context, gVarArr, i);
            if (typefaceK == null) {
                return new e(-3);
            }
            jVar.put(str, typefaceK);
            return new e(typefaceK);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }
}
