package e6;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3 f3389a = new p3();

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f3  */
    public static o3 a(Context context, o2 o2Var) {
        boolean z4;
        String str;
        String className;
        o2Var.getClass();
        Set set = o2Var.f3365b;
        List listUnmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        w5.s sVar = t2.e().f3446g;
        i6.d dVar = s.f3427f.f3428a;
        Set set2 = o2Var.e;
        String strP = i6.d.p(context);
        int i = 0;
        if (set2.contains(strP)) {
            z4 = true;
        } else {
            sVar.getClass();
            if (new ArrayList(sVar.f9667a).contains(strP)) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        Bundle bundle = o2Var.f3366c.getBundle(AdMobAdapter.class.getName());
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            while (true) {
                int i10 = i + 1;
                if (i10 >= stackTrace.length) {
                    className = null;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                String className2 = stackTraceElement.getClassName();
                if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (i6.d.f5220c.equalsIgnoreCase(className2) || i6.d.f5221d.equalsIgnoreCase(className2) || i6.d.e.equalsIgnoreCase(className2) || i6.d.f5222f.equalsIgnoreCase(className2) || i6.d.f5223g.equalsIgnoreCase(className2) || i6.d.h.equalsIgnoreCase(className2))) {
                    className = stackTrace[i10].getClassName();
                    break;
                }
                i = i10;
            }
            if (packageName != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");
                StringBuilder sb2 = new StringBuilder();
                if (stringTokenizer.hasMoreElements()) {
                    sb2.append(stringTokenizer.nextToken());
                    for (int i11 = 2; i11 > 0 && stringTokenizer.hasMoreElements(); i11--) {
                        sb2.append(".");
                        sb2.append(stringTokenizer.nextToken());
                    }
                    packageName = sb2.toString();
                }
                if (className == null || className.contains(packageName)) {
                    className = null;
                }
            } else {
                className = null;
            }
            str = className;
        } else {
            str = null;
        }
        boolean z10 = o2Var.h;
        w5.s sVar2 = t2.e().f3446g;
        int i12 = o2Var.f3367d;
        sVar2.getClass();
        return new o3(8, -1L, bundle, -1, listUnmodifiableList, z4, Math.max(i12, -1), false, null, null, null, null, o2Var.f3366c, o2Var.f3368f, Collections.unmodifiableList(new ArrayList(o2Var.f3369g)), null, str, z10, null, -1, (String) Collections.max(Arrays.asList(null, ""), new b0.h(5)), new ArrayList(o2Var.f3364a), o2Var.i, null, u.e.d(1), o2Var.f3370j);
    }
}
