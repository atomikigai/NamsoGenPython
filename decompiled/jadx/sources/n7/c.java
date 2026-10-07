package n7;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import g7.i;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f7303a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f7304b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f7305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f7306d;
    public static Boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f7307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f7308g;
    public static Boolean h;

    public static void a(Context context, Throwable th) {
        try {
            i0.i(context);
        } catch (Exception e4) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e4);
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b10 : bArr) {
            char[] cArr2 = f7304b;
            cArr[i] = cArr2[(b10 & 255) >>> 4];
            cArr[i + 1] = cArr2[b10 & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public static String c(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            int i10 = (bArr[i] & 240) >>> 4;
            char[] cArr = f7303a;
            sb2.append(cArr[i10]);
            sb2.append(cArr[bArr[i] & 15]);
        }
        return sb2.toString();
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean e(Object[] objArr, g7.d dVar) {
        int length = objArr != null ? objArr.length : 0;
        for (int i = 0; i < length; i++) {
            if (i0.m(objArr[i], dVar)) {
                if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long f(InputStream inputStream, OutputStream outputStream, boolean z4) {
        byte[] bArr = new byte[1024];
        long j4 = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    break;
                }
                j4 += (long) i;
                outputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                if (z4) {
                    d(inputStream);
                    d(outputStream);
                }
                throw th;
            }
        }
        if (z4) {
            d(inputStream);
            d(outputStream);
        }
        return j4;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    public static byte[] g(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfoF = p7.c.a(context).f(64, str);
        Signature[] signatureArr = packageInfoF.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            for (int i = 0; i < 2; i++) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        if (messageDigest != null) {
                            return messageDigest.digest(packageInfoF.signatures[0].toByteArray());
                        }
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            messageDigest = null;
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoF.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean j(Context context, int i) {
        if (n(context, "com.google.android.gms", i)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                i iVarB = i.b(context);
                iVarB.getClass();
                if (packageInfo != null) {
                    if (!i.e(packageInfo, false)) {
                        if (i.e(packageInfo, true)) {
                            if (!g7.h.a((Context) iVarB.f4247a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean k(Context context) {
        if (e == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z4 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z4 = true;
            }
            e = Boolean.valueOf(z4);
        }
        return e.booleanValue();
    }

    public static boolean l(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f7305c == null) {
            f7305c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f7305c.booleanValue();
        if (p(context)) {
            return !h() || i();
        }
        return false;
    }

    public static byte[] m(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i = 0;
        while (i < length) {
            int i10 = i + 2;
            bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i10), 16);
            i = i10;
        }
        return bArr;
    }

    public static boolean n(Context context, String str, int i) {
        p7.b bVarA = p7.c.a(context);
        bVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) bVarA.f7823a).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static void o(StringBuilder sb2, HashMap map) {
        sb2.append("{");
        boolean z4 = true;
        for (String str : map.keySet()) {
            if (!z4) {
                sb2.append(",");
            }
            String str2 = (String) map.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z4 = false;
        }
        sb2.append("}");
    }

    public static boolean p(Context context) {
        if (f7306d == null) {
            f7306d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f7306d.booleanValue();
    }
}
