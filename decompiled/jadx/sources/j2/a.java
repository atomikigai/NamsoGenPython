package j2;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final HashMap e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f5639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f5640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f5641d;

    public a(String str, File file, boolean z4) {
        Lock lock;
        this.f5638a = z4;
        this.f5639b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5640c = lock;
    }

    public final void a(boolean z4) {
        this.f5640c.lock();
        if (z4) {
            File file = this.f5639b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f5641d = channel;
            } catch (IOException e4) {
                this.f5641d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e4);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f5641d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f5640c.unlock();
    }
}
