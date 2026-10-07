package y9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f10642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f10643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f10644d;
    public final /* synthetic */ long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f10645f;

    public /* synthetic */ c(f fVar, Runnable runnable, long j4, long j10, TimeUnit timeUnit, int i) {
        this.f10641a = i;
        this.f10642b = fVar;
        this.f10643c = runnable;
        this.f10644d = j4;
        this.e = j10;
        this.f10645f = timeUnit;
    }

    @Override // y9.g
    public final ScheduledFuture a(ta.c cVar) {
        switch (this.f10641a) {
            case 0:
                f fVar = this.f10642b;
                return fVar.f10654b.scheduleAtFixedRate(new d(fVar, this.f10643c, cVar, 0), this.f10644d, this.e, this.f10645f);
            default:
                f fVar2 = this.f10642b;
                return fVar2.f10654b.scheduleWithFixedDelay(new d(fVar2, this.f10643c, cVar, 2), this.f10644d, this.e, this.f10645f);
        }
    }
}
