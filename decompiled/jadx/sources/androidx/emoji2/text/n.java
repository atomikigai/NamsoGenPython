package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends jd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jd.l f782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f783b;

    public n(jd.l lVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f782a = lVar;
        this.f783b = threadPoolExecutor;
    }

    @Override // jd.l
    public final void r(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f783b;
        try {
            this.f782a.r(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // jd.l
    public final void s(a3.j jVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f783b;
        try {
            this.f782a.s(jVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
