package d4;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f2900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final File f2901g;
    public static volatile u h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2904c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f2905d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2902a = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        e = i < 29;
        f2900f = i >= 28;
        f2901g = new File("/proc/self/fd");
    }

    public static u a() {
        if (h == null) {
            synchronized (u.class) {
                try {
                    if (h == null) {
                        h = new u();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f2902a;
    }

    public final boolean c(int i, int i10, boolean z4, boolean z10) {
        boolean z11;
        if (z4) {
            if (f2900f) {
                if (!e || this.f2905d.get()) {
                    if (z10) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i >= 0 && i10 >= 0) {
                        synchronized (this) {
                            try {
                                int i11 = this.f2903b + 1;
                                this.f2903b = i11;
                                if (i11 >= 50) {
                                    this.f2903b = 0;
                                    int length = f2901g.list().length;
                                    long jB = b();
                                    boolean z12 = ((long) length) < jB;
                                    this.f2904c = z12;
                                    if (!z12 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jB);
                                    }
                                }
                                z11 = this.f2904c;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z11) {
                            return true;
                        }
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                            return false;
                        }
                    } else if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
                    }
                } else if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }
}
