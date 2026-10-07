package cd;

import java.util.concurrent.ThreadFactory;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1821b;

    public /* synthetic */ a(String str, boolean z4) {
        this.f1820a = str;
        this.f1821b = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f1820a;
        i.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f1821b);
        return thread;
    }
}
