package q3;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f8023c = q.f8026a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8024a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8025b = false;

    public final synchronized void a(String str, long j4) {
        if (this.f8025b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f8024a.add(new o(str, j4, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j4;
        this.f8025b = true;
        ArrayList arrayList = this.f8024a;
        int i = 0;
        if (arrayList.size() == 0) {
            j4 = 0;
        } else {
            j4 = ((o) arrayList.get(arrayList.size() - 1)).f8022c - ((o) arrayList.get(0)).f8022c;
        }
        if (j4 <= 0) {
            return;
        }
        long j10 = ((o) this.f8024a.get(0)).f8022c;
        q.b("(%-4d ms) %s", Long.valueOf(j4), str);
        ArrayList arrayList2 = this.f8024a;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            o oVar = (o) obj;
            long j11 = oVar.f8022c;
            q.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(oVar.f8021b), oVar.f8020a);
            j10 = j11;
        }
    }

    public final void finalize() {
        if (this.f8025b) {
            return;
        }
        b("Request on the loose");
        q.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
