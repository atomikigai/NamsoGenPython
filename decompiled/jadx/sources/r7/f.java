package r7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.internal.c1;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.internal.common.zzc;
import da.v;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static Boolean e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f8202f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f8203g = false;
    public static int h = -1;
    public static Boolean i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static m f8207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static n f8208n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8209a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f8204j = new ThreadLocal();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c1 f8205k = new c1(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final z9.c f8206l = new z9.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f8199b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f8200c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f8201d = new k();

    public f(Context context) {
        this.f8209a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (i0.m(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e4) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e4.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0262  */
    /* JADX WARN: Code duplicated, block: B:117:0x0268  */
    /* JADX WARN: Code duplicated, block: B:120:0x0271  */
    /* JADX WARN: Code duplicated, block: B:125:0x0282 A[Catch: all -> 0x0085, TryCatch #5 {all -> 0x0085, blocks: (B:7:0x004b, B:11:0x007f, B:18:0x008b, B:21:0x0091, B:24:0x00a5, B:102:0x020d, B:103:0x0217, B:106:0x021a, B:107:0x021b, B:108:0x0222, B:125:0x0282, B:126:0x0293, B:109:0x0223, B:111:0x0241, B:113:0x024e, B:123:0x027a, B:124:0x0281, B:127:0x0294, B:128:0x02c0), top: B:148:0x004b, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0091 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #5 {all -> 0x0085, blocks: (B:7:0x004b, B:11:0x007f, B:18:0x008b, B:21:0x0091, B:24:0x00a5, B:102:0x020d, B:103:0x0217, B:106:0x021a, B:107:0x021b, B:108:0x0222, B:125:0x0282, B:126:0x0293, B:109:0x0223, B:111:0x0241, B:113:0x024e, B:123:0x027a, B:124:0x0281, B:127:0x0294, B:128:0x02c0), top: B:148:0x004b, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0 A[Catch: all -> 0x0201, TryCatch #1 {, blocks: (B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a), top: B:144:0x00aa, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TRY_ENTER, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TRY_ENTER, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0159 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0164 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0183 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0196 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x019e A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01af A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01b9 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01ca A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01e0 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01e9 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f1 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f9 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c, B:36:0x00d8, B:37:0x00da, B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a, B:45:0x00f8, B:49:0x00ff), top: B:151:0x00a9, inners: #0, #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0203 A[Catch: all -> 0x0201, TRY_ENTER, TryCatch #1 {, blocks: (B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a), top: B:144:0x00aa, outer: #8 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:125:0x0282, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00bc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x0164, please report this as an issue */
    public static f c(Context context, e eVar, String str) throws Throwable {
        long j4;
        f fVar;
        int i10;
        Boolean bool;
        m mVarH;
        int i11;
        q7.a aVarY;
        Object objI;
        f fVar2;
        l lVar;
        n nVar;
        l lVar2;
        boolean z4;
        q7.a aVarY2;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = f8204j;
        l lVar3 = (l) threadLocal.get();
        l lVar4 = new l();
        threadLocal.set(lVar4);
        c1 c1Var = f8205k;
        Long l2 = (Long) c1Var.get();
        long jLongValue = l2.longValue();
        try {
            c1Var.set(Long.valueOf(SystemClock.elapsedRealtime()));
            d dVarK = eVar.k(context, str, f8206l);
            j4 = jLongValue;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + dVarK.f8196a + " and remote module " + str + ":" + dVarK.f8197b);
                int i12 = dVarK.f8198c;
                if (i12 != 0) {
                    if (i12 != -1) {
                        if (i12 == 1 || dVarK.f8197b != 0) {
                            if (i12 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                fVar = new f(applicationContext);
                            } else {
                                if (i12 == 1) {
                                    throw new b("VersionPolicy returned invalid code:" + i12);
                                }
                                try {
                                    i10 = dVarK.f8197b;
                                    try {
                                        synchronized (f.class) {
                                            if (g(context)) {
                                                throw new b("Remote loading disabled");
                                            }
                                            bool = e;
                                        }
                                        if (bool != null) {
                                            throw new b("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                            synchronized (f.class) {
                                                nVar = f8208n;
                                            }
                                            if (nVar != null) {
                                                throw new b("DynamiteLoaderV2 was not cached.");
                                            }
                                            lVar2 = (l) threadLocal.get();
                                            if (lVar2 != null || lVar2.f8213a == null) {
                                                throw new b("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = lVar2.f8213a;
                                            new q7.b(null);
                                            synchronized (f.class) {
                                                z4 = h >= 2;
                                            }
                                            if (z4) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                aVarY2 = nVar.I(new q7.b(applicationContext2), str, i10, new q7.b(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                aVarY2 = nVar.y(new q7.b(applicationContext2), str, i10, new q7.b(cursor2));
                                            }
                                            Context context2 = (Context) q7.b.I(aVarY2);
                                            if (context2 == null) {
                                                throw new b("Failed to get module context");
                                            }
                                            fVar2 = new f(context2);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                            mVarH = h(context);
                                            if (mVarH != null) {
                                                throw new b("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel parcelZzB = mVarH.zzB(6, mVarH.zza());
                                            i11 = parcelZzB.readInt();
                                            parcelZzB.recycle();
                                            if (i11 >= 3) {
                                                lVar = (l) threadLocal.get();
                                                if (lVar != null) {
                                                    throw new b("No cached result cursor holder");
                                                }
                                                aVarY = mVarH.I(new q7.b(context), str, i10, new q7.b(lVar.f8213a));
                                            } else if (i11 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                aVarY = mVarH.J(new q7.b(context), str, i10);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                aVarY = mVarH.y(new q7.b(context), str, i10);
                                            }
                                            objI = q7.b.I(aVarY);
                                            if (objI != null) {
                                                throw new b("Failed to load remote module.");
                                            }
                                            fVar2 = new f((Context) objI);
                                        }
                                        fVar = fVar2;
                                    } catch (RemoteException e4) {
                                        throw new b("Failed to load remote module.", e4);
                                    } catch (b e10) {
                                        throw e10;
                                    } catch (Throwable th) {
                                        n7.c.a(context, th);
                                        throw new b("Failed to load remote module.", th);
                                    }
                                } catch (b e11) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e11.getMessage());
                                    int i13 = dVarK.f8196a;
                                    if (i13 == 0 || eVar.k(context, str, new t2.m(i13)).f8198c != -1) {
                                        throw new b("Remote load failed. No local fallback found.", e11);
                                    }
                                    Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                    fVar = new f(applicationContext);
                                }
                            }
                            if (j4 == 0) {
                                f8205k.remove();
                            } else {
                                f8205k.set(l2);
                            }
                            cursor = lVar4.f8213a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            f8204j.set(lVar3);
                            return fVar;
                        }
                    } else if (dVarK.f8196a != 0) {
                        i12 = -1;
                        if (i12 == 1) {
                        }
                        if (i12 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            fVar = new f(applicationContext);
                        } else {
                            if (i12 == 1) {
                                throw new b("VersionPolicy returned invalid code:" + i12);
                            }
                            i10 = dVarK.f8197b;
                            synchronized (f.class) {
                                if (g(context)) {
                                    throw new b("Remote loading disabled");
                                }
                                bool = e;
                                if (bool != null) {
                                    throw new b("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                    synchronized (f.class) {
                                        nVar = f8208n;
                                        if (nVar != null) {
                                            throw new b("DynamiteLoaderV2 was not cached.");
                                        }
                                        lVar2 = (l) threadLocal.get();
                                        if (lVar2 != null) {
                                        }
                                        throw new b("No result cursor");
                                    }
                                }
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                mVarH = h(context);
                                if (mVarH != null) {
                                    throw new b("Failed to create IDynamiteLoader.");
                                }
                                Parcel parcelZzB2 = mVarH.zzB(6, mVarH.zza());
                                i11 = parcelZzB2.readInt();
                                parcelZzB2.recycle();
                                if (i11 >= 3) {
                                    lVar = (l) threadLocal.get();
                                    if (lVar != null) {
                                        throw new b("No cached result cursor holder");
                                    }
                                    aVarY = mVarH.I(new q7.b(context), str, i10, new q7.b(lVar.f8213a));
                                } else if (i11 == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    aVarY = mVarH.J(new q7.b(context), str, i10);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    aVarY = mVarH.y(new q7.b(context), str, i10);
                                }
                                objI = q7.b.I(aVarY);
                                if (objI != null) {
                                    throw new b("Failed to load remote module.");
                                }
                                fVar2 = new f((Context) objI);
                                fVar = fVar2;
                            }
                        }
                        if (j4 == 0) {
                            f8205k.remove();
                        } else {
                            f8205k.set(l2);
                        }
                        cursor = lVar4.f8213a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f8204j.set(lVar3);
                        return fVar;
                    }
                }
                throw new b("No acceptable module " + str + " found. Local version is " + dVarK.f8196a + " and remote version is " + dVarK.f8197b + ".");
            } catch (Throwable th2) {
                th = th2;
                if (j4 == 0) {
                    f8205k.remove();
                } else {
                    f8205k.set(l2);
                }
                Cursor cursor3 = lVar4.f8213a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f8204j.set(lVar3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j4 = jLongValue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af A[Catch: all -> 0x0037, TryCatch #9 {all -> 0x0037, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b8, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x004f, B:27:0x0053, B:30:0x005c, B:32:0x0064, B:35:0x006b, B:42:0x0097, B:43:0x009f, B:38:0x0072, B:40:0x0078, B:41:0x0089, B:46:0x00a2, B:49:0x00a5, B:50:0x00af, B:17:0x003f), top: B:143:0x0027, inners: #5 }] */
    public static int d(Context context, String str, boolean z4) {
        Throwable th;
        RemoteException e4;
        int i10;
        Cursor cursor;
        try {
            synchronized (f.class) {
                Boolean bool = e;
                boolean z10 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        f(classLoader);
                                    } catch (b unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!g(context)) {
                                        return 0;
                                    }
                                    if (f8203g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iE = e(context, str, z4, true);
                                                String str2 = f8202f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderI = g.I();
                                                    if (classLoaderI == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            a.b();
                                                            String str3 = f8202f;
                                                            i0.i(str3);
                                                            classLoaderI = a.a(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f8202f;
                                                            i0.i(str4);
                                                            classLoaderI = new h(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    f(classLoaderI);
                                                    declaredField.set(null, classLoaderI);
                                                    e = bool2;
                                                    return iE;
                                                }
                                                return iE;
                                            } catch (b unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e10.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z4, false);
                    } catch (b e11) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e11.getMessage());
                        return 0;
                    }
                }
                m mVarH = h(context);
                try {
                    if (mVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelZzB = mVarH.zzB(6, mVarH.zza());
                        int i11 = parcelZzB.readInt();
                        parcelZzB.recycle();
                        if (i11 >= 3) {
                            ThreadLocal threadLocal = f8204j;
                            l lVar = (l) threadLocal.get();
                            if (lVar != null && (cursor = lVar.f8213a) != null) {
                                return cursor.getInt(0);
                            }
                            q7.b bVar = new q7.b(context);
                            long jLongValue = ((Long) f8205k.get()).longValue();
                            Parcel parcelZza = mVarH.zza();
                            zzc.zze(parcelZza, bVar);
                            parcelZza.writeString(str);
                            parcelZza.writeInt(z4 ? 1 : 0);
                            parcelZza.writeLong(jLongValue);
                            Cursor cursor3 = (Cursor) q7.b.I(v.o(mVarH.zzB(7, parcelZza)));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i10 = cursor3.getInt(0);
                                        if (i10 > 0) {
                                            l lVar2 = (l) threadLocal.get();
                                            if (lVar2 == null || lVar2.f8213a != null) {
                                                z10 = false;
                                            } else {
                                                lVar2.f8213a = cursor3;
                                            }
                                            cursor2 = z10 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e12) {
                                    e4 = e12;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i11 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            q7.b bVar2 = new q7.b(context);
                            Parcel parcelZza2 = mVarH.zza();
                            zzc.zze(parcelZza2, bVar2);
                            parcelZza2.writeString(str);
                            parcelZza2.writeInt(z4 ? 1 : 0);
                            Parcel parcelZzB2 = mVarH.zzB(5, parcelZza2);
                            i10 = parcelZzB2.readInt();
                            parcelZzB2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            q7.b bVar3 = new q7.b(context);
                            Parcel parcelZza3 = mVarH.zza();
                            zzc.zze(parcelZza3, bVar3);
                            parcelZza3.writeString(str);
                            parcelZza3.writeInt(z4 ? 1 : 0);
                            Parcel parcelZzB3 = mVarH.zzB(3, parcelZza3);
                            i10 = parcelZzB3.readInt();
                            parcelZzB3.recycle();
                        }
                        return i10;
                    } catch (RemoteException e13) {
                        e4 = e13;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            n7.c.a(context, th5);
            throw th5;
        }
    }

    public static int e(Context context, String str, boolean z4, boolean z10) throws Throwable {
        Throwable th;
        Exception exc;
        boolean z11;
        Cursor cursor = null;
        try {
            try {
                boolean z12 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z4 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f8205k.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z13 = false;
                            int i10 = cursorQuery.getInt(0);
                            if (i10 > 0) {
                                synchronized (f.class) {
                                    try {
                                        f8202f = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            h = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z11 = cursorQuery.getInt(columnIndex2) != 0;
                                            f8203g = z11;
                                        } else {
                                            z11 = false;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                l lVar = (l) f8204j.get();
                                if (lVar == null || lVar.f8213a != null) {
                                    z12 = false;
                                } else {
                                    lVar.f8213a = cursorQuery;
                                }
                                cursor = z12 ? null : cursorQuery;
                                z13 = z11;
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z10 && z13) {
                                throw new b("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i10;
                            if (exc instanceof b) {
                                throw exc;
                            }
                            throw new b("V2 version check failed: " + exc.getMessage(), exc);
                        }
                    } catch (Exception e4) {
                        exc = e4;
                    } catch (Throwable th3) {
                        cursor = cursorQuery;
                        th = th3;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e10) {
                exc = e10;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void f(ClassLoader classLoader) throws b {
        try {
            n nVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f8208n = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e4) {
            throw new b("Failed to instantiate dynamite loader", e4);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(i)) {
            return true;
        }
        boolean z4 = false;
        if (i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (g7.f.f4241b.d(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z4 = true;
            }
            i = Boolean.valueOf(z4);
            if (z4 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f8203g = true;
            }
        }
        if (!z4) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z4;
    }

    public static m h(Context context) {
        m mVar;
        synchronized (f.class) {
            m mVar2 = f8207m;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (mVar != null) {
                    f8207m = mVar;
                    return mVar;
                }
            } catch (Exception e4) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e4.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws b {
        try {
            return (IBinder) this.f8209a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e4) {
            throw new b("Failed to instantiate module class: ".concat(str), e4);
        }
    }
}
