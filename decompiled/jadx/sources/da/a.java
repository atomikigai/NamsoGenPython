package da;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3085d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3087g;
    public final aa.c h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, aa.c cVar) {
        this.f3082a = str;
        this.f3083b = str2;
        this.f3084c = arrayList;
        this.f3085d = str3;
        this.e = str4;
        this.f3086f = str5;
        this.f3087g = str6;
        this.h = cVar;
    }

    public static a a(Context context, z zVar, String str, String str2, ArrayList arrayList, aa.c cVar) {
        String packageName = context.getPackageName();
        String strC = zVar.c();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, arrayList, strC, packageName, string, str3, cVar);
    }
}
