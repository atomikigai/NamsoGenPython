package v1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t.k f9141a = new t.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f9142b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static r7.i f9143c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? j.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static r7.i b() {
        r7.i iVar = new r7.i();
        f9143c = iVar;
        f9141a.i(iVar);
        return f9143c;
    }

    public static void c(Context context, boolean z4) {
        k kVarA;
        int i;
        if (z4 || f9143c == null) {
            synchronized (f9142b) {
                if (!z4) {
                    try {
                        if (f9143c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28 && i10 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i11 = 0;
                    boolean z10 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z11 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                kVarA = k.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            kVarA = null;
                        }
                        if (kVarA != null && kVarA.f9139c == jA && (i = kVarA.f9138b) != 2) {
                            i11 = i;
                        } else if (z10) {
                            i11 = 1;
                        } else if (z11) {
                            i11 = 2;
                        }
                        if (z4 && z11 && i11 != 1) {
                            i11 = 2;
                        }
                        if (kVarA != null && kVarA.f9138b == 2 && i11 == 1 && length < kVarA.f9140d) {
                            i11 = 3;
                        }
                        k kVar = new k(1, i11, jA, length2);
                        if (kVarA == null || !kVarA.equals(kVar)) {
                            try {
                                kVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
