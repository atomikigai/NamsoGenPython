package x3;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p4.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Bitmap.Config f10276u = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f10277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f10278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7.k f10279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10280d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10281f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10284t;

    public g(long j4) {
        k kVar = new k();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f10280d = j4;
        this.f10277a = kVar;
        this.f10278b = setUnmodifiableSet;
        this.f10279c = new r7.k();
    }

    @Override // x3.a
    public final Bitmap a(int i, int i10, Bitmap.Config config) {
        Bitmap bitmapD = d(i, i10, config);
        if (bitmapD != null) {
            return bitmapD;
        }
        if (config == null) {
            config = f10276u;
        }
        return Bitmap.createBitmap(i, i10, config);
    }

    public final void b() {
        Log.v("LruBitmapPool", "Hits=" + this.f10281f + ", misses=" + this.f10282r + ", puts=" + this.f10283s + ", evictions=" + this.f10284t + ", currentSize=" + this.e + ", maxSize=" + this.f10280d + "\nStrategy=" + this.f10277a);
    }

    @Override // x3.a
    public final synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f10277a.getClass();
                if (n.c(bitmap) <= this.f10280d && this.f10278b.contains(bitmap.getConfig())) {
                    this.f10277a.getClass();
                    int iC = n.c(bitmap);
                    this.f10277a.e(bitmap);
                    this.f10279c.getClass();
                    this.f10283s++;
                    this.e += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder("Put bitmap in pool=");
                        this.f10277a.getClass();
                        sb2.append(k.c(n.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        b();
                    }
                    e(this.f10280d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f10277a.getClass();
                sb3.append(k.c(n.c(bitmap), bitmap.getConfig()));
                sb3.append(", is mutable: ");
                sb3.append(bitmap.isMutable());
                sb3.append(", is allowed config: ");
                sb3.append(this.f10278b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb3.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Bitmap d(int i, int i10, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f10277a.b(i, i10, config != null ? config : f10276u);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder("Missing bitmap=");
                    this.f10277a.getClass();
                    sb2.append(k.c(n.d(config) * i * i10, config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.f10282r++;
            } else {
                this.f10281f++;
                long j4 = this.e;
                this.f10277a.getClass();
                this.e = j4 - ((long) n.c(bitmapB));
                this.f10279c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Get bitmap=");
                this.f10277a.getClass();
                sb3.append(k.c(n.d(config) * i * i10, config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void e(long j4) {
        while (this.e > j4) {
            try {
                k kVar = this.f10277a;
                Bitmap bitmap = (Bitmap) kVar.f10293b.A();
                if (bitmap != null) {
                    kVar.a(Integer.valueOf(n.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        b();
                    }
                    this.e = 0L;
                    return;
                }
                this.f10279c.getClass();
                long j10 = this.e;
                this.f10277a.getClass();
                this.e = j10 - ((long) n.c(bitmap));
                this.f10284t++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Evicting bitmap=");
                    this.f10277a.getClass();
                    sb2.append(k.c(n.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    b();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // x3.a
    public final Bitmap h(int i, int i10, Bitmap.Config config) {
        Bitmap bitmapD = d(i, i10, config);
        if (bitmapD != null) {
            bitmapD.eraseColor(0);
            return bitmapD;
        }
        if (config == null) {
            config = f10276u;
        }
        return Bitmap.createBitmap(i, i10, config);
    }

    @Override // x3.a
    public final void j(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            l();
        } else if (i >= 20 || i == 15) {
            e(this.f10280d / 2);
        }
    }

    @Override // x3.a
    public final void l() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        e(0L);
    }
}
