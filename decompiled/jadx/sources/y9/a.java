package y9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f10634a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f10637d;

    public a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f10635b = str;
        this.f10636c = i;
        this.f10637d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = e.newThread(new androidx.webkit.b(20, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f10635b + " Thread #" + this.f10634a.getAndIncrement());
        return threadNewThread;
    }
}
